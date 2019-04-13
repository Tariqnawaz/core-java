package practical.iO.byteArrayInputNOutPutStream;

import java.io.ByteArrayInputStream;
import java.util.Random;

public class O3_ByteArrayInputStream {

	public static void main(String[] args) {
		byte[] buffer = new byte[10];
		Random rnd = new Random();
		
		for (int i=0;i<buffer.length;i++) {
			buffer[i] = (byte) rnd.nextInt();
		}
		
		ByteArrayInputStream b = new ByteArrayInputStream(buffer);
		
		System.out.println("All the elements in the buffer:");
		
		int num;
		while( (num = b.read()) != -1 ) {
			System.out.print(num+" ");
		}
		
	}

}
