package practical.iO.iO_Basic;

import java.io.File;

public class O8_IO_GiveURLReference {

	public static void main(String[] args) {
		File f = new File("E:/tariq/tariq.doc");
        System.out.println(f.toURI());
	}

}
