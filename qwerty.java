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
public class qwerty extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	what what=new what();
	static qwerty frame = new qwerty();
	history history = new history();
	static welcome welcome = new welcome();
	ReadWrite ReadWrite =new ReadWrite();
	modern modern = new modern();
	crynal crynal=new crynal();
	
	
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
	public qwerty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 50, 1323, 806);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("X");
		button.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				enigmalearner.welcome.main(null);
				frame.dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 23));
		button.setBounds(1234, 10, 65, 50);
		contentPane.add(button);
		
		JButton btnStartCrypting = new JButton("Start Crypting");
		btnStartCrypting.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.ReadWrite.mai(null);
				frame.dispose();
			}
		});
		btnStartCrypting.setFont(new Font("Georgia", Font.BOLD, 30));
		btnStartCrypting.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnStartCrypting.setBackground(new Color(153, 204, 255));
		btnStartCrypting.setBounds(102, 566, 441, 99);
		contentPane.add(btnStartCrypting);
		
		JLabel lblCryptography = new JLabel("Cryptography.");
		lblCryptography.setForeground(Color.WHITE);
		lblCryptography.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblCryptography.setBounds(33, 447, 633, 32);
		contentPane.add(lblCryptography);
		
		JLabel lblLetsGetStarted = new JLabel("So, Lets Get Started, with learning Basics of");
		lblLetsGetStarted.setForeground(Color.WHITE);
		lblLetsGetStarted.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblLetsGetStarted.setBounds(33, 411, 633, 32);
		contentPane.add(lblLetsGetStarted);
		
		JLabel lblSo = new JLabel("Inorder to add a layer of security to your apps.");
		lblSo.setForeground(Color.WHITE);
		lblSo.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblSo.setBounds(33, 380, 584, 32);
		contentPane.add(lblSo);
		
		JLabel lblEncryptedDecrypted = new JLabel("ENCRYPTED & DECRYPTED.");
		lblEncryptedDecrypted.setForeground(Color.WHITE);
		lblEncryptedDecrypted.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblEncryptedDecrypted.setBounds(33, 325, 584, 32);
		contentPane.add(lblEncryptedDecrypted);
		
		JLabel lblSomeoneAndYou = new JLabel("someone and you receive the replies are");
		lblSomeoneAndYou.setForeground(Color.WHITE);
		lblSomeoneAndYou.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblSomeoneAndYou.setBounds(33, 292, 584, 32);
		contentPane.add(lblSomeoneAndYou);
		
		JLabel lblInThisWell = new JLabel("Here, we'll learn how the messages you send to");
		lblInThisWell.setForeground(Color.WHITE);
		lblInThisWell.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblInThisWell.setBounds(33, 259, 557, 32);
		contentPane.add(lblInThisWell);
		
		JLabel lblNewLabel = new JLabel("Welcome to the world of Cryptography!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 25));
		lblNewLabel.setBounds(33, 228, 528, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnWhatIsCryptography = new JButton("What is Cryptography?");
		btnWhatIsCryptography.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.what.mai(null);
				frame.dispose();
			}
		});
		btnWhatIsCryptography.setFont(new Font("Georgia", Font.BOLD, 30));
		btnWhatIsCryptography.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnWhatIsCryptography.setBackground(new Color(204, 204, 255));
		btnWhatIsCryptography.setBounds(691, 144, 511, 99);
		contentPane.add(btnWhatIsCryptography);
		
		JButton btnCryptanalysis = new JButton("Cryptanalysis");
		btnCryptanalysis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.crynal.mai(null);
				frame.dispose();
			}
		});
		btnCryptanalysis.setFont(new Font("Georgia", Font.BOLD, 30));
		btnCryptanalysis.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnCryptanalysis.setBackground(new Color(204, 204, 255));
		btnCryptanalysis.setBounds(691, 566, 511, 99);
		contentPane.add(btnCryptanalysis);
		
		JButton btnModernDayCryptography = new JButton("Modern Day Cryptography");
		btnModernDayCryptography.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.modern.mai(null);
				frame.dispose();
			}
		});
		btnModernDayCryptography.setFont(new Font("Georgia", Font.BOLD, 30));
		btnModernDayCryptography.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnModernDayCryptography.setBackground(new Color(204, 204, 255));
		btnModernDayCryptography.setBounds(691, 423, 511, 99);
		contentPane.add(btnModernDayCryptography);
		
		JButton btnBriefHistory = new JButton("Brief History.");
		btnBriefHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enigmalearner.history.mai(null);
				frame.dispose();
			}
		});
		btnBriefHistory.setFont(new Font("Georgia", Font.BOLD, 30));
		btnBriefHistory.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBriefHistory.setBackground(new Color(204, 204, 255));
		btnBriefHistory.setBounds(691, 285, 511, 99);
		contentPane.add(btnBriefHistory);
		
		JLabel lblWithCryptographhy = new JLabel("with Cryptography...");
		lblWithCryptographhy.setForeground(Color.WHITE);
		lblWithCryptographhy.setFont(new Font("Constantia", Font.BOLD, 45));
		lblWithCryptographhy.setBounds(33, 95, 479, 123);
		contentPane.add(lblWithCryptographhy);
		
		JLabel lblGettingStartedWith = new JLabel("Getting Started");
		lblGettingStartedWith.setForeground(new Color(255, 255, 255));
		lblGettingStartedWith.setFont(new Font("Constantia", Font.BOLD, 45));
		lblGettingStartedWith.setBounds(33, 25, 326, 123);
		contentPane.add(lblGettingStartedWith);
		
		JLabel lblSoLetsGet = new JLabel("");
		lblSoLetsGet.setIcon(new ImageIcon(qwerty.class.getResource("/img/galaxy-1837306_1920.jpg")));
		lblSoLetsGet.setForeground(new Color(255, 255, 255));
		lblSoLetsGet.setBounds(10, 10, 1289, 749);
		contentPane.add(lblSoLetsGet);
		
		
		
	}
}
