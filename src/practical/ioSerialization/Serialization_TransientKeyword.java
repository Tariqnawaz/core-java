package practical.ioSerialization;

import java.io.Serializable;

public class Serialization_TransientKeyword implements Serializable{  
	 int id;  
	 String name;  
	 transient int age;//Now it will not be serialized  
	 public Serialization_TransientKeyword(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }

}
