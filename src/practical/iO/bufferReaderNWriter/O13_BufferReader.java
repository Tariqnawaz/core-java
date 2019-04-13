package practical.iO.bufferReaderNWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class O13_BufferReader {

	 private static final String OUTPUT_FILE = null;

	public static void main(String[] args) {

	        String str = "";
	        char[] chars = new char[100];

	        try (BufferedReader bufReader = new BufferedReader(new FileReader(new File(OUTPUT_FILE)),4096)) {

	            // read 100 characters from the file
	            bufReader.read(chars);
	            System.out.println(Arrays.toString(chars));

	            // fill the array with blank character for the next invocation
	            Arrays.fill(chars,' ');

	            // read 20 characters from the file
	            bufReader.read(chars,7,20);
	            System.out.println(Arrays.toString(chars));

	            // read the rest of the file line by line
	            while ( (  str = bufReader.readLine() ) != null )
	                System.out.println(str);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
