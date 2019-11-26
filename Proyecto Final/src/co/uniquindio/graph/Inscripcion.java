package co.uniquindio.graph;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import co.uniquindio.mundo.Cliente;
import co.uniquindio.mundo.Fecha;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class Inscripcion extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtId;
	private JTextField txtDireccion;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAnio;
	private JTextField txtMail;
	private JMenu mnGenero;
	private JMenu mnEstrato;
	private JMenu mnNivelEstudio;
	private JButton btnAgregar;
	private JButton btnCancelar;

	private Home home;
	private JMenuItem estrato1;
	private JMenuItem estrato2;
	private JMenuItem estrato3;
	private JMenuItem bachiller;
	private JMenuItem pregrado;
	private JMenuItem maestria;
	private JMenuItem doctorado;
	private JMenuItem soltero;
	private JMenuItem casado;
	private JMenuItem unionLibre;
	private JMenuItem divorsiado;
	private JMenuItem viudo;
	private JMenuItem masculino;
	private JMenuItem femenino;
	private JMenu mnEstadoCivil;

	/**
	 * Create the frame.
	 */
	public Inscripcion(Home home) {

		this.home = home;

		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 23, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(20, 54, 46, 14);
		contentPane.add(lblApellido);

		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(20, 85, 46, 14);
		contentPane.add(lblId);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(20, 110, 61, 14);
		contentPane.add(lblDireccin);

		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento:");
		lblFechaNacimiento.setBounds(20, 142, 112, 14);
		contentPane.add(lblFechaNacimiento);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(20, 176, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblEstrato = new JLabel("Estrato:");
		lblEstrato.setBounds(20, 211, 46, 14);
		contentPane.add(lblEstrato);

		JLabel lblNivelEstudio = new JLabel("Nivel Estudio:");
		lblNivelEstudio.setBounds(20, 248, 84, 14);
		contentPane.add(lblNivelEstudio);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(20, 283, 84, 14);
		contentPane.add(lblEstadoCivil);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(20, 322, 46, 14);
		contentPane.add(lblGenero);

		txtNombre = new JTextField();
		txtNombre.setBounds(161, 20, 137, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setText("");
		txtApellido.setBounds(161, 51, 137, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtId = new JTextField();
		txtId.setBounds(161, 82, 137, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setBounds(161, 107, 137, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		txtDia = new JTextField();
		txtDia.setBounds(161, 139, 46, 20);
		contentPane.add(txtDia);
		txtDia.setColumns(10);

		txtMes = new JTextField();
		txtMes.setText("");
		txtMes.setBounds(217, 139, 46, 20);
		contentPane.add(txtMes);
		txtMes.setColumns(10);

		txtAnio = new JTextField();
		txtAnio.setBounds(273, 139, 46, 20);
		contentPane.add(txtAnio);
		txtAnio.setColumns(10);

		txtMail = new JTextField();
		txtMail.setBounds(161, 173, 137, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);

		mnGenero = new JMenu("GENERO");
		mnGenero.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		mnGenero.addActionListener(this);
		mnGenero.setBounds(161, 316, 137, 22);
		contentPane.add(mnGenero);

		masculino = new JMenuItem("MASCULINO");
		femenino = new JMenuItem("FEMENINO");
		mnGenero.add(masculino);
		mnGenero.add(femenino);

		mnEstrato = new JMenu("ESTRATO");
		mnGenero.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		mnGenero.addActionListener(this);
		mnEstrato.setBounds(161, 211, 137, 22);
		contentPane.add(mnEstrato);

		estrato1 = new JMenuItem("1");
		estrato2 = new JMenuItem("2");
		estrato3 = new JMenuItem("3");
		mnEstrato.add(estrato1);
		mnEstrato.add(estrato2);
		mnEstrato.add(estrato3);

		mnNivelEstudio = new JMenu("NIVEL ESTUDIO");
		mnNivelEstudio.setBounds(161, 248, 137, 22);
		contentPane.add(mnNivelEstudio);

		bachiller = new JMenuItem("BACHILLER");
		pregrado = new JMenuItem("PREGRADO");
		maestria = new JMenuItem("MAESTRIA");
		doctorado = new JMenuItem("DOCTORADO");
		mnNivelEstudio.add(bachiller);
		mnNivelEstudio.add(pregrado);
		mnNivelEstudio.add(maestria);
		mnNivelEstudio.add(doctorado);

		mnEstadoCivil = new JMenu("ESTADO CIVIL");
		mnEstadoCivil.setBounds(161, 283, 137, 22);
		contentPane.add(mnEstadoCivil);

		soltero = new JMenuItem("SOLTERO");
		casado = new JMenuItem("CASADO");
		unionLibre = new JMenuItem("UNION LIBRE");
		divorsiado = new JMenuItem("DIVORSIADO");
		viudo = new JMenuItem("VIUDO");
		mnEstadoCivil.add(soltero);
		mnEstadoCivil.add(casado);
		mnEstadoCivil.add(unionLibre);
		mnEstadoCivil.add(divorsiado);
		mnEstadoCivil.add(viudo);

		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(323, 432, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);

		btnAgregar = new JButton("AGERGAR");
		btnAgregar.setActionCommand("AGREGAR");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(209, 432, 89, 23);
		contentPane.add(btnAgregar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCancelar) {

			this.dispose();
			home.setLocationRelativeTo(null);
			home.setVisible(true);
		}

		if (e.getSource() == btnAgregar) {

			String nombre = txtNombre.getText();
			String apellido = txtApellido.getText();
			String id = txtId.getText();
			String direccion = txtDireccion.getText();
			int diaN = Integer.parseInt(txtDia.getText());
			int mesN = Integer.parseInt(txtMes.getText());
			int anioN = Integer.parseInt(txtAnio.getText());
			Fecha fechaNacimiento = new Fecha(anioN, mesN, diaN);
			String email = txtMail.getText();
			int estrato = Integer.parseInt(mnEstrato.getText());
			String nivelEstudio = mnNivelEstudio.getText();
			String estadoCivil = mnEstadoCivil.getText();
			String genero = mnGenero.getText();

			Cliente miCliente = new Cliente(id, nombre, apellido, direccion, email, fechaNacimiento, estrato,
					nivelEstudio, estadoCivil, genero);

			home.agregarClientes(miCliente);

			this.dispose();
			home.setVisible(true);

		}

	}
}
