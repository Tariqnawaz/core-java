package practical.innerClass;

public class InnerClass_LocalInnerClass {

	 private int data=30;//instance variable  
	 void display(){  
	  class Local{  
	   void msg(){System.out.println(data);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
		 InnerClass_LocalInnerClass obj=new InnerClass_LocalInnerClass();  
	  obj.display();  
	 }  

}
