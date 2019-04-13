package practical.iO.fileWriterNReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class O11_FileReader {

	public static void main(String args[]) throws Exception { 
		FileReader fr = new FileReader("FileReaderDemo.java"); 
		BufferedReader br = new BufferedReader(fr); 
		String s; 
		while((s = br.readLine()) != null) { 
		System.out.println(s); 
		} 
		fr.close(); 
		} 

}
