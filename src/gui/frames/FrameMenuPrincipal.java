package gui.frames;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameMenuPrincipal extends JFrame {

	private JPanel contentPane;

	class MenuItemClienteMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			setVisible(false);
			FrameCadastroCliente frameCadastroCliente = new FrameCadastroCliente();
			frameCadastroCliente.setVisible(true);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	/**
	 * Create the frame.
	 */
	public FrameMenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem menuItemCliente = new JMenuItem("Cliente");
		JMenuItem menuItemCadastroCliente = new JMenuItem("Cadastro de Cliente");
		
		menuItemCliente.add(menuItemCadastroCliente);
		menuBar.add(menuItemCliente);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		menuItemCadastroCliente.addMouseListener(new MenuItemClienteMouseListener());
	}

}
