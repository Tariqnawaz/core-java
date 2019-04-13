package practical.iO.byteArrayInputNOutPutStream;

import java.io.ByteArrayOutputStream;

public class OO1_ByteArrayOutPutStream {
	public static void main(String[] args) {

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		for (int i=0;i<10;i++) {
			bout.write((byte) (Math.random() * 100));
		}
		
		byte[] byteArray = bout.toByteArray();
		for (byte b : byteArray)
			System.out.print(b+" ");
	}

}
