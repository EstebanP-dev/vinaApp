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

public class ventas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventas frame = new ventas();
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
	public ventas() {
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
		
		JLabel lbl1 = new JLabel("...");
		lbl1.setForeground(new Color(100, 202, 125));
		lbl1.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lbl1.setBounds(29, 27, 129, 47);
		informacion.add(lbl1);
		
		JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_1.setBounds(168, 38, 205, 36);
		informacion.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setFont(new Font("Eras Bold ITC", Font.PLAIN, 25));
		lblDescripcion.setForeground(new Color(100, 202, 125));
		lblDescripcion.setBounds(10, 89, 148, 47);
		informacion.add(lblDescripcion);
		
		JTextField textField_Descripcion = new JTextField();
		textField_Descripcion.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Descripcion.setColumns(10);
		textField_Descripcion.setBounds(168, 99, 205, 36);
		informacion.add(textField_Descripcion);
		
		JLabel lblP_unit = new JLabel("Precio unitario");
		lblP_unit.setFont(new Font("Eras Bold ITC", Font.PLAIN, 24));
		lblP_unit.setForeground(new Color(100, 202, 125));
		lblP_unit.setBounds(10, 145, 177, 47);
		informacion.add(lblP_unit);
		
		JComponent textField_P_unit = new JTextField();
		textField_P_unit.setFont(new Font("Eras Bold ITC", Font.PLAIN, 26));
		((JTextField) textField_P_unit).setColumns(10);
		textField_P_unit.setBounds(197, 156, 176, 36);
		informacion.add(textField_P_unit);
		
		JLabel lbl2 = new JLabel("...");
		lbl2.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lbl2.setForeground(new Color(100, 202, 125));
		lbl2.setBounds(29, 204, 129, 47);
		informacion.add(lbl2);
		
		JTextField textField_2 = new JTextField();
		textField_2.setFont(new Font("Eras Bold ITC", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(168, 212, 156, 36);
		informacion.add(textField_2);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Eras Bold ITC", Font.PLAIN, 27));
		lblCantidad.setForeground(new Color(100, 202, 125));
		lblCantidad.setBounds(29, 262, 129, 47);
		informacion.add(lblCantidad);
		
		JTextField textField_Cantidad = new JTextField();
		textField_Cantidad.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Cantidad.setColumns(10);
		textField_Cantidad.setBounds(168, 273, 205, 36);
		informacion.add(textField_Cantidad);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Eras Bold ITC", Font.PLAIN, 30));
		lblTotal.setForeground(new Color(100, 202, 125));
		lblTotal.setBounds(29, 328, 129, 47);
		informacion.add(lblTotal);
		
		JTextField textField_Total = new JTextField();
		textField_Total.setFont(new Font("Eras Bold ITC", Font.PLAIN, 15));
		textField_Total.setColumns(10);
		textField_Total.setBounds(168, 339, 139, 36);
		informacion.add(textField_Total);
		
		JLabel lblTitulo = new JLabel("VENTAS");
		lblTitulo.setFont(new Font("Eras Bold ITC", Font.PLAIN, 40));
		lblTitulo.setForeground(new Color(100, 202, 125));
		lblTitulo.setBounds(482, 30, 176, 64);
		contentPane.add(lblTitulo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnAgregar.setBackground(new Color(46, 57, 81));
		btnAgregar.setForeground(new Color(100, 202, 125));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregar.setBounds(867, 162, 208, 54);
		contentPane.add(btnAgregar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnGuardar.setBackground(new Color(46, 57, 81));
		btnGuardar.setForeground(new Color(100, 202, 125));
		btnGuardar.setBounds(867, 227, 208, 54);
		contentPane.add(btnGuardar);
		
		JButton btnBorrar = new JButton("Editar");
		btnBorrar.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnBorrar.setBackground(new Color(46, 57, 81));
		btnBorrar.setForeground(new Color(100, 202, 125));
		btnBorrar.setBounds(867, 292, 208, 54);
		contentPane.add(btnBorrar);
		
		JButton btnConsultar = new JButton("Borrar");
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
