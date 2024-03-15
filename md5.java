package enigmalearner;

import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 
  
public class md5 
{
	static String text;
	static  String processes;
	static  String output;
	static void execute(displayhash frame22)
	{
		text=frame22.inputArea.getText();
		String a="# Note for md5\n\t=> MD5 algorithm operates on a 128-bit state,\n\t divided into four 32-bit words, denoted A, B,\n\t C, and D\n\t=> It contains certain blocks which further contains \n\t 4 similar rounds each composed of 16 similar functions\n\t => There are 4 possible functions in each round:\n\tF(B,C,D)=(B^C)V(-B^D)\n\tG(B,C,D)=(B^D)V(C^-D)\n\tH(B,C,D)=B+C+D\n\tI(B,C,D)=C+(BV-D)\n+,^,V,- represents XOR, AND, OR, NOT\n";
		processes= "Text for Hashing is \"  " + text + " \"\n\n\t";
		String processes = "Text for Hashing is \"  " + text + " \"\n\n\t"+a;
	     frame22.OutputArea.setText("It's an error");
	        frame22.ProcessArea.setText( processes);
	String input = text;
        try { 
  
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
           output = hashtext;
           frame22.OutputArea.setText(output);
           frame22.ProcessArea.setText( processes);
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
  
    
} 
