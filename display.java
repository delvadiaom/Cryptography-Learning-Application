package enigmalearner;
//display.java

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class display extends JFrame {
welcome welcome =new welcome();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					display frame = new display();
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
	
	JTextArea inputArea = new JTextArea();
	JTextArea OutputArea = new JTextArea();
	JTextArea ProcessArea = new JTextArea();
	JButton btnNewButton = new JButton("Encrypt");
	JTextArea KeyInput = new JTextArea();

	@SuppressWarnings("rawtypes")
	JComboBox comboBox = new JComboBox();
	JButton btnDecrypt = new JButton("Decrypt");

	 
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1300, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton(">");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			enigmalearner.welcome.main(null);
			
			}
		});
		button.setFont(new Font("Broadway", Font.BOLD, 50));
		button.setBackground(new Color(153, 204, 255));
		button.setBounds(10, 87, 61, 58);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
		welcome.main(null);	}
		});
		btnNewButton_1.setFont(new Font("Broadway", Font.BOLD, 30));
		btnNewButton_1.setBackground(new Color(153, 204, 255));
		btnNewButton_1.setBounds(10, 10, 61, 58);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 155, 643, 306);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input Text");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(254, 10, 139, 26);
		panel.add(lblNewLabel);
		inputArea.setFont(new Font("Consolas", Font.BOLD, 20));
		
		//JTextArea textArea = new JTextArea();
		inputArea.setBounds(10, 46, 623, 121);
		panel.add(inputArea);
		
		JLabel lblNewLabel_1 = new JLabel("Key Used");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(269, 177, 117, 38);
		panel.add(lblNewLabel_1);
		KeyInput.setFont(new Font("Consolas", Font.BOLD, 20));
		
		//JTextArea KeyInput = new JTextArea();
		KeyInput.setBounds(10, 214, 623, 82);
		panel.add(KeyInput);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 519, 643, 240);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOutput = new JLabel("OUTPUT WINDOW");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 22));
		lblOutput.setBackground(Color.LIGHT_GRAY);
		lblOutput.setBounds(193, 10, 256, 26);
		panel_1.add(lblOutput);
		OutputArea.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		
		//JTextArea textArea_1 = new JTextArea();
		OutputArea.setBounds(10, 46, 623, 184);
		panel_1.add(OutputArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(663, 10, 613, 749);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblProcessing = new JLabel("Process Description");
		lblProcessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcessing.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblProcessing.setBackground(Color.LIGHT_GRAY);
		lblProcessing.setBounds(194, 10, 236, 26);
		panel_2.add(lblProcessing);
		ProcessArea.setEditable(false);
		ProcessArea.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		
		//JTextArea textArea_2 = new JTextArea();
		ProcessArea.setBounds(1, 1, 254, 609);
		panel_2.add(ProcessArea);
		

		JScrollPane scroller = new JScrollPane(ProcessArea);
		JScrollBar bar = new JScrollBar();
		scroller.add(bar);
		scroller.setBounds(10, 46, 593, 693);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_2.add(scroller, BorderLayout.EAST);
		scroller.setVisible(true);
		
		inputArea.setBorder(BorderFactory.createCompoundBorder(
		        inputArea.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		KeyInput.setBorder(BorderFactory.createCompoundBorder(
				KeyInput.getBorder(),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)
				));
		btnNewButton.setBackground(new Color(204, 153, 255));
		//Ends here...
		
		
		
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});*/
		btnNewButton.setBounds(270, 471, 125, 38);
		contentPane.add(btnNewButton);
		comboBox.setBackground(new Color(204, 153, 255));
		
		comboBox.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Scytale", "Caeser", "Playfair", "Vigenere"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(38, 471, 132, 38);
		contentPane.add(comboBox);
		btnDecrypt.setBackground(new Color(204, 153, 255));
		
		
		
		btnDecrypt.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnDecrypt.setBounds(491, 471, 125, 38);
		contentPane.add(btnDecrypt);
		
		JTextArea txtrInstructions = new JTextArea();
		txtrInstructions.setBackground(new Color(153, 204, 255));
		txtrInstructions.setForeground(new Color(0, 0, 0));
		txtrInstructions.setFont(new Font("Bookman Old Style", Font.ITALIC, 20));
		txtrInstructions.setEditable(false);
		txtrInstructions.setText("   INSTRUCTION SET: \r\n# Key for Scytale Should only be any Digit.\r\n# Key for Caesar should only be any Digit.\r\n# Key for Playfair should only be Character excluding  \" j \".");
		txtrInstructions.setBounds(81, 10, 572, 135);
		contentPane.add(txtrInstructions);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(display.class.getResource("/img/galaxy-1837306_1920.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1286, 769);
		contentPane.add(lblNewLabel_2);
	}



	public void mai(Object object) {
		// TODO Auto-generated method stub
		
	}
}
