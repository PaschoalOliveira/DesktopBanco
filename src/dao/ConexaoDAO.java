package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

	private static ConexaoDAO conexaoDAO;
	private Connection connection;
	
	public ConexaoDAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://sql435.main-hosting.eu:3306/u590093429_treinamento","u590093429_treinamento","Treinamento123");
		
	}
	public static ConexaoDAO getInstance() throws ClassNotFoundException, SQLException {
		if(conexaoDAO == null) {
			return new ConexaoDAO();
		}else {
			return conexaoDAO;
		}
	}
	
	public Connection getConnection(){
		return this.connection;
	}
}
