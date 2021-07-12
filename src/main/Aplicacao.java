package main;

import java.awt.EventQueue;

import gui.frames.FrameLogin;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Aplicacao {

	private FrameLogin frameLogin;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacao window = new Aplicacao();
					FrameLogin frameLogin_1 = new FrameLogin();
					window.frameLogin = frameLogin_1;
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aplicacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	}
}
