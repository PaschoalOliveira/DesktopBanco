package service;

import java.sql.SQLIntegrityConstraintViolationException;

import dao.ClienteDAO;
import models.Cliente;

public class ClienteService {

	public Boolean cadastraCliente(Cliente cliente) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Boolean cadastroSucesso = false;
		try {
			cadastroSucesso = clienteDAO.cadastraCliente(cliente);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadastroSucesso;
	}
}
