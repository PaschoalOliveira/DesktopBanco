package service;

import java.util.HashMap;

import dao.UsuarioDAO;
import models.Usuario;

public class LoginService {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	HashMap<String,String> simuladorBancoDeDados = new HashMap<String,String>();
	
	public LoginService() {
		simuladorBancoDeDados.put("FERNANDO", "123456");
		simuladorBancoDeDados.put("XAVIER", "123");
		simuladorBancoDeDados.put("ULISSES", "4");
	}
	
	public Boolean verificaLogin(Usuario usuarioTela) {
		
		//Busque no banco de dados se existe na tabela usuario o usuario
		/*if(simuladorBancoDeDados.containsKey(usuario.getNome().toUpperCase())){
			String senhaBanco = simuladorBancoDeDados.get(usuario.getNome().toUpperCase());
			if(senhaBanco.equals(usuario.getSenha())) {
				return true;
			}
		}*/
		Usuario usuarioRetornoBanco = usuarioDAO.consultaUsuario(usuarioTela.getNome(), usuarioTela.getSenha());
		if(usuarioRetornoBanco != null) {
			return true;
		}else {
			return false;			
		}
	}
}
