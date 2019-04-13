package practical.understandingOopsConceptBasic.instanceOfOperator;

public class InstanceOf_RealUse {

	public static void main(String[] args) {
		Printable p=new B();  
		Call c=new Call();  
		c.invoke(p);

	}

}

interface Printable{}  
class A implements Printable{  
public void a(){System.out.println("a method");}  
}  
class B implements Printable{  
public void b(){System.out.println("b method");}  
}  
  
class Call{  
void invoke(Printable p){//upcasting  
if(p instanceof A){  
A a=(A)p;//Downcasting   
a.a();  
}  
if(p instanceof B){  
B b=(B)p;//Downcasting   
b.b();  
}  
  
}  
}//end of Call class  