package enigmalearner;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class what extends JFrame {
	history history = new history();

	private JPanel contentPane;
	static qwerty frames = new qwerty();
	static what frame = new what();
	/**
	 * Launch the application.
	 */
	public static void mai(String[] args) {
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
	public what() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(what.class.getResource("/img/aes_act_2_scene_02_confusion_1100.png")));
		lblNewLabel_1.setBounds(919, 236, 355, 400);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("What is Cryptography?");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 50));
		lblNewLabel.setBounds(368, 22, 543, 113);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrGbgrthbrhbrdhyr = new JTextArea();
		txtrGbgrthbrhbrdhyr.setForeground(new Color(255, 255, 255));
		txtrGbgrthbrhbrdhyr.setLineWrap(true);
		txtrGbgrthbrhbrdhyr.setWrapStyleWord(true);
		txtrGbgrthbrhbrdhyr.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrGbgrthbrhbrdhyr.setText("Cryptography or cryptology is the practice and study of techniques for secure communication in the presence of third parties called adversaries.\r\nMore generally, cryptography is about constructing and analyzing protocols that prevent third parties or the public from reading private messages;\r\nvarious aspects in information security such as data confidentiality, data integrity, authentication, and non-repudiation\r\nare central to modern cryptography. Modern cryptography exists at the intersection of the disciplines of mathematics, computer science, electrical engineering, communication science and physics. \r\nApplications of cryptography include electronic commerce, chip-based payment cards, digital currencies, computer passwords, and military communications.");
		txtrGbgrthbrhbrdhyr.setBackground(new Color(204, 153, 255));
		txtrGbgrthbrhbrdhyr.setEditable(false);
		txtrGbgrthbrhbrdhyr.setBounds(57, 129, 793, 616);
		contentPane.add(txtrGbgrthbrhbrdhyr);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.history.mai(null);
				frame.dispose();

			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 45));
		btnNewButton.setBounds(979, 646, 175, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				qwerty.mai(null);
				frame.dispose();
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_1.setBounds(1242, 10, 57, 50);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}
