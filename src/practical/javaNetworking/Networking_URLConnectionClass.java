package practical.javaNetworking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Networking_URLConnectionClass {

	public static void main(String[] args){  
		try{  
		URL url=new URL("http://www.javatpoint.com/java-tutorial");  
		URLConnection urlcon=url.openConnection();  
		InputStream stream=urlcon.getInputStream();  
		int i;  
		while((i=stream.read())!=-1){  
		System.out.print((char)i);  
		}  
		}catch(Exception e){System.out.println(e);}  
		}  

}
