package practical.iO.bufferedInputNOutPutStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class O14_BufferedInputStream {

	public static void main(String[] args) throws Exception {

	      InputStream inStream = null;
	      BufferedInputStream bis = null;

	      try{
	         // open input stream test.txt for reading purpose.
	         inStream = new FileInputStream("c:/test.txt");
	         
	         // input stream is converted to buffered input stream
	         bis = new BufferedInputStream(inStream);
	         
	         // read number of bytes available
	         int numByte = bis.available();
	         
	         // byte array declared
	         byte[] buf = new byte[numByte];
	         
	         // read byte into buf , starts at offset 2, 3 bytes to read
	         bis.read(buf, 2, 3);
	         
	         // for each byte in buf
	         for (byte b : buf) {
	            System.out.println((char)b+": " + b);
	         }
	         }catch(Exception e){
	            e.printStackTrace();
	         }finally{
	            // releases any system resources associated with the stream
	            if(inStream!=null)
	               inStream.close();
	            if(bis!=null)
	               bis.close();
	      }	
	   }

}
