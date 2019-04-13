package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Super_PersonOperation extends Person{
	void message(){System.out.println("welcome to java");}  
	  
	void display(){  
	message();//will invoke current class message() method  
	super.message();//will invoke parent class message() method  
	}  
	public static void main(String[] args) {
		Super_PersonOperation s=new Super_PersonOperation();  
		s.display();  

	}

}
class Person{  
void message(){System.out.println("welcome");}  
}
