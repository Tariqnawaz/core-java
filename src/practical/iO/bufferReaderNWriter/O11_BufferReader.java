package practical.iO.bufferReaderNWriter;

import java.io.BufferedReader;

public class O11_BufferReader {

	public static void main(String[] args) throws Exception {
	      
	      String  thisLine = null;
	      try{
	         // open input stream test.txt for reading purpose.
	         BufferedReader br = new BufferedReader("C:\test.txt");
	         while ((thisLine = br.readLine()) != null) {
	            System.out.println(thisLine);
	         }       
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	   }

}
