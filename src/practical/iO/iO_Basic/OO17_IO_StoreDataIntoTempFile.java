package practical.iO.iO_Basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OO17_IO_StoreDataIntoTempFile {

	public static void main(String[] args) {
		File tempFile = null;
        BufferedWriter writer = null;
        try {
            tempFile = File.createTempFile("E:/tariq/tariq.doc", ".tmp");
            writer = new BufferedWriter(new FileWriter(tempFile));
            writer.write("Writing data into temp file!!!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try{
                if(writer != null) writer.close();
            }catch(Exception ex){}
        }
        System.out.println("Stored data in temporary file.");
	}

}
