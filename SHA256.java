package enigmalearner;

import java.math.BigInteger;  
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  
  
// Java program to calculate SHA hash value  
  
class SHA256 {  
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
    {  
        // Static getInstance method is called with hashing SHA  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
  
        // digest() method called  
        // to calculate message digest of an input  
        // and return array of byte 
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    } 
    
    public static String toHexString(byte[] hash) 
    { 
        // Convert byte array into signum representation  
        BigInteger number = new BigInteger(1, hash);  
  
        // Convert message digest into hex value  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        // Pad with leading zeros 
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
    } 
  
    // Driver code  
    public static void execute(displayhash frame22) 
    {  String a="# Note for SHA-256\nNote 1: All variables are 32 bit unsigned integers \n\tand addition is calculated modulo 232\r\n" + 
			"Note 2: For each round, there is one round constant k[i]\n\tand one entry\tin the message schedule array w[i],\n\t 0 ≤ i ≤ 63\r\n" + 
			"Note 3: The compression function uses 8 working variables,\n\ta through h\r\n" + 
			"Note 4: Big-endian convention is used when expressing the \n\tconstants in this pseudocode,\r" + 
			"    and when parsing \n\tmessage block data from bytes to words,\n for example,\r\n" + 
			"    the first word of the input message \"abc\"\n\t after padding is 0x61626380\n";
	String text=frame22.inputArea.getText();  ;
	String processes = "Text for Hashing is \"  " + text + " \"\n\n\t"+a;

        try 
        { 
 
            
          frame22.OutputArea.setText(toHexString(getSHA(text)));
        frame22.ProcessArea.setText( processes);
        } 
        // For specifying wrong message digest algorithms  
        catch (NoSuchAlgorithmException e) {  
            System.out.println("Exception thrown for incorrect algorithm: " + e);  
        }  
    }  
}  