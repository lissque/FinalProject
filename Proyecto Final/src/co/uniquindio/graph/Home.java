package co.uniquindio.graph;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionDeEspectaculos = new JLabel("Gestion de Espectaculos");
		lblGestionDeEspectaculos.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 35));
		lblGestionDeEspectaculos.setForeground(Color.WHITE);
		lblGestionDeEspectaculos.setBounds(43, 27, 447, 73);
		contentPane.add(lblGestionDeEspectaculos);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(443, 11, 47, 37);
		contentPane.add(btnX);
		
		JButton btnInscribirse = new JButton("Inscribirse");
		btnInscribirse.setBounds(88, 213, 89, 23);
		contentPane.add(btnInscribirse);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(313, 213, 89, 23);
		contentPane.add(btnComprar);
	}
}
