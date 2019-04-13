package practical.ioSerialization;

public class Serialization_Inheritance extends Serialization_Interface{  
	 String course;  
	 int fee;  
	 public Serialization_Inheritance(int id, String name, String course, int fee) {  
	  super(id,name);  
	  this.course=course;  
	  this.fee=fee;  
	 }  

}
