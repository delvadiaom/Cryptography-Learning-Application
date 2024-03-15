package enigmalearner;

public class decaeser {


	static String text;
	static int key;
	int y=0;
	String processes="";
	 String output = "";

	    

	void execute(display frame1)
	{
		
		

	
	text=frame1.inputArea.getText();
	key=Integer.parseInt(frame1.KeyInput.getText());

	 String a= "    # Note for Caeser:\n => Special Character & digits do not change\n => Letters in the given Strings are shifted\n   "
	 					+ " according to the key in alphabetical order";
	 processes= "Text for encryption is \"" + text + "\"\n\n" + "Key Used for encryption in Caeser is \" " + key + " \"\n\n\t" + a+"\n\n\n\n";
	 
	  for(int i=0; i < text.length();i++) 
      {
           // key one character at a time
          char alphabet = text.charAt(i);
          processes=processes+"  "+alphabet+ "  =>  Shift  back according to key( -"+key+" )  =>  ";
          // if alphabet lies between a and z 
          if(alphabet >= 'a' && alphabet <= 'z') 
          {
           // key alphabet
           alphabet = (char) (alphabet - key);
           // if key alphabet greater than 'z'
           if(alphabet > 'z') {
              
              alphabet = (char) (alphabet-'a'-'z'-1);
           }
           output = output + alphabet;
          }
          
          // if alphabet lies between 'A'and 'Z'
          else if(alphabet >= 'A' && alphabet <= 'Z') {
           // key alphabet
           alphabet = (char) (alphabet - key);    
              
           // if key alphabet greater than 'Z'
           if(alphabet > 'Z') {

        	   alphabet = (char) (alphabet-'A'-'Z'-1);
           }
           output = output + alphabet;
          }
          else {
           output = output + alphabet;   
          }
          processes=processes+"  "+alphabet+"\n";










      }

frame1.ProcessArea.setText(processes);
frame1.OutputArea.setText(output);
	}
	
    
    
    
}