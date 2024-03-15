package enigmalearner;
//ReadWrite.java
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReadWrite {
	
	static String text;
	static String key;
	static String ci;
	static String ci1;

	 
	static scytale scytale;
	static cyser cyser;
	static Playfair Playfair;
	static descytale descytale;
	static decaeser decaeser;
	static deplayfair deplayfair;
	static md5 md5;
	static SHA256 SHA256;
	static int  choosen; 
	
	
	static displayhash frame22 = new displayhash();
	static display frame = new display();
	static choose choose =new choose();
	public static void mai(String[] args) {
		enigmalearner.choose.main(null);
	}
	
	public static void maa(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {

					
					
					if(choosen==1)
						{frame.setVisible(true);
						frame22.setVisible(false);}
					else if(choosen==2)
						{frame.setVisible(false);
						frame22.setVisible(true);}
				frame.btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
													
							
							
							ci= frame.comboBox.getSelectedItem().toString();
							
							if(ci=="Scytale")
							{
							scytale = new scytale();
							scytale.execute(frame);
							}
							else if( ci=="Caeser")
							{
							cyser =new cyser();
							cyser.execute(frame);
							}	
							else if( ci=="Playfair")
							{
								Playfair=new Playfair();
								Playfair.execute(frame);
							}
							else if(ci=="vigenere") {
								vigenere v = new vigenere();
								v.execute(frame);
							}
						
						
						}
					});
					
					
					
					frame22.btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
													
							
							
							ci= frame22.comboBox.getSelectedItem().toString();
							
							if(ci=="md5")
							{
							md5 =new md5();
							enigmalearner.md5.execute(frame22);
							}
							
							else if( ci=="SHA256")
							{
								SHA256 =new SHA256();
								enigmalearner.SHA256.execute(frame22);
							}
						
							
							}
						
					});
				
				
					frame.btnDecrypt.addMouseListener(new MouseAdapter() {
						
						public void mouseClicked(MouseEvent e) {
							ci= frame.comboBox.getSelectedItem().toString();
							if(ci=="Scytale")
							{
							descytale = new descytale();
							descytale.execute(frame);
							}
							else if( ci=="Caeser")
							{
								decaeser =new decaeser();
								decaeser.execute(frame);
							}	
							else if( ci=="Playfair")
							{
								deplayfair=new deplayfair();
								deplayfair.execute(frame);
							}
							
							
						}
					});
					
										
					
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		

	}

}
