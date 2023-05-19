package br.com.javaswing.tela;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Tela extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setBounds(100, 100, 450, 300);

	}

}
