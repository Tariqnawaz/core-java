package practical.iO.byteArrayInputNOutPutStream;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class O6_ByteArrayInputStreamWithStringBuilder {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String message = stdIn.nextLine();
		StringBuilder sb = new StringBuilder();
		
		ByteArrayInputStream str = new ByteArrayInputStream(message.getBytes());
		
		int ch;
		while ( (ch = str.read()) != -1) {
			sb.append(Character.toUpperCase((char) ch));
		}
		System.out.println("Your capitalized message: "+sb.toString());

	}

}
