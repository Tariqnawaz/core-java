package practical.iO.iO_Basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class O5_IO_ReadLinesFromFile {

	public static void main(String[] args) {
	BufferedReader br = null;
	String strLine = "";
	
	try {
		br = new BufferedReader(new FileReader("filename"));
		while ( (strLine = br.readLine()) != null){
			System.out.println(strLine);
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
