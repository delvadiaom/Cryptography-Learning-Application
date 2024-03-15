package enigmalearner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class modern extends JFrame {
	static crynal crynal = new crynal();
	static qwerty qwerty = new qwerty();

	static modern frame = new modern();
	private JPanel contentPane;

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
	public modern() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modern Day Cryptography");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 50));
		lblNewLabel.setBounds(343, 10, 639, 113);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrGbgrthbrhbrdhyr = new JTextArea();
		txtrGbgrthbrhbrdhyr.setText("Symmetric-key cryptography refers to encryption methods in which both the sender and receiver share the same key.Symmetric key ciphers are implemented as either block ciphers or stream ciphers. A block cipher enciphers input in blocks of plaintext as opposed to individual characters, the input form used by a stream cipher.");
		txtrGbgrthbrhbrdhyr.setForeground(new Color(255, 255, 255));
		txtrGbgrthbrhbrdhyr.setLineWrap(true);
		txtrGbgrthbrhbrdhyr.setWrapStyleWord(true);
		txtrGbgrthbrhbrdhyr.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrGbgrthbrhbrdhyr.setBackground(new Color(204, 153, 255));
		txtrGbgrthbrhbrdhyr.setEditable(false);
		txtrGbgrthbrhbrdhyr.setBounds(20, 133, 717, 276);
		contentPane.add(txtrGbgrthbrhbrdhyr);
		
		JTextArea txtrSymmetrickeyCryptosystemsUse = new JTextArea();
		txtrSymmetrickeyCryptosystemsUse.setText("Symmetric-key cryptosystems use the same key for encryption and decryption of a message, although a message or group of messages can have a different key than others. A significant disadvantage of symmetric ciphers is the key management necessary to use them securely. Each distinct pair of communicating parties must, ideally, share a different key, and perhaps for each ciphertext exchanged as well.");
		txtrSymmetrickeyCryptosystemsUse.setWrapStyleWord(true);
		txtrSymmetrickeyCryptosystemsUse.setLineWrap(true);
		txtrSymmetrickeyCryptosystemsUse.setForeground(Color.WHITE);
		txtrSymmetrickeyCryptosystemsUse.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrSymmetrickeyCryptosystemsUse.setEditable(false);
		txtrSymmetrickeyCryptosystemsUse.setBackground(new Color(204, 153, 255));
		txtrSymmetrickeyCryptosystemsUse.setBounds(20, 455, 802, 304);
		contentPane.add(txtrSymmetrickeyCryptosystemsUse);
		
		JLabel lblSymmetricKey = new JLabel("#Symmetric Key");
		lblSymmetricKey.setFont(new Font("Constantia", Font.BOLD, 30));
		lblSymmetricKey.setBounds(20, 100, 246, 51);
		contentPane.add(lblSymmetricKey);
		
		JLabel lblpublicKey = new JLabel("#Public Key");
		lblpublicKey.setFont(new Font("Constantia", Font.BOLD, 30));
		lblpublicKey.setBounds(20, 419, 246, 51);
		contentPane.add(lblpublicKey);
		
		JLabel lblhashes = new JLabel("#Hashes");
		lblhashes.setFont(new Font("Constantia", Font.BOLD, 30));
		lblhashes.setBounds(989, 100, 132, 51);
		contentPane.add(lblhashes);
		
		JTextArea txtrHashingIsA = new JTextArea();
		txtrHashingIsA.setWrapStyleWord(true);
		txtrHashingIsA.setText("Hashing is a method of cryptography that converts any form of data into a unique string of text. Any piece of data can be hashed, no matter its size or type. In traditional hashing, regardless of the data\u2019s size, type, or length, the hash that any data produces is always the same length. A hash is designed to act as a one-way function\u200A you can put data into a hashing algorithm and get a unique string, but if you come upon a new hash, you cannot decipher the input data it represents. ");
		txtrHashingIsA.setLineWrap(true);
		txtrHashingIsA.setForeground(Color.WHITE);
		txtrHashingIsA.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrHashingIsA.setEditable(false);
		txtrHashingIsA.setBackground(new Color(204, 153, 255));
		txtrHashingIsA.setBounds(832, 145, 467, 614);
		contentPane.add(txtrHashingIsA);
		
		JButton button = new JButton("NEXT");
		button.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
			crynal.mai(null);
			frame.dispose();
			}
		});
		button.setVerticalAlignment(SwingConstants.TOP);
		button.setFont(new Font("Constantia", Font.BOLD, 45));
		button.setBounds(1124, 10, 175, 50);
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
		button_1.setBounds(10, 10, 65, 50);
		contentPane.add(button_1);
	}
}
