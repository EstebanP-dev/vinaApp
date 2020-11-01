package codigo;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ElegidosLauncher extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegidosLauncher frame = new ElegidosLauncher();
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
	public ElegidosLauncher() {
		setTitle("ELEGIDOS RP | Launcher");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ElegidosLauncher.class.getResource("/iconos_img/elegidos.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 685);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 57, 81));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setBounds(321, 578, 167, 57);
		btnPlay.setFont(new Font("Futura-Bold", Font.PLAIN, 53));
		btnPlay.setForeground(new Color(102, 204, 0));
		btnPlay.setBackground(new Color(46, 57, 81));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop d = Desktop.getDesktop();
				
				try {
					d.browse(new URI("fivem://connect/cfx.re/join/3498ob"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnPlay);
		
		JLabel lblDiscord = new JLabel("New label");
		lblDiscord.setBounds(683, 531, 102, 107);
		lblDiscord.setIcon(new ImageIcon("C:\\Users\\RYZEN\\OneDrive\\Im\u00E1genes\\discord.png"));
		contentPane.add(lblDiscord);
		
		JLabel lblCerrar = new JLabel("X");
		lblCerrar.setForeground(new Color(102, 0, 0));
		lblCerrar.setFont(new Font("Futura-Bold", Font.PLAIN, 26));
		lblCerrar.setBounds(756, 11, 29, 29);
		contentPane.add(lblCerrar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\[Elegidos]\\Imagenes\\ems.png"));
		lblNewLabel.setBounds(10, 131, 94, 107);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\[Elegidos]\\Imagenes\\dnp.png"));
		label.setBounds(10, 232, 102, 124);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("D:\\[Elegidos]\\Imagenes\\army.png"));
		label_1.setBounds(10, 380, 94, 107);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\[Elegidos]\\Imagenes\\pexels-steve-johnson-1550564.jpg"));
		lblNewLabel_1.setBounds(0, 0, 795, 646);
		contentPane.add(lblNewLabel_1);
	}
}
