package preyectofinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class productos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					productos frame = new productos();
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
	public productos() {
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
		
		JPanel informacion = new JPanel();
		informacion.setBackground(new Color(46, 57, 81));
		informacion.setBorder(new LineBorder(new Color(50, 205, 50)));
		informacion.setBounds(22, 144, 405, 410);
		contentPane.add(informacion);
		informacion.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setForeground(new Color(100, 202, 125));
		lblCodigo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblCodigo.setBounds(29, 27, 129, 47);
		informacion.add(lblCodigo);
		
		JTextField textField_Codigo = new JTextField();
		textField_Codigo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Codigo.setBounds(168, 38, 205, 36);
		informacion.add(textField_Codigo);
		textField_Codigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblNombre.setForeground(new Color(100, 202, 125));
		lblNombre.setBounds(29, 88, 129, 47);
		informacion.add(lblNombre);
		
		JTextField textField_Nombre = new JTextField();
		textField_Nombre.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Nombre.setColumns(10);
		textField_Nombre.setBounds(168, 99, 205, 36);
		informacion.add(textField_Nombre);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblCantidad.setForeground(new Color(100, 202, 125));
		lblCantidad.setBounds(10, 145, 149, 47);
		informacion.add(lblCantidad);
		
		JComponent textField_Cantidad = new JTextField();
		textField_Cantidad.setFont(new Font("Eras Bold ITC", Font.PLAIN, 26));
		((JTextField) textField_Cantidad).setColumns(10);
		textField_Cantidad.setBounds(168, 151, 84, 36);
		informacion.add(textField_Cantidad);
		
		JLabel lblTamaño = new JLabel("Tama\u00F1o");
		lblTamaño.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblTamaño.setForeground(new Color(100, 202, 125));
		lblTamaño.setBounds(29, 204, 129, 47);
		informacion.add(lblTamaño);
		
		JTextField textField_Tamaño = new JTextField();
		textField_Tamaño.setFont(new Font("Eras Bold ITC", Font.PLAIN, 22));
		textField_Tamaño.setColumns(10);
		textField_Tamaño.setBounds(168, 212, 156, 36);
		informacion.add(textField_Tamaño);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblMarca.setForeground(new Color(100, 202, 125));
		lblMarca.setBounds(29, 262, 129, 47);
		informacion.add(lblMarca);
		
		JTextField textField_Marca = new JTextField();
		textField_Marca.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Marca.setColumns(10);
		textField_Marca.setBounds(168, 273, 205, 36);
		informacion.add(textField_Marca);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblPrecio.setForeground(new Color(100, 202, 125));
		lblPrecio.setBounds(29, 328, 129, 47);
		informacion.add(lblPrecio);
		
		JTextField textField_Precio = new JTextField();
		textField_Precio.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Precio.setColumns(10);
		textField_Precio.setBounds(168, 339, 205, 36);
		informacion.add(textField_Precio);
		
		JLabel lblTitulo = new JLabel("PRODUCTOS");
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
		
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon("D:\\Documentos\\Media\\Jhader\\img\\Sin t\u00EDtulo-5.png"));
		lblLogo.setBounds(431, 144, 431, 411);
		contentPane.add(lblLogo);
	}

}
