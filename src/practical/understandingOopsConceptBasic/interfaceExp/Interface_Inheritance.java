package practical.understandingOopsConceptBasic.interfaceExp;

public class Interface_Inheritance implements Showable1{
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");} 
	public static void main(String[] args) {
		Interface_Inheritance obj = new Interface_Inheritance();  
		obj.print();  
		obj.show();  

	}

}

interface Printable2{  
void print();  
}  
interface Showable1 extends Printable2{  
void show();  
}
