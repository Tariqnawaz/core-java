package practical.innerClass;

import practical.innerClass.Showable.Message;

public class InnerClass_NestedInterface implements Message {

	public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]){  
	  Showable.Message message=(practical.innerClass.Showable.Message) new InnerClass_NestedInterface();//upcasting here  
	  message.msg();  
	 }  

}

interface Showable{  
	  void show();  
	  interface Message{  
	   void msg();  
	  }  
	}

/*
Syntax of nested interface which is declared within the interface

interface interface_name{  
 ...  
 interface nested_interface_name{  
  ...  
 }  
}   

Syntax of nested interface which is declared within the class

class class_name{  
 ...  
 interface nested_interface_name{  
  ...  
 }  
}   
*/