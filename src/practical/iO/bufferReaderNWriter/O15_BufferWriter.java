package practical.iO.bufferReaderNWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

public class O15_BufferWriter {

	public static void main(String[] args) throws IOException {
	      
	      StringWriter sw = null;
	      BufferedWriter bw = null;
	      
	      String str = "Hello World!";
	      
	      try{
	         // create string writer
	         sw = new StringWriter();
	         
	         //create buffered writer
	         bw = new BufferedWriter(sw);
	         
	         // writing string to writer
	         bw.write(str);
	         
	         // forces out the characters to string writer
	         bw.flush();
	         
	         // string buffer is created
	         StringBuffer sb = sw.getBuffer();
	         
	         //prints the string
	         System.out.println(sb);
	            
	      }catch(IOException e){
	         // if I/O error occurs
	         e.printStackTrace();
	      }finally{
	         // releases any system resources associated with the stream
	         if(sw!=null)
	            sw.close();
	         if(bw!=null)
	            bw.close();
	      }
	   }

}
