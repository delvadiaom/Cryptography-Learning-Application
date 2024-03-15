package enigmalearner;
//descytale.java
public class descytale {
	
	static String text;
	static int key;
	int y=0;
	String processes;
	 String output = "";
	@SuppressWarnings("unused")
	void execute(display frame1)
	{
	text=frame1.inputArea.getText();
	key=Integer.parseInt(frame1.KeyInput.getText());
	String a= "    # Note for descytale:\n => Special Character & digits do not change\n => Letters in the given Strings are shifted back\n   "
				+ " according to the key in alphabetical order";
    processes= "Text for encryption is \"  " + text + " \"\n\n" + "Key Used for encryption in descytale is \" " + key + " \"\n\n\t";

	
    if(key>=text.length() || key <=0){
        System.out.println(text + "z");
    }
    else{
        while(text.length()%key != 0){
            text += "#";
        }
        int numCols = text.length()/key;
        for(int i = 0; i<numCols; i++)
        {
            for (int y = i; y <text.length(); y+=numCols)
            {
                output += text.charAt(y);
            }
         
        }
        processes= "Text for encryption is \"  " + text + " \"\n\n" + "Key Used for encryption in descytale is \" " + key + " \"\n\n\t";
        
         
         for(int i=0;i<key;i++)
         {
        	 processes=processes +" ---";
         }      processes=processes +"\n";
   
      
         for(int j=0;j<text.length()/key;j++)
         {     processes=processes +"\t|";
        	 for(int i=0;i<key;i++)
        	 {
        	 processes=processes +" "+ output.charAt(y)+" |";
              y++;}
         processes=processes +"\n";
         processes=processes +"\t";

         for(int p=0;p<key;p++)
         {
        	 processes=processes +" ---";
         }
         processes=processes +"\n";
         
         }
         // frame1.ProcessArea.processes
       frame1.ProcessArea.setText(processes+"\nReading Matrix by Rows");

         
         
         
         
         
         
        frame1.OutputArea.setText(output);
     }
	
	}
	}

