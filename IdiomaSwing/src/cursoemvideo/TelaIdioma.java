package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class TelaIdioma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdioma frame = new TelaIdioma();
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
	public TelaIdioma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblSistema = new JLabel("Idioma do Sistema");
		contentPane.add(lblSistema);
		
		JLabel lblMostrarIdioma = new JLabel("Mostrar Idioma");
		contentPane.add(lblMostrarIdioma);
		
		JButton btnIdioma = new JButton("Aperte Botão");
		btnIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locale loc = Locale.getDefault();
		        lblMostrarIdioma.setText(loc.toString());
			}
		});
		contentPane.add(btnIdioma);
	}

}
