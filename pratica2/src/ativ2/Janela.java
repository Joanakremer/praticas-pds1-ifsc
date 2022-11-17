package ativ2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txt_n1;
	private JTextField txt_n2;
	private JTextField txt_n3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lado 1:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(31, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado 2:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(31, 60, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lado 3:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(31, 110, 113, 14);
		contentPane.add(lblNewLabel_2);
		
		txt_n1 = new JTextField();
		txt_n1.setBounds(31, 36, 113, 20);
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.setBounds(31, 85, 113, 20);
		contentPane.add(txt_n2);
		txt_n2.setColumns(10);
		
		txt_n3 = new JTextField();
		txt_n3.setBounds(31, 135, 113, 20);
		contentPane.add(txt_n3);
		txt_n3.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar Tri\u00E2ngulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = txt_n1.getText();	
				String num2 = txt_n2.getText();	
				String num3 = txt_n3.getText();
				Integer n1 = Integer.valueOf(num1);
				Integer n2 = Integer.valueOf(num2);
				Integer n3 = Integer.valueOf(num3);
				
				txt_n1.setText("");
				txt_n2.setText("");
				txt_n3.setText("");
				
				if((n1==n2) && (n1==n3)){
					JOptionPane.showMessageDialog(null,"Triangulo EQUILATERO.");
				}else if((n1!=n2) && (n1!=n3)){
					JOptionPane.showMessageDialog(null,"Triangulo ESCALENO.");
				}else {
					JOptionPane.showMessageDialog(null,"Triangulo ISOSCELES.");
			}
		}
		});
		btnNewButton.setBounds(171, 135, 144, 21);
		contentPane.add(btnNewButton);
	}
}
