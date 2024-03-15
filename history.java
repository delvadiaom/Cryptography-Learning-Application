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
public class history extends JFrame {

	private JPanel contentPane;
	modern modern = new modern();
	static history frame = new history();
	static qwerty qwerty = new qwerty();

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
	public history() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(history.class.getResource("/img/cryptodfvebgebg.jpg")));
		lblNewLabel_1.setBounds(855, 222, 431, 400);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("History of Cryptography");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 50));
		lblNewLabel.setBounds(332, 22, 618, 113);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrGbgrthbrhbrdhyr = new JTextArea();
		txtrGbgrthbrhbrdhyr.setForeground(new Color(255, 255, 255));
		txtrGbgrthbrhbrdhyr.setLineWrap(true);
		txtrGbgrthbrhbrdhyr.setWrapStyleWord(true);
		txtrGbgrthbrhbrdhyr.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrGbgrthbrhbrdhyr.setText("Before the modern era, cryptography focused on message confidentiality (i.e., encryption)\u2014conversion of messages from a comprehensible form \r\ninto an incomprehensible one and back again at the other end, \r\nrendering it unreadable by interceptors or eavesdroppers without secret knowledge (namely the key needed for decryption of that message). \r\nEncryption attempted to ensure secrecy in communication, such as those of spies, military leaders, and diplomats.The mai classical cipher types are transposition ciphers, which rearrange the order of letters in a message (e.g., 'hello world' becomes 'ehlol owrdl' in a trivially simple rearrangement scheme) and substitution ciphers, which systematically replace letters or groups of letters with other letters or groups of letters.");
		txtrGbgrthbrhbrdhyr.setBackground(new Color(204, 153, 255));
		txtrGbgrthbrhbrdhyr.setEditable(false);
		txtrGbgrthbrhbrdhyr.setBounds(24, 124, 806, 616);
		contentPane.add(txtrGbgrthbrhbrdhyr);
		
		JButton button = new JButton("NEXT");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.modern.mai(null);
				frame.dispose();
			}
		});
		button.setVerticalAlignment(SwingConstants.TOP);
		button.setFont(new Font("Constantia", Font.BOLD, 45));
		button.setBounds(980, 638, 175, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.qwerty.mai(null);
				frame.dispose();
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		button_1.setBounds(1234, 10, 65, 50);
		contentPane.add(button_1);
		
		
		
	}
}
