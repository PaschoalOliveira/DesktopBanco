package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import models.Cliente;

public class ClienteDAO {

	public Boolean cadastraCliente(Cliente cliente) throws Exception, SQLIntegrityConstraintViolationException {
		Connection connection;
		try {
			
			connection = ConexaoDAO.getInstance().getConnection();
			
			//ConexaoDAO conexao = new ConexaoDAO();
			//connection = conexao.getConnection();
			
			String sql = "INSERT cliente (nome,cpf,telefone)" +
						 " values ('" + cliente.getNome() + "'," + 
						 "'" + cliente.getCpf() + "'," +
						 "'" + cliente.getTelefone() + "'" +
						 ")";
			
			Statement statement;
			statement = connection.createStatement();
			statement.execute(sql);
			
			Cliente cliente2 = null;
			if(cliente2 == null) {
				throw new Exception("Cliente Nulo");
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			System.out.println("teste");
		}
		return true;
		
	}
}
