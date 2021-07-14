package gui.frames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import models.Cliente;
import service.ClienteService;

public class FrameCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCliente;
	private JTextField txtTelefone;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtCPF;
	private JButton btnCadastrar;
	private JLabel lblDataHoje;
	private JLabel lblCotacaoDolar;

	class BtnCatastrarActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			Cliente cliente = new Cliente();
			
			cliente.setNome(txtNomeCliente.getText());
			cliente.setCpf(Integer.parseInt(txtCPF.getText()));
			cliente.setTelefone(Integer.parseInt(txtTelefone.getText()));
			
			Boolean cadastroComSucesso = false;
			ClienteService clienteService = new ClienteService();			
			
			cadastroComSucesso = clienteService.cadastraCliente(cliente);
			if(cadastroComSucesso == true) {
				JOptionPane.showMessageDialog(null,"Cliente Cadastrado com sucesso!");
				txtNomeCliente.setText("");
				txtCPF.setText("");
				txtTelefone.setText("");
			}else {
				JOptionPane.showMessageDialog(null,"Não foi possível cadastrar o usuário!");
			}
				
		}
	}

	/**
	 * Create the frame.
	 */
	public FrameCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome do Cliente");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		txtNomeCliente = new JTextField();
		GridBagConstraints gbc_txtNomeCliente = new GridBagConstraints();
		gbc_txtNomeCliente.insets = new Insets(0, 0, 5, 0);
		gbc_txtNomeCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNomeCliente.gridx = 3;
		gbc_txtNomeCliente.gridy = 1;
		contentPane.add(txtNomeCliente, gbc_txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Telefone");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 3;
		gbc_txtTelefone.gridy = 2;
		contentPane.add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		lblNewLabel_2 = new JLabel("CPF");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtCPF = new JTextField();
		GridBagConstraints gbc_txtCPF = new GridBagConstraints();
		gbc_txtCPF.insets = new Insets(0, 0, 5, 0);
		gbc_txtCPF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCPF.gridx = 3;
		gbc_txtCPF.gridy = 3;
		contentPane.add(txtCPF, gbc_txtCPF);
		txtCPF.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrar.gridx = 3;
		gbc_btnCadastrar.gridy = 5;
		contentPane.add(btnCadastrar, gbc_btnCadastrar);
		
		Date date = new Date("2021/12/12");
		lblDataHoje = new JLabel();				
		
		lblDataHoje.setText(date.toString());

		GridBagConstraints gbc_lblDataHoje = new GridBagConstraints();
		gbc_lblDataHoje.insets = new Insets(0, 0, 0, 5);
		gbc_lblDataHoje.gridx = 2;
		gbc_lblDataHoje.gridy = 8;
		contentPane.add(lblDataHoje, gbc_lblDataHoje);
		
		lblCotacaoDolar = new JLabel("");
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(5);
		df.setMaximumIntegerDigits(3);
		
		lblCotacaoDolar.setText(df.format(13141.12321312312));
		
		GridBagConstraints gbc_lblCotacaoDolar = new GridBagConstraints();
		gbc_lblCotacaoDolar.gridx = 3;
		gbc_lblCotacaoDolar.gridy = 8;
		contentPane.add(lblCotacaoDolar, gbc_lblCotacaoDolar);
		
		
		BtnCatastrarActionListener btnCatastrarActionListener = new BtnCatastrarActionListener();
		btnCadastrar.addActionListener(btnCatastrarActionListener);
	}

}
