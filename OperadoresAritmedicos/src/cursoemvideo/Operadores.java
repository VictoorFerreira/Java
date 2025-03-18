package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Operadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtRDivisao;
	private JTextField txtECubo;
	private JTextField txtRQuadrada;
	private JTextField txtRCubica;
	private JTextField txtVAbsoluto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operadores frame = new Operadores();
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
	public Operadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um Valor");
		lblNewLabel.setBounds(20, 11, 100, 14);
		contentPane.add(lblNewLabel);
		
		txtNum = new JTextField();
		txtNum.setBounds(130, 8, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(5);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getText().toString());
				//Resto da Divisão
				int r = num % 2;
				txtRDivisao.setText(Integer.toString(r));
				//Elevado ao cubo
				double c = Math.pow(num, 3);
				txtECubo.setText(Double.toString(c));
				//Raiz Quadrada
				double rq = Math.sqrt(num);
				txtRQuadrada.setText(String.format("%.2f", rq));
				//Raiz Cubica
				double rc = Math.cbrt(num);
				txtRCubica.setText(String.format("%.2f", rc));
				//Valor Absoluto
				int abs = Math.abs(num);
				txtVAbsoluto.setText(Integer.toString(abs));
			}
		});
		
		btnCalcular.setBounds(51, 36, 89, 23);
		contentPane.add(btnCalcular);
		
		JPanel panCalc = new JPanel();
		panCalc.setBounds(20, 92, 196, 160);
		contentPane.add(panCalc);
		panCalc.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Resto da Divisão");
		lblNewLabel_1.setBounds(0, 12, 96, 14);
		panCalc.add(lblNewLabel_1);
		
		txtRDivisao = new JTextField();
		txtRDivisao.setBounds(106, 11, 81, 20);
		panCalc.add(txtRDivisao);
		txtRDivisao.setEditable(false);
		txtRDivisao.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Elevado ao Cubo");
		lblNewLabel_2.setBounds(0, 46, 96, 14);
		panCalc.add(lblNewLabel_2);
		
		txtECubo = new JTextField();
		txtECubo.setBounds(106, 43, 81, 20);
		panCalc.add(txtECubo);
		txtECubo.setEditable(false);
		txtECubo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz Quadrada");
		lblNewLabel_3.setBounds(0, 77, 96, 14);
		panCalc.add(lblNewLabel_3);
		
		txtRQuadrada = new JTextField();
		txtRQuadrada.setBounds(106, 74, 81, 20);
		panCalc.add(txtRQuadrada);
		txtRQuadrada.setEditable(false);
		txtRQuadrada.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Raiz Cubica");
		lblNewLabel_4.setBounds(0, 108, 96, 14);
		panCalc.add(lblNewLabel_4);
		
		txtRCubica = new JTextField();
		txtRCubica.setBounds(106, 105, 81, 20);
		panCalc.add(txtRCubica);
		txtRCubica.setEditable(false);
		txtRCubica.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Valor Absoluto");
		lblNewLabel_5.setBounds(0, 139, 96, 14);
		panCalc.add(lblNewLabel_5);
		
		txtVAbsoluto = new JTextField();
		txtVAbsoluto.setBounds(106, 136, 81, 20);
		panCalc.add(txtVAbsoluto);
		txtVAbsoluto.setEditable(false);
		txtVAbsoluto.setColumns(10);
	}
}
