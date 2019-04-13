package practical.javaNetworking;

import java.net.InetAddress;

public class Networking_InetAddressClass {

	public static void main(String[] args){  
		try{  
		InetAddress ip=InetAddress.getByName("www.javatpoint.com");  
		  
		System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());  
		}catch(Exception e){System.out.println(e);}  
		}  

}
