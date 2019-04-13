package practical.understandingOopsConceptBasic.interfaceExp;

public class Interface_MultipleInheritance implements Printable1 , Showable{
	
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  
	public static void main(String[] args) {
		Interface_MultipleInheritance obj = new Interface_MultipleInheritance();  
		obj.print();  
		obj.show();

	}

}

interface Printable1{  
void print();  
}  
  
interface Showable{  
void show();  
}  
