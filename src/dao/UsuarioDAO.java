package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

	public static void main(String[] args) {
		new UsuarioDAO().consultaUsuario(null, null);
	}

	public void consultaUsuario(String nome, String senha) {
		
		Connection con;
		try {
			con = ConexaoDAO.getInstance().getConnection();

			String sql = "SELECT * FROM aluno";
			
			Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);

	        while(rs.next()) {
	        	System.out.println(rs.getString(1));    
	            System.out.println(rs.getString(2));    
	            System.out.println(rs.getString(3));    
	            System.out.println(rs.getString(4));    
	        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
