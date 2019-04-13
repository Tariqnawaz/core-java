package practical.ioSerialization;

import java.io.Serializable;

public class Serialization_Interface implements Serializable{  
	 int id;  
	 String name;  
	 public Serialization_Interface(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }

}

/*
java.io.Serializable interface
Serializable is a marker interface (has no body). It is just used to "mark" java classes which support a certain capability.
It must be implemented by the class whose object you want to persist.
*/