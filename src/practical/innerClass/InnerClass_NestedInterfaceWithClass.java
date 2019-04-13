package practical.innerClass;

public class InnerClass_NestedInterfaceWithClass implements A.Message{  
	 public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]){  
	  A.Message message=new InnerClass_NestedInterfaceWithClass();//upcasting here  
	  message.msg();  
	 }  

}
class A{  
	  interface Message{  
	   void msg();  
	  }  
	} 