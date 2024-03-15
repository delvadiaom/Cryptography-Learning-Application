package enigmalearner;
//displayhash.java

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
public class displayhash extends JFrame {
welcome welcome =new welcome();
	private JPanel contentPane;

	JTextArea inputArea = new JTextArea();
	JTextArea OutputArea = new JTextArea();
	JTextArea ProcessArea = new JTextArea();
	JButton btnNewButton = new JButton("Encrypt");

	@SuppressWarnings("rawtypes")
	JComboBox comboBox = new JComboBox();

	 
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public displayhash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1300, 806);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton(">");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			enigmalearner.welcome.main(null);
			}
		});
		button_1.setFont(new Font("Broadway", Font.BOLD, 50));
		button_1.setBackground(new Color(153, 204, 255));
		button_1.setBounds(113, 21, 61, 58);
		contentPane.add(button_1);
		
		JButton button = new JButton("X");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.welcome.main(null);
			}
		});
		button.setFont(new Font("Broadway", Font.BOLD, 30));
		button.setBackground(new Color(153, 204, 255));
		button.setBounds(23, 21, 61, 58);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(23, 98, 585, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input Text");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(182, 10, 201, 26);
		panel.add(lblNewLabel);
		inputArea.setFont(new Font("Consolas", Font.BOLD, 20));
		
		//JTextArea textArea = new JTextArea();
		inputArea.setBounds(10, 40, 565, 202);
		panel.add(inputArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 153, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(23, 444, 585, 288);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOutput = new JLabel("OUTPUT WINDOW");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 25));
		lblOutput.setBackground(Color.LIGHT_GRAY);
		lblOutput.setBounds(168, 10, 245, 26);
		panel_1.add(lblOutput);
		OutputArea.setFont(new Font("Consolas", Font.BOLD | Font.ITALIC, 20));
		
		//JTextArea textArea_1 = new JTextArea();
		OutputArea.setBounds(10, 46, 565, 232);
		panel_1.add(OutputArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(663, 35, 610, 697);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblProcessing = new JLabel("Process Description");
		lblProcessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcessing.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 25));
		lblProcessing.setBackground(Color.LIGHT_GRAY);
		lblProcessing.setBounds(169, 10, 283, 26);
		panel_2.add(lblProcessing);
		ProcessArea.setEditable(false);
		ProcessArea.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		
		//JTextArea textArea_2 = new JTextArea();
		ProcessArea.setBounds(1, 25, 597, 667);
		panel_2.add(ProcessArea);
		

		JScrollPane scroller = new JScrollPane(ProcessArea);
		JScrollBar bar = new JScrollBar();
		scroller.add(bar);
		scroller.setBounds(20, 46, 580, 620);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_2.add(scroller, BorderLayout.EAST);
		scroller.setVisible(true);
		
		inputArea.setBorder(BorderFactory.createCompoundBorder(
		        inputArea.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		btnNewButton.setBackground(new Color(204, 153, 255));
		//Ends here...
		
		
		
		btnNewButton.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});*/
		btnNewButton.setBounds(403, 373, 205, 50);
		contentPane.add(btnNewButton);
		comboBox.setBackground(new Color(204, 153, 255));
		
		comboBox.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "SHA256", "MD5"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(23, 373, 191, 50);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(displayhash.class.getResource("/img/galaxy-1837306_1920.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1286, 769);
		contentPane.add(lblNewLabel_1);
	}
}
