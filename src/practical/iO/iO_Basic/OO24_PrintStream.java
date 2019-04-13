package practical.iO.iO_Basic;

import java.io.PrintStream;
import java.util.Locale;

public class OO24_PrintStream {

	public static void main(String[] args) {
	      String s = "Hello World";

	      // create printstream object
	      PrintStream ps = new PrintStream(System.out);

	      // printf this string
	      ps.printf(Locale.CANADA, "This is a %s application", s);

	      // flush the stream
	      ps.flush();

	   }

}
