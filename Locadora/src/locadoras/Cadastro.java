package locadoras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setBounds(10, 11, 46, 14);
		contentPane.add(lblCadastro);
		
		JLabel lbldadoscliente = new JLabel("Dados do Cliente");
		lbldadoscliente.setBounds(225, 63, 89, 14);
		contentPane.add(lbldadoscliente);
		
		JLabel lblNewLabel_2 = new JLabel("Digite o nome do cliente:");
		lblNewLabel_2.setBounds(10, 90, 181, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(10, 115, 210, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Digite o RG do cliente:");
		lblNewLabel_3.setBounds(10, 146, 130, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 171, 210, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Digite a data de Nascimento do cliente:");
		lblNewLabel_4.setBounds(316, 90, 210, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(316, 115, 210, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lbldadoscarro = new JLabel("Dados do carro");
		lbldadoscarro.setBounds(225, 219, 74, 14);
		contentPane.add(lbldadoscarro);
		
		JLabel lblNewLabel_6 = new JLabel("Digite o Carro a ser alugado:");
		lblNewLabel_6.setBounds(10, 263, 210, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 288, 210, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Digite a marca do Carro a ser alugado:");
		lblNewLabel_7.setBounds(10, 319, 210, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 344, 210, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(225, 476, 89, 23);
		contentPane.add(btnNewButton);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			save();	
			}

			private void save() {
				// TODO Auto-generated method stub
				        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
				            
			}
		});
		
		JLabel lblNewLabel_8 = new JLabel("Digite a Potencia do Carro a ser alugado:");
		lblNewLabel_8.setBounds(316, 263, 210, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(316, 288, 210, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(316, 344, 210, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Digite a Placa Carro a ser alugado:");
		lblNewLabel_9.setBounds(316, 319, 170, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Digite o Pre�o do Carro a ser alugado:");
		lblNewLabel_10.setBounds(10, 375, 210, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 400, 210, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}
}
