package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerificadorIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;
	private JTextField txtIdade;
	private JTextField txtSituacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificadorIdade frame = new VerificadorIdade();
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
	public VerificadorIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(10, 35, 117, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(137, 32, 76, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular Idade");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2025 - ano;
				txtIdade.setText(Integer.toString(idade));
				String situ = (idade >= 18) ? "Maior" : "Menor";
				txtSituacao.setText(situ);
			}
		});
		btnCalcular.setBounds(63, 63, 117, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 100, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(137, 97, 76, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Situação");
		lblNewLabel_2.setBounds(10, 125, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		txtSituacao = new JTextField();
		txtSituacao.setBounds(137, 128, 76, 20);
		contentPane.add(txtSituacao);
		txtSituacao.setColumns(10);
	}
}
