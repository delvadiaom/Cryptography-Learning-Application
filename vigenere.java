package enigmalearner;
class vigenere 
{ 
  
	static String text;
	static String key;
	int y=0;
    static String processes;              // 490 398
	 String output = "";
	 void execute(display frame1)
	{
	text=frame1.inputArea.getText();
	key=frame1.KeyInput.getText();
	processes="...index wise processing...\n\t";
	String cipher_text=cipherText(text,key);
	   output=cipher_text;
//	 String otext=originalText(text,key);
//	   output=otext;
	   System.out.print("tcfvgbhjn");
	 frame1.OutputArea.setText(output);  
	}
static String generateKey(String str, String key) 
{ 
    int x = str.length(); 
  
    for (int i = 0; ; i++) 
    { 
        if (x == i) 
            i = 0; 
        if (key.length() == str.length()) 
            break; 
        key+=(key.charAt(i)); 
    } 
    return key; 
} 
  
// This function returns the encrypted text 
// generated with the help of the key 
static String cipherText(String str, String key) 
{ 
    String cipher_text=""; 
  
    for (int i = 0; i < str.length(); i++) 
    { 
        // converting in range 0-25 
        int x = (str.charAt(i) + key.charAt(i)) %26; 
  
        // convert into alphabets(ASCII) 
        
        x += 'A'; 
  
        cipher_text+=(char)(x); 
        processes="cipher["+i+"]";
        processes=processes+cipher_text;
    } 
    return cipher_text; 
} 
  
// This function decrypts the encrypted text 
// and returns the original text 
static String originalText(String cipher_text, String key) 
{ 
    String orig_text=""; 
  
    for (int i = 0 ; i < cipher_text.length() &&  
                            i < key.length(); i++) 
    { 
        // converting in range 0-25 
        int x = (cipher_text.charAt(i) -  
                    key.charAt(i) + 26) %26; 
  
        // convert into alphabets(ASCII) 
        x += 'A'; 
        orig_text+=(char)(x); 
    } 
    return orig_text; 
} 
} 
  
