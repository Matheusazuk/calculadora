package br.com.javaswing.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtFValor1;
	private JLabel TxtValor2;
	private JTextField txtFValor2;
	private JTextField txtFResult;
	private JButton btnSubitrair;
	private JButton btnMultiplicao;
	private JButton btnDividir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor1 = new JLabel("Valor 1:");
		lblValor1.setFont(new Font("Arial", Font.BOLD, 24));
		lblValor1.setBounds(10, 3, 209, 54);
		contentPane.add(lblValor1);
		
		txtFValor1 = new JTextField();
		txtFValor1.setFont(new Font("Arial", Font.PLAIN, 24));
		txtFValor1.setBounds(140, 11, 192, 39);
		contentPane.add(txtFValor1);
		txtFValor1.setColumns(10);
		
		TxtValor2 = new JLabel("Valor 2:");
		TxtValor2.setFont(new Font("Arial", Font.BOLD, 24));
		TxtValor2.setBounds(10, 61, 209, 54);
		contentPane.add(TxtValor2);
		
		txtFValor2 = new JTextField();
		txtFValor2.setFont(new Font("Arial", Font.PLAIN, 24));
		txtFValor2.setColumns(10);
		txtFValor2.setBounds(140, 61, 192, 39);
		contentPane.add(txtFValor2);
		
		JButton btnSomar = new JButton("SOMAR");
		btnSomar.setFont(new Font("Arial", Font.BOLD, 24));
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1, v2, result;
				
				v1 = Double.parseDouble(txtFValor1.getText());
				v2 = Double.parseDouble(txtFValor2.getText());
				
				result = v1 + v2;
				
				txtFResult.setText("" + result);
			}
		});
		btnSomar.setBounds(10, 126, 191, 39);
		contentPane.add(btnSomar);
		
		JLabel LblResult = new JLabel("Result:");
		LblResult.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		LblResult.setBounds(0, 292, 209, 54);
		contentPane.add(LblResult);
		
		txtFResult = new JTextField();
		txtFResult.setFont(new Font("Arial", Font.PLAIN, 24));
		txtFResult.setColumns(10);
		txtFResult.setBounds(140, 300, 192, 39);
		contentPane.add(txtFResult);
		
		btnSubitrair = new JButton("SUBTRAIR");
		btnSubitrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1, v2, result;
				v1 = Double.parseDouble(txtFValor1.getText());
				v2 = Double.parseDouble(txtFValor2.getText());
				
				result = v1 - v2;
				
				txtFResult.setText("" + result);
			}
		});
		btnSubitrair.setFont(new Font("Arial", Font.BOLD, 24));
		btnSubitrair.setBounds(224, 126, 191, 39);
		contentPane.add(btnSubitrair);
		
		btnMultiplicao = new JButton("MULTIPLICA\u00C7\u00C3O");
		btnMultiplicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1, v2, result;
				v1 = Double.parseDouble(txtFValor1.getText());
				v2 = Double.parseDouble(txtFValor2.getText());
			
				result = v1 * v2;
				
				txtFResult.setText("" + result);
			}
		});
		btnMultiplicao.setFont(new Font("Arial", Font.BOLD, 24));
		btnMultiplicao.setBounds(10, 195, 234, 39);
		contentPane.add(btnMultiplicao);
		
		btnDividir = new JButton("DIVIDIR");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1, v2, result; 
				v1 = Double.parseDouble(txtFValor1.getText());
				v2 = Double.parseDouble(txtFValor2.getText());
				
				result = v1 / v2;
				
				txtFResult.setText(" " + result);
			}
		});
		btnDividir.setFont(new Font("Arial", Font.BOLD, 24));
		btnDividir.setBounds(295, 195, 191, 39);
		contentPane.add(btnDividir);
	}
}
