package codigo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class ejercicio_muestra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_muestra frame = new ejercicio_muestra();
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
	public ejercicio_muestra() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBackground(new Color(153, 153, 102));
		setIconImage(Toolkit.getDefaultToolkit().getImage(ejercicio_muestra.class.getResource("/iconos_img/burn.png")));
		setTitle("Operador | Esteban Navia");
		setBounds(100, 100, 781, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 755, 43);
		panel.setBackground(new Color(0, 128, 0));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Operador - Gr\u00E1fico");
		lblNewLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 28));
		lblNewLabel.setForeground(new Color(240, 255, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(51, 153, 0), 2), "Entrada", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(27, 81, 244, 140);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Numero 1");
		lblNewLabel_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(42, 45, 64, 18);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 45, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(123, 76, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero 2");
		lblNumero.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblNumero.setBounds(42, 74, 64, 18);
		panel_1.add(lblNumero);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(204, 51, 51), 2), "Salida", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(27, 255, 244, 140);
		contentPane.add(panel_2);
		
		JLabel lblSuma = new JLabel("Suma");
		lblSuma.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblSuma.setBounds(10, 21, 64, 18);
		panel_2.add(lblSuma);
		
		JLabel lblResta = new JLabel("Resta");
		lblResta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblResta.setBounds(10, 56, 64, 18);
		panel_2.add(lblResta);
		
		JLabel lblMultiplicacin = new JLabel("Multiplicaci\u00F3n");
		lblMultiplicacin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		lblMultiplicacin.setBounds(10, 98, 80, 18);
		panel_2.add(lblMultiplicacin);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 21, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 56, 86, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 98, 86, 20);
		panel_2.add(textField_4);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnNewButton.setBackground(new Color(0, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Float num1, num2, sum, rest, multi;
				//Variables
				num1= Float.parseFloat(textField_1.getText());
				num2= Float.parseFloat(textField.getText());
				//Operaciones
				sum = num1 + num2;
				rest = num1 - num2;
				multi = num1 * num2;
				//Salida
				textField_2.setText(" "+sum);
				textField_3.setText(" "+rest);
				textField_4.setText(" "+multi);
				
			}
			
		});
		btnNewButton.setBounds(481, 116, 154, 61);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//limpiar celdas
				
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
			}
		});
		btnLimpiar.setForeground(new Color(255, 255, 255));
		btnLimpiar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnLimpiar.setBackground(new Color(0, 102, 0));
		btnLimpiar.setBounds(481, 220, 154, 61);
		contentPane.add(btnLimpiar);
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Salir
				
				System.exit(0);
				
			}
		});
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnCerrar.setBackground(new Color(204, 51, 51));
		btnCerrar.setBounds(481, 327, 154, 61);
		contentPane.add(btnCerrar);
	}
}
