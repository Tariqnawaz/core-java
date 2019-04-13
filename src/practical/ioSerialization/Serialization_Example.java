package practical.ioSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization_Example {

	public static void main(String args[])throws Exception{  
		Serialization_Interface s1 =new Serialization_Interface(211,"ravi");  
		  
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success");  
		 }  

}
