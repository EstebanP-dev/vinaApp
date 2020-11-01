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

public class ejercico_a_realizar extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercico_a_realizar frame = new ejercico_a_realizar();
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
	public ejercico_a_realizar() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBackground(new Color(153, 153, 102));
		setIconImage(Toolkit.getDefaultToolkit().getImage(ejercico_a_realizar.class.getResource("/iconos_img/Globe.png")));
		setTitle("Presupuestos | Esteban Navia");
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
		
		JLabel lblNewLabel = new JLabel("Presupuesto - Hopital");
		lblNewLabel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 28));
		lblNewLabel.setForeground(new Color(240, 255, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(51, 153, 0), 2), "Entrada", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(27, 81, 244, 140);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Presupuesto Anual");
		lblNewLabel_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(33, 28, 158, 35);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(55, 74, 107, 32);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(204, 51, 51), 2), "Salida", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(27, 255, 377, 164);
		contentPane.add(panel_2);
		
		JLabel lblAreas = new JLabel("\u00C1reas");
		lblAreas.setFont(new Font("Berlin Sans FB", Font.PLAIN, 19));
		lblAreas.setBounds(133, 11, 53, 35);
		panel_2.add(lblAreas);
		
		JLabel lblCardiologia = new JLabel("Cardiolog\u00EDa");
		lblCardiologia.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblCardiologia.setBounds(10, 53, 82, 26);
		panel_2.add(lblCardiologia);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(91, 53, 82, 21);
		panel_2.add(textField);
		
		JLabel lblOncologia = new JLabel("Oncolog\u00EDa");
		lblOncologia.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblOncologia.setBounds(10, 90, 82, 26);
		panel_2.add(lblOncologia);
		
		JLabel lblPediatra = new JLabel("Pediatr\u00EDa");
		lblPediatra.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblPediatra.setBounds(10, 127, 82, 26);
		panel_2.add(lblPediatra);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(91, 95, 82, 21);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(91, 132, 82, 21);
		panel_2.add(textField_3);
		
		JLabel lblOrtopdica = new JLabel("Ortop\u00E9dica");
		lblOrtopdica.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblOrtopdica.setBounds(183, 53, 82, 26);
		panel_2.add(lblOrtopdica);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(275, 53, 82, 21);
		panel_2.add(textField_4);
		
		JLabel lblPsiquatria = new JLabel("Psiquiatr\u00EDa");
		lblPsiquatria.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblPsiquatria.setBounds(183, 90, 82, 26);
		panel_2.add(lblPsiquatria);
		
		JLabel lblOdontologa = new JLabel("Odontolog\u00EDa");
		lblOdontologa.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		lblOdontologa.setBounds(183, 127, 82, 26);
		panel_2.add(lblOdontologa);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(275, 95, 82, 21);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(275, 132, 82, 21);
		panel_2.add(textField_6);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 21));
		btnNewButton.setBackground(new Color(0, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Float presu, cardi, onco, pedia, orto, psiquia, odonto;
				//Variables
				presu= Float.parseFloat(textField_1.getText());
				//Operaciones
				cardi = (float) (presu * 0.15);
				onco = (float) (presu * 0.15);
				pedia = (float) (presu * 0.40);
				orto = (float) (presu * 0.10);
				psiquia = (float) (presu * 0.10);
				odonto = (float) (presu * 0.10);
				
				//Salida
				
				textField.setText(" "+cardi);
				textField_2.setText(" "+onco);
				textField_3.setText(" "+pedia);
				textField_4.setText(" "+orto);
				textField_5.setText(" "+psiquia);
				textField_6.setText(" "+odonto);
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
				textField_5.setText(" ");
				textField_6.setText(" ");
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
