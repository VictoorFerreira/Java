package cursoemvideo;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaResolucao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResolucao frame = new TelaResolucao();
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
	public TelaResolucao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblResolucaoTela = new JLabel("Resolução de Tela");
		contentPane.add(lblResolucaoTela);
		
		JLabel lblResol = new JLabel("Aperte o Botão");
		contentPane.add(lblResol);
		
		JButton btnResolucao = new JButton("Mostrar a Resolução");
		btnResolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s, z;
				Toolkit tk = Toolkit.getDefaultToolkit();
		        Dimension d = tk.getScreenSize();
		        s = Integer.toString(d.width);
		        z = Integer.toString(d.height);
		        lblResol.setText(s + "x" + z);
			}
		});
		contentPane.add(btnResolucao);
	}

}
