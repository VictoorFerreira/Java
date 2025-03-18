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

public class YearBirthday extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YearBirthday frame = new YearBirthday();
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
	public YearBirthday() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 90);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		contentPane.add(txtAno);
		txtAno.setColumns(5);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAno.getText().toString());
				int id = 2025 - an;
				txtIdade.setText(Integer.toString(id));
			}
		});
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		contentPane.add(lblNewLabel_1);
		
		txtIdade = new JTextField();
		txtIdade.setEnabled(false);
		txtIdade.setEditable(false);
		contentPane.add(txtIdade);
		txtIdade.setColumns(5);
	}

}
