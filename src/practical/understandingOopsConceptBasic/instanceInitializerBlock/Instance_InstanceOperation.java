package practical.understandingOopsConceptBasic.instanceInitializerBlock;

public class Instance_InstanceOperation extends A{
	Instance_InstanceOperation(){  
		super();  
		System.out.println("child class constructor invoked");  
		}  
		  
	Instance_InstanceOperation(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
		}  
		  
		{System.out.println("instance initializer block is invoked");} 
	public static void main(String[] args) {
		Instance_InstanceOperation b1=new Instance_InstanceOperation();  
		Instance_InstanceOperation b2=new Instance_InstanceOperation(10);
	}

}
class A{  
A(){  
System.out.println("parent class constructor invoked");  
}  
}