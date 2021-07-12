package gui.frames;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import models.Usuario;
import service.LoginService;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtSenha;
	private JButton btnEntrar;
	
	class BtnEntrarListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String nomeUsuario = txtUsuario.getText();
			String senha = txtSenha.getText();

			Usuario usuario = new Usuario();
			usuario.setNome(txtUsuario.getText());
			usuario.setSenha(txtSenha.getText());

			LoginService loginService = new LoginService();
			
			Boolean logado = loginService.verificaLogin(usuario);
			
			if(logado == true) {
				setVisible(false);
				FrameCadastroCliente frameCadastroCliente = new FrameCadastroCliente();
				frameCadastroCliente.setVisible(true);
				JOptionPane.showMessageDialog(frameCadastroCliente,"Você logou com sucesso!");				
			}else {
				JOptionPane.showMessageDialog(null,"Usuário ou Senha não existe(m)");
			}
		}
	}

	/**
	 * Create the frame.
	 */
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		initialize();
	}
	
	private void initialize() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 3;
		this.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 3;
		this.getContentPane().add(txtUsuario, gbc_textField);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 4;
		this.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtSenha = new JTextField();
		GridBagConstraints gbc_txtSenha = new GridBagConstraints();
		gbc_txtSenha.insets = new Insets(0, 0, 5, 0);
		gbc_txtSenha.anchor = GridBagConstraints.WEST;
		gbc_txtSenha.gridx = 6;
		gbc_txtSenha.gridy = 4;
		this.getContentPane().add(txtSenha, gbc_txtSenha);
		txtSenha.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		
		BtnEntrarListener btnListener = new BtnEntrarListener();
		btnEntrar.addActionListener(btnListener);
		
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEntrar.gridx = 1;
		gbc_btnEntrar.gridy = 6;
		gbc_btnEntrar.gridwidth = 6;
		this.getContentPane().add(btnEntrar, gbc_btnEntrar);
	}

}
