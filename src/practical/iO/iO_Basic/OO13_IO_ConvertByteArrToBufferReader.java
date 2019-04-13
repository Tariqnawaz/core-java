package practical.iO.iO_Basic;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OO13_IO_ConvertByteArrToBufferReader {

	public static void main(String[] args) {
		String str = "converting to input stream"+
                "\n and this is second line";
		byte[] content = str.getBytes();
		InputStream is = null;
		BufferedReader bfReader = null;
		try {
		    is = new ByteArrayInputStream(content);
		    bfReader = new BufferedReader(new InputStreamReader(is));
		    String temp = null;
		    while((temp = bfReader.readLine()) != null){
		        System.out.println(temp);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try{
		        if(is != null) is.close();
		    } catch (Exception ex){
		         
		    }
		}

	}

}
