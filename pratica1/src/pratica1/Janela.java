package pratica1;

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
		setBounds(100, 100, 291, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("N\u00FAmero 1:");
		lblNewLabel.setBounds(24, 11, 112, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2:");
		lblNewLabel_1.setBounds(24, 64, 112, 14);
		contentPane.add(lblNewLabel_1);

		txt_n1 = new JTextField();
		txt_n1.setBounds(24, 33, 112, 20);
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);

		txt_n2 = new JTextField();
		txt_n2.setBounds(24, 89, 112, 20);
		contentPane.add(txt_n2);
		txt_n2.setColumns(10);

		JButton btnNewButton = new JButton("SOMA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txt_n1.getText();
				String n2 = txt_n2.getText();
				Integer new_n1 = Integer.valueOf(n1);
				Integer new_n2 = Integer.valueOf(n2);
				txt_n1.setText("");
				txt_n2.setText("");
				Integer adicao = new_n1+new_n2;
				JOptionPane.showMessageDialog(null, "SOMA = " +adicao);

			}
		});
		btnNewButton.setBounds(158, 89, 107, 20);
		contentPane.add(btnNewButton);
	}
}