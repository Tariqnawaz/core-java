package practical.iO.iO_Basic;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class OO15_IO_ReadFileUsingBufferInputStream {

	public static void main(String[] args) {
		InputStream is = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        try {
            is = new FileInputStream("E:/tariq/tariq.doc");
            bis = new BufferedInputStream(is);
            dis = new DataInputStream(bis);
            String temp = null;
            while((temp = dis.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
