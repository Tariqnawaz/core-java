package practical.string.stringBasic;

import java.util.StringTokenizer;

public class String_StringTokenizerClassNextTokenMethod {

	public static void main(String[] args) {  
	       StringTokenizer st = new StringTokenizer("my,name,is,khan");  
	        
	      // printing next token  
	      System.out.println("Next token is : " + st.nextToken(","));  
	   }    

}
