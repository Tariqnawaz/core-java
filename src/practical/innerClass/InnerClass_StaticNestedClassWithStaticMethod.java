package practical.innerClass;

public class InnerClass_StaticNestedClassWithStaticMethod {

	static int data=30;  
	  static class Inner{  
	   static void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
		  InnerClass_StaticNestedClassWithStaticMethod.Inner.msg();//no need to create the instance of static nested class  
	  }  

}
