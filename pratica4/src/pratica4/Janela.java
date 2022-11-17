package pratica4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nome;
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
		setBounds(100, 100, 175, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 24, 107, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(27, 80, 107, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota2:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(27, 136, 107, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota3:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(27, 192, 107, 14);
		contentPane.add(lblNewLabel_3);

		txt_nome = new JTextField();
		txt_nome.setBounds(27, 49, 107, 20);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);

		txt_n1 = new JTextField();
		txt_n1.setBounds(27, 105, 107, 20);
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);

		txt_n2 = new JTextField();
		txt_n2.setBounds(27, 161, 107, 20);
		contentPane.add(txt_n2);
		txt_n2.setColumns(10);

		txt_n3 = new JTextField();
		txt_n3.setBounds(27, 217, 107, 20);
		contentPane.add(txt_n3);
		txt_n3.setColumns(10);

		JButton btnNewButton = new JButton("Media");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txt_nome.getText();
				String n1 = txt_n1.getText();
				String n2 = txt_n2.getText();
				String n3 = txt_n3.getText();
				if (n1.isEmpty() || n2.isEmpty() || n3.isEmpty()) {
					JOptionPane.showInternalMessageDialog(null,"Todos os campos devem ser preenchidos");	
				}
				if (!n1.isEmpty() && !n2.isEmpty() && !n3.isEmpty()) {
					Float new_n1 = Float.valueOf(n1);
					Float new_n2 = Float.valueOf(n2);
					Float new_n3 = Float.valueOf(n3);
					Float media = (new_n1 + new_n2 + new_n3) / 3;
					JOptionPane.showInternalMessageDialog(null, "O aluno " + nome + " tem como media final: " + media);
				}
			}
		});
		btnNewButton.setBounds(27, 260, 107, 20);
		contentPane.add(btnNewButton);
	}

}
