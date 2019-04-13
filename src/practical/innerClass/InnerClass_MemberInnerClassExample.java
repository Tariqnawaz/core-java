package practical.innerClass;

public class InnerClass_MemberInnerClassExample {

	private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
		 InnerClass_MemberInnerClassExample obj=new InnerClass_MemberInnerClassExample();  
		 InnerClass_MemberInnerClassExample.Inner in=obj.new Inner();  
	  in.msg();  
	 }  

}

/*
Java Member inner class
A non-static class that is created inside a class but outside a method is called member inner class.

above example, we are creating msg() method in member inner class that is accessing the private data member of outer class.
*/