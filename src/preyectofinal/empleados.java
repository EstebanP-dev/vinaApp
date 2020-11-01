package preyectofinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class empleados extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nombre;
	private JTextField textField_Apellido;
	private JTextField textField_Edad;
	private JTextField textField_Gnero;
	private JTextField textField_Cargo;
	private JTextField textField_Salario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					empleados frame = new empleados();
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
	public empleados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Documentos\\Media\\Jhader\\img\\icono.png"));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 745);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 57, 81));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new LineBorder(new Color(100, 202, 125), 4));
		setContentPane(contentPane);
		
		JButton btnCerrar = new JButton("\u2022");
		btnCerrar.setBounds(1017, 11, 58, 23);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.setLayout(null);
		btnCerrar.setBorder(null);
		btnCerrar.setActionCommand("punto");
		btnCerrar.setForeground(Color.RED);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setFont(new Font("Futura Lt BT", Font.PLAIN, 43));
		contentPane.add(btnCerrar);
		
		JButton btnMinimizar = new JButton("\u2022");
		btnMinimizar.setBounds(1054, 11, 57, 23);
		btnMinimizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnMinimizar.setBorder(null);
		btnMinimizar.setForeground(Color.ORANGE);
		btnMinimizar.setContentAreaFilled(false);
		btnMinimizar.setFont(new Font("Futura Lt BT", Font.PLAIN, 43));
		contentPane.add(btnMinimizar);
		
		JPanel informacion = new JPanel();
		informacion.setBackground(new Color(46, 57, 81));
		informacion.setBorder(new LineBorder(new Color(50, 205, 50)));
		informacion.setBounds(22, 144, 405, 410);
		contentPane.add(informacion);
		informacion.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(100, 202, 125));
		lblNombre.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblNombre.setBounds(29, 27, 129, 47);
		informacion.add(lblNombre);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Nombre.setBounds(168, 38, 205, 36);
		informacion.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblApellido.setForeground(new Color(100, 202, 125));
		lblApellido.setBounds(29, 88, 129, 47);
		informacion.add(lblApellido);
		
		textField_Apellido = new JTextField();
		textField_Apellido.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Apellido.setColumns(10);
		textField_Apellido.setBounds(168, 99, 205, 36);
		informacion.add(textField_Apellido);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblEdad.setForeground(new Color(100, 202, 125));
		lblEdad.setBounds(29, 135, 129, 47);
		informacion.add(lblEdad);
		
		textField_Edad = new JTextField();
		textField_Edad.setFont(new Font("Eras Bold ITC", Font.PLAIN, 26));
		textField_Edad.setColumns(10);
		textField_Edad.setBounds(168, 146, 86, 36);
		informacion.add(textField_Edad);
		
		JLabel lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblGnero.setForeground(new Color(100, 202, 125));
		lblGnero.setBounds(29, 193, 129, 47);
		informacion.add(lblGnero);
		
		textField_Gnero = new JTextField();
		textField_Gnero.setFont(new Font("Eras Bold ITC", Font.PLAIN, 22));
		textField_Gnero.setColumns(10);
		textField_Gnero.setBounds(168, 204, 156, 36);
		informacion.add(textField_Gnero);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblCargo.setForeground(new Color(100, 202, 125));
		lblCargo.setBounds(29, 262, 129, 47);
		informacion.add(lblCargo);
		
		textField_Cargo = new JTextField();
		textField_Cargo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Cargo.setColumns(10);
		textField_Cargo.setBounds(168, 273, 205, 36);
		informacion.add(textField_Cargo);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblSalario.setForeground(new Color(100, 202, 125));
		lblSalario.setBounds(29, 328, 129, 47);
		informacion.add(lblSalario);
		
		textField_Salario = new JTextField();
		textField_Salario.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Salario.setColumns(10);
		textField_Salario.setBounds(168, 339, 205, 36);
		informacion.add(textField_Salario);
		
		JLabel lblTitulo = new JLabel("EMPLEADOS");
		lblTitulo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 40));
		lblTitulo.setForeground(new Color(100, 202, 125));
		lblTitulo.setBounds(464, 28, 268, 64);
		contentPane.add(lblTitulo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnGuardar.setBackground(new Color(46, 57, 81));
		btnGuardar.setForeground(new Color(100, 202, 125));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(867, 162, 208, 54);
		contentPane.add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnEditar.setBackground(new Color(46, 57, 81));
		btnEditar.setForeground(new Color(100, 202, 125));
		btnEditar.setBounds(867, 227, 208, 54);
		contentPane.add(btnEditar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnBorrar.setBackground(new Color(46, 57, 81));
		btnBorrar.setForeground(new Color(100, 202, 125));
		btnBorrar.setBounds(867, 292, 208, 54);
		contentPane.add(btnBorrar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnConsultar.setBackground(new Color(46, 57, 81));
		btnConsultar.setForeground(new Color(100, 202, 125));
		btnConsultar.setBounds(867, 357, 208, 54);
		contentPane.add(btnConsultar);
		
		JButton btnRegresar = new JButton(" ");
		btnRegresar.setContentAreaFilled(false);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu me = new menu();
				dispose();
				me.setVisible(true);
			}
		});
		btnRegresar.setIcon(new ImageIcon(empleados.class.getResource("/iconos_img/forward_alt.png")));
		btnRegresar.setBounds(1038, 680, 89, 54);
		contentPane.add(btnRegresar);
		
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon("D:\\Documentos\\Media\\Jhader\\img\\Sin t\u00EDtulo-5.png"));
		lblLogo.setBounds(431, 144, 431, 411);
		contentPane.add(lblLogo);
	}
}
