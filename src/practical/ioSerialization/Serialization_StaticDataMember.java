package practical.ioSerialization;

import java.io.Serializable;

public class Serialization_StaticDataMember  implements Serializable{  
	 int id;  
	 String name;  
	 static String company="SSS IT Pvt Ltd";//it won't be serialized  
	 public Serialization_StaticDataMember(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  

}
