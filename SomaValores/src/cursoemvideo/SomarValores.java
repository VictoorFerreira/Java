package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class SomarValores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected JLabel lblSoma;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtSoma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomarValores frame = new SomarValores();
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
	public SomarValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtN1 = new JTextField();
		contentPane.add(txtN1);
		txtN1.setColumns(5);
		
		JLabel lblSinal = new JLabel("+");
		contentPane.add(lblSinal);
		
		txtN2 = new JTextField();
		contentPane.add(txtN2);
		txtN2.setColumns(5);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int s = n1 + n2;
				txtSoma.setText(Integer.toString(s));
			}

			private JLabel setText(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		contentPane.add(btnSoma);
		
		txtSoma = new JTextField();
		contentPane.add(txtSoma);
		txtSoma.setColumns(5);
	}

}
