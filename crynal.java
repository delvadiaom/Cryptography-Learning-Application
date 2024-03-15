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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class crynal extends JFrame {
	ReadWrite ReadWrite =new ReadWrite();
	static crynal frame = new crynal();
	static qwerty frames = new qwerty();
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
	public crynal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cryptanalysis");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 50));
		lblNewLabel.setBounds(426, 10, 330, 113);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrGbgrthbrhbrdhyr = new JTextArea();
		txtrGbgrthbrhbrdhyr.setText("The goal of cryptanalysis is to find some weakness or insecurity in a cryptographic scheme, thus permitting its subversion or evasion. \r\nMost ciphers, apart from the one-time pad, can be broken with enough computational effort by brute force attack, but the amount of effort needed may be exponentially dependent on the key size, as compared to the effort needed to make use of the cipher. \r\nIn such cases, effective security could be achieved if it is proven that the effort required is beyond the ability of any adversary. This means it must be shown that no efficient method can be found to break the cipher. \r\nSince no such proof has been found to date, the one-time-pad remains the only theoretically unbreakable cipher.");
		txtrGbgrthbrhbrdhyr.setForeground(new Color(255, 255, 255));
		txtrGbgrthbrhbrdhyr.setLineWrap(true);
		txtrGbgrthbrhbrdhyr.setWrapStyleWord(true);
		txtrGbgrthbrhbrdhyr.setFont(new Font("Monospaced", Font.PLAIN, 25));
		txtrGbgrthbrhbrdhyr.setBackground(new Color(204, 153, 255));
		txtrGbgrthbrhbrdhyr.setEditable(false);
		txtrGbgrthbrhbrdhyr.setBounds(235, 130, 755, 614);
		contentPane.add(txtrGbgrthbrhbrdhyr);
		
		JButton button = new JButton("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				qwerty.mai(null);
				frame.dispose();
			
			
			
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 23));
		button.setBounds(1234, 10, 65, 50);
		contentPane.add(button);
		
		JButton btnHandsOn = new JButton("Hands On");
		btnHandsOn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.ReadWrite.mai(null);
				frame.dispose();
			}
		});
		btnHandsOn.setVerticalAlignment(SwingConstants.TOP);
		btnHandsOn.setFont(new Font("Constantia", Font.BOLD, 45));
		btnHandsOn.setBounds(1016, 690, 268, 50);
		contentPane.add(btnHandsOn);
	}
}
