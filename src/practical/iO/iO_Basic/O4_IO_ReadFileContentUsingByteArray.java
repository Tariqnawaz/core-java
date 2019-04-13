package practical.iO.iO_Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class O4_IO_ReadFileContentUsingByteArray {

	public static void main(String[] args) {
	String fileName ="E:/tariq.doc";
	InputStream is = null;
	
	try {
		is = new FileInputStream(fileName);
		byte content[] = new byte[2*1024];
        int readCount = 0;
        while((readCount = is.read(content)) > 0){
            System.out.println(new String(content, 0, readCount-1));
        }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try{
            if(is != null) is.close();
        } catch(Exception ex){
             
        }
		}
	
	}

}
