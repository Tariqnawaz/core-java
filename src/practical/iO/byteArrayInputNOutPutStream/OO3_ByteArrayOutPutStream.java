package practical.iO.byteArrayInputNOutPutStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OO3_ByteArrayOutPutStream {

	public static void main(String[] args) throws IOException {
	      
	      byte[] bs = {65, 66, 67, 68, 69};
	      ByteArrayOutputStream baos = null;
	      
	      try{

	         // create new ByteArrayOutputStream
	         baos = new ByteArrayOutputStream();
	      
	         // write byte array to the output stream
	         baos.write(bs);
	            
	         // for each byte in the buffer
	         for (byte b : baos.toByteArray())
	         {
	            // write byte in to output stream
	            baos.write(b);
	            
	            // print every byte
	            System.out.println(b);
	         }
	      }catch(Exception e){

	         // if I/O error occurs
	         e.printStackTrace();
	      }finally{
	         if(baos!=null)
	            baos.close();
	      }   
	   }

}
