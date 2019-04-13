package practical.iO.iO_Basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OO12_IO_ConvertInputSreamToBufferReader {

	public static void main(String[] args) {
		InputStream is = null;
        BufferedReader bfReader = null;
        try {
            is = new FileInputStream("E:/tariq/tariq.doc");
            bfReader = new BufferedReader(new InputStreamReader(is));
            String temp = null;
            while((temp = bfReader.readLine()) != null){
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
