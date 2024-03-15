package enigmalearner;

import javax.swing.JPanel;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class choose extends JFrame {
	static choose frame = new choose();
	ReadWrite ReadWrite = new ReadWrite();
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
	public choose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				enigmalearner.ReadWrite.choosen=2;
				enigmalearner.ReadWrite.maa(null);
				frame.dispose();
			
			}
		});
		button.setIcon(new ImageIcon(choose.class.getResource("/img/images.png")));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.WHITE);
		button.setBounds(722, 210, 474, 400);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			
				enigmalearner.ReadWrite.choosen=1;
				enigmalearner.ReadWrite.maa(null);

				frame.dispose();
			
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(choose.class.getResource("/img/freg.jpg")));
		btnNewButton.setBounds(95, 210, 480, 400);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Choose the Encryption Mode:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 56));
		lblNewLabel.setBounds(235, 42, 807, 113);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(choose.class.getResource("/img/galaxy-1837306_1920.jpg")));
		lblNewLabel_1.setBounds(10, 10, 1289, 749);
		contentPane.add(lblNewLabel_1);
	}
}
