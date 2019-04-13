package practical.iO.iO_Basic;

import java.io.CharArrayWriter;

public class OO21_CharArrayWriter {

	public static void main(String[] args) {
	      
	      CharArrayWriter chw = null;
	            
	      try{
	         // create character array writer
	         chw = new CharArrayWriter();
	         
	         String str = "Hello World!!";
	         
	         // write string to writer
	         chw.write(str);
	         
	         // get array of character from the writer
	         char[] ch = chw.toCharArray();
	         
	         // for each character in character array
	         for (char c : ch)
	         {
	         
	            // print character
	            System.out.println(c);
	         }     
	      }catch(Exception e){
	         
	         // for any error
	         e.printStackTrace();
	      }finally{
	         
	         // releases all system resources from writer
	         if(chw!=null)
	            chw.close();
	      }
	   }

}
