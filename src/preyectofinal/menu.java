package preyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Documentos\\Media\\Jhader\\img\\icono.png"));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1137, 745);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 57, 81));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new LineBorder(new Color(100, 202, 125), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCerrar = new JButton("\u2022");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCerrar.setBorder(null);
		btnCerrar.setActionCommand("punto");
		btnCerrar.setForeground(Color.RED);
		btnCerrar.setContentAreaFilled(false);
		btnCerrar.setFont(new Font("Futura Lt BT", Font.PLAIN, 43));
		btnCerrar.setBounds(1017, 11, 58, 23);
		contentPane.add(btnCerrar);
		
		JButton btnMinimizar = new JButton("\u2022");
		btnMinimizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnMinimizar.setBorder(null);
		btnMinimizar.setForeground(Color.ORANGE);
		btnMinimizar.setContentAreaFilled(false);
		btnMinimizar.setFont(new Font("Futura Lt BT", Font.PLAIN, 43));
		btnMinimizar.setBounds(1054, 11, 57, 23);
		contentPane.add(btnMinimizar);
		
		JButton btnEmpleados = new JButton("Empleados");
		btnEmpleados.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnEmpleados.setBackground(new Color(46, 57, 81));
		btnEmpleados.setForeground(new Color(100, 202, 125));
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				empleados em = new empleados();
				dispose();
				em.setVisible(true);
				
			}
		});
		btnEmpleados.setBounds(10, 605, 241, 90);
		contentPane.add(btnEmpleados);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clientes c = new clientes();
				dispose();
				c.setVisible(true);
				
			}
		});
		btnClientes.setForeground(new Color(100, 202, 125));
		btnClientes.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnClientes.setBackground(new Color(46, 57, 81));
		btnClientes.setBounds(307, 605, 241, 90);
		contentPane.add(btnClientes);
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				productos pr = new productos();
				dispose();
				pr.setVisible(true);
				
			}
		});
		btnProductos.setForeground(new Color(100, 202, 125));
		btnProductos.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnProductos.setBackground(new Color(46, 57, 81));
		btnProductos.setBounds(593, 605, 241, 90);
		contentPane.add(btnProductos);
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventas ve = new ventas();
				dispose();
				ve.setVisible(true);
				
			}
		});
		btnVentas.setForeground(new Color(100, 202, 125));
		btnVentas.setFont(new Font("Eras Bold ITC", Font.PLAIN, 33));
		btnVentas.setBackground(new Color(46, 57, 81));
		btnVentas.setBounds(870, 605, 241, 90);
		contentPane.add(btnVentas);
		
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon("D:\\Documentos\\Media\\Jhader\\img\\Sin t\u00EDtulo-4.png"));
		lblLogo.setBounds(114, 11, 839, 574);
		contentPane.add(lblLogo);
	}
}
