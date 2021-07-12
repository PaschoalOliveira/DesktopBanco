package service;

import java.util.HashMap;

import models.Usuario;

public class LoginService {

	HashMap<String,String> simuladorBancoDeDados = new HashMap<String,String>();
	
	public LoginService() {
		simuladorBancoDeDados.put("FERNANDO", "123456");
		simuladorBancoDeDados.put("XAVIER", "123");
		simuladorBancoDeDados.put("ULISSES", "4");
	}
	
	public Boolean verificaLogin(Usuario usuario) {
		
		//Busque no banco de dados se existe na tabela usuario o usuario
		if(simuladorBancoDeDados.containsKey(usuario.getNome().toUpperCase())){
			String senhaBanco = simuladorBancoDeDados.get(usuario.getNome().toUpperCase());
			if(senhaBanco.equals(usuario.getSenha())) {
				return true;
			}
		}
		return false;
	}
}
