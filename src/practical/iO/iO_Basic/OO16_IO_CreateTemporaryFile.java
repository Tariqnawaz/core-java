package practical.iO.iO_Basic;

import java.io.File;
import java.io.IOException;

public class OO16_IO_CreateTemporaryFile {

	public static void main(String[] args) {
		File tmpFile = null;
        try {
            tmpFile = File.createTempFile("E:/tariq/tariq.doc", ".tmp");
            System.out.println("Created Temp File Location : " + tmpFile.getAbsolutePath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
