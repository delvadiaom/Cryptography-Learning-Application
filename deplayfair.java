package enigmalearner;
import java.awt.*;
public class deplayfair {


	static String text;
	static String key;
	static  String processes="";
	static  String output;
	static char b;
	int u,v;

	   char[] alpha={'A','B','C','D','E','F','G','H','I','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	   char[][] matrix=new char[5][5]; 
	   StringBuffer buffer=new StringBuffer();
		
		

	void execute(display frame1)
	{  text=frame1.inputArea.getText();
	key=frame1.KeyInput.getText();
	String text1=text;
	
	String a= "    # Note for Playfair:\n => Key Should not contain \"J\"\n => The letters are arranged in a 5x5 grid \n => To encode a message, one breaks it into two-letter chunks.\n => Changing input text to Upper Case \n "+
			 "=> Repeated letters are usually separated by an X.";
	processes= "Text for encryption is \"  " + text + " \"\n\n" + "Key Used for decryption in Playfair is \" " + key + " \"\n\n\t"+a+"\n\n";
	processes=processes +"\t 5x5 grid according to key\n\t\t";
	
	char[] keyarraay=key.toUpperCase().toCharArray();
  
	 int j=0,k=0;
     for (int i=0;i<keyarraay.length;i++){
        if(k!=5){
           if(!check(keyarraay[i])){
           matrix[j][k++]=keyarraay[i];
           }
        }else {
           i--;
           k=0;j++;
        }
     }

     for (int i=0;i<alpha.length;i++){
        if(k!=5){
           if(!check(alpha[i])){
              matrix[j][k++]=alpha[i];
           }
        }else {
           i--;
           k=0;j++;
        }
     }

     for(int i=0;i<5;i++)
     {
    	 processes=processes +" ---";
     }      processes=processes +"\n\t\t";
 for (int i=0;i<5;i++) {
    for (int j1 = 0; j1 < 5; j1++) {
        
        processes=processes+"| "+matrix[i][j1]+" ";
       
     }
    processes=processes+"|\n\t\t";
  }
 for(int i=0;i<5;i++)
 {
	 processes=processes +" ---";
 }      processes=processes +"\n";
 output=decrypt(text);
 u=output.length()-2;
 for(v=0;v<text1.length()-1;v++,u--)
 processes=processes +text1.charAt(v)+text1.charAt(v+1)+"==> replaced according to ==>"+output.charAt(u)+output.charAt(u+1)+"\n";
 
 

 frame1.OutputArea.setText(output);
 frame1.ProcessArea.setText(processes);
	

	}
	public Point find(char c){
	      Point p=null;
	      for (int i=0;i<5;i++) {
	         for (int j = 0; j < 5; j++) {
	            if(matrix[i][j]==c){
	               p=new Point(i,j);
	               return p;
	            }
	         }
	      }
	      return p;
	   }
	
	public String decrypt(String msg){

	      buffer.delete(0,buffer.length());
	      msg=msg.toUpperCase();

	      char[] msgs=msg.toCharArray();

	      for (int i=0;i<msgs.length;i++){
	         Point x1=find(msgs[i++]);
	         Point x2=find(msgs[i]);

	         if(x1.x==x2.x){              if(x1.y-1<0){
	               x1.y=4;
	            }
	            else {
	               x1.y--;
	            }
	            if(x2.y-1<0){
	               x2.y=4;
	            }else {
	               x2.y--;
	            }
	            buffer.append(matrix[x1.x][x1.y]);
	            buffer.append(matrix[x2.x][x2.y]);
	         }else if(x1.y==x2.y){  
	            if(x1.x-1<0){
	               x1.x=4;
	            }
	            else {
	               x1.x--;
	            }
	            if(x2.x-1<0){
	               x2.x=4;
	            }else {
	               x2.x--;
	            }
	            buffer.append(matrix[x1.x][x1.y]);
	            buffer.append(matrix[x2.x][x2.y]);
	         }else{  
	        	 if(x2.x>x1.x) {
	               int d=x2.x-x1.x;
	               x2.x=x2.x-d;
	               x1.x=x1.x+d;
	            }else{
	               int d=x1.x-x2.x;
	               x2.x=x2.x+d;
	               x1.x=x1.x-d;
	            }
	            buffer.append(matrix[x2.x][x2.y]);
	            buffer.append(matrix[x1.x][x1.y]);

	         }

	      }

	      return buffer.toString();
	   }

	
	 boolean check(char a){
	      for (int i=0;i<5;i++) {
	         for (int j = 0; j < 5; j++) {
	            if(matrix[i][j]==a){
	               return true;
	            }
	         }
	      }
	      return false;
	   }



	   
}
