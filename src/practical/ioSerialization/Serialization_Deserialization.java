package practical.ioSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Serialization_Deserialization {

	public static void main(String args[])throws Exception{  
	    
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  Serialization_Interface s=(Serialization_Interface)in.readObject();  
		  System.out.println(s.id+" "+s.name);  
		  
		  in.close();  
		 }  

}
