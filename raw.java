package enigmalearner;
//raw.java

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

@SuppressWarnings("serial")
public class raw extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					raw frame = new raw();
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
	public raw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1300, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 156, 643, 305);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(261, 10, 117, 26);
		panel.add(lblNewLabel);
		
		//JTextArea textArea = new JTextArea();
		inputArea.setBounds(10, 46, 623, 121);
		panel.add(inputArea);
		
		JLabel lblNewLabel_1 = new JLabel("Key");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(288, 177, 78, 38);
		panel.add(lblNewLabel_1);
		
		//JTextArea KeyInput = new JTextArea();
		KeyInput.setBounds(10, 225, 623, 71);
		panel.add(KeyInput);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 519, 643, 240);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblOutput.setBackground(Color.LIGHT_GRAY);
		lblOutput.setBounds(260, 10, 117, 26);
		panel_1.add(lblOutput);
		OutputArea.setFont(new Font("Monospaced", Font.ITALIC, 18));
		
		//JTextArea textArea_1 = new JTextArea();
		OutputArea.setBounds(10, 46, 623, 184);
		panel_1.add(OutputArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(663, 10, 613, 749);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblProcessing = new JLabel("Processing");
		lblProcessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcessing.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblProcessing.setBackground(Color.LIGHT_GRAY);
		lblProcessing.setBounds(257, 10, 117, 26);
		panel_2.add(lblProcessing);
		ProcessArea.setEditable(false);
		ProcessArea.setFont(new Font("Monospaced", Font.BOLD, 16));
		
		//JTextArea textArea_2 = new JTextArea();
		ProcessArea.setBounds(1, 1, 625, 738);
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
		//Ends here...
		
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});*/
		btnNewButton.setBounds(375, 471, 117, 38);
		contentPane.add(btnNewButton);
		
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Scytale", "Caeser", "Playfair", "vigenere"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(25, 471, 117, 38);
		contentPane.add(comboBox);
		
		
		
		btnDecrypt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnDecrypt.setBounds(517, 471, 117, 38);
		contentPane.add(btnDecrypt);
		
		JTextArea txtrInstructions = new JTextArea();
		txtrInstructions.setForeground(Color.BLUE);
		txtrInstructions.setFont(new Font("Monospaced", Font.ITALIC, 16));
		txtrInstructions.setEditable(false);
		txtrInstructions.setText("Instructions : \r\n => Key for Scytale Should only be Digit\r\n => Key for Caesar should only be Digit\r\n => Key for Playfair should only by Character excluding \" j \"");
		txtrInstructions.setBounds(10, 10, 643, 122);
		contentPane.add(txtrInstructions);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(raw.class.getResource("/img/galaxy-1837306_1920.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1286, 769);
		contentPane.add(lblNewLabel_2);
	}



	public void mai(Object object) {
		// TODO Auto-generated method stub
		
	}
}
