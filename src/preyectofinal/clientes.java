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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class clientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientes frame = new clientes();
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
	public clientes() {
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
	}

}
