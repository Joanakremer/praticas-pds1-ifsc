package ativ1;

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
		setBounds(100, 100, 380, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00FAmero 2:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 76, 105, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 20, 105, 14);
		contentPane.add(lblNewLabel_1);

		txt_n1 = new JTextField();
		txt_n1.setBounds(20, 45, 105, 20);
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);

		txt_n2 = new JTextField();
		txt_n2.setBounds(20, 101, 105, 20);
		contentPane.add(txt_n2);
		txt_n2.setColumns(10);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txt_n1.getText();
				String n2 = txt_n2.getText();
				Float new_n1 = Float.valueOf(n1);
				Float new_n2 = Float.valueOf(n2);
				Float adc = new_n1 + new_n2;
				JOptionPane.showMessageDialog(null, "SOMA = " +adc);
			}
		});
		btnNewButton.setBounds(147, 44, 86, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txt_n1.getText();
				String n2 = txt_n2.getText();
				Float new_n1 = Float.valueOf(n1);
				Float new_n2 = Float.valueOf(n2);
				Float mult = new_n1 - new_n2;
				JOptionPane.showMessageDialog(null, "SUBTRACAO = " +mult);
			}
		});
		btnNewButton_1.setBounds(244, 100, 86, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txt_n1.getText();
				String n2 = txt_n2.getText();
				Float new_n1 = Float.valueOf(n1);
				Float new_n2 = Float.valueOf(n2);
				Float sub = new_n1 * new_n2;
				JOptionPane.showMessageDialog(null, "MULTIPLICACAO = " +sub);
			}
		});
		btnNewButton_2.setBounds(244, 44, 86, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("\u00F7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txt_n1.getText();
				String n2 = txt_n2.getText();
				Float new_n1 = Float.valueOf(n1);
				Float new_n2 = Float.valueOf(n2);
				Float div = new_n1 / new_n2;
				JOptionPane.showMessageDialog(null, "DIVISAO = " +div);
			}
		});
		btnNewButton_3.setBounds(147, 100, 86, 23);
		contentPane.add(btnNewButton_3);
	}

}