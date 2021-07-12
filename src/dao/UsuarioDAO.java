package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Usuario;

public class UsuarioDAO {

	public static void main(String[] args) {
		Usuario usuario = new UsuarioDAO().consultaUsuario("Paschoal", "Paschoal");
		System.out.println(usuario);
	}

	public Usuario consultaUsuario(String nome, String senha) {
		
		Connection con;
		Usuario usuario = null;
		try {
			con = ConexaoDAO.getInstance().getConnection();

			String sql = "SELECT * FROM usuario"
					+ " WHERE nome like '" + nome + "'"
					+ " and senha like '" + senha + "';";
			
			Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);

	        while(rs.next()) {
	        	usuario = new Usuario();
	        	usuario.setIdentificador(rs.getInt(1));
	        	usuario.setNome(rs.getString(2));
	        	usuario.setSenha(rs.getString(3));    
	        }
	        
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			return usuario;
		}
	}
}
