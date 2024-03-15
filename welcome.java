package enigmalearner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class welcome extends JFrame {
	ReadWrite ReadWrite =new ReadWrite();
	static welcome frame = new welcome();
	static qwerty qwerty = new qwerty();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				qwerty.mai(null);
				frame.dispose();
			}
		});
		  
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.ReadWrite.mai(null);
				frame.dispose();}
		});
		
		JLabel lblNewLabel_3 = new JLabel("#\u0113nigm\u00E4");
		lblNewLabel_3.setFont(new Font("Consolas", Font.BOLD, 38));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(27, 22, 182, 64);
		contentPane.add(lblNewLabel_3);
		btnNewButton.setIcon(new ImageIcon(welcome.class.getResource("/img/1.png")));
		btnNewButton.setBounds(1102, 292, 109, 97);
		contentPane.add(btnNewButton);
		
		button.setIcon(new ImageIcon(welcome.class.getResource("/img/2.png")));
		button.setBounds(125, 292, 109, 97);
		contentPane.add(button);
		
		JLabel lblExploreUs = new JLabel("Practice Now!");
		lblExploreUs.setForeground(Color.WHITE);
		lblExploreUs.setFont(new Font("Constantia", Font.BOLD, 35));
		lblExploreUs.setBounds(1050, 434, 249, 75);
		contentPane.add(lblExploreUs);
		
		JLabel lblNotNow = new JLabel("Explore Us!");
		lblNotNow.setForeground(new Color(255, 255, 255));
		lblNotNow.setFont(new Font("Constantia", Font.BOLD, 35));
		lblNotNow.setBounds(72, 434, 261, 75);
		contentPane.add(lblNotNow);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {

		});
		lblNewLabel_2.setIcon(new ImageIcon(welcome.class.getResource("/img/2.png")));
		lblNewLabel_2.setBounds(95, 259, 165, 171);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {

		});
		lblNewLabel_1.setIcon(new ImageIcon(welcome.class.getResource("/img/1.png")));
		lblNewLabel_1.setBounds(1074, 259, 165, 165);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFrevewttgwtgwtg = new JLabel("WELCOME TO THE CRYPTO-WORLD");
		lblFrevewttgwtgwtg.setForeground(new Color(255, 255, 255));
		lblFrevewttgwtgwtg.setFont(new Font("Constantia", Font.BOLD, 57));
		lblFrevewttgwtgwtg.setBounds(150, 619, 1089, 140);
		contentPane.add(lblFrevewttgwtgwtg);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setIcon(new ImageIcon(welcome.class.getResource("/img/security-3728124_1920.jpg")));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBounds(10, 0, 1289, 749);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
