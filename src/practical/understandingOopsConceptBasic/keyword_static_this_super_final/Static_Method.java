package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Static_Method {

	int rollno;  
    String name;  
    static String college = "ITS"; 
    
    static void change(){
    	college = "Rizvi College";
    }
    
    Static_Method(int rollno , String name){
    	this.rollno = rollno;
    	this.name= name;
    }
    
    void display(){
    	System.out.println(rollno  +  name  +  college);
    }
	public static void main(String[] args) {
		//Static_Method.change();
		Static_Method s = new Static_Method(101, "Sadiq");
		s.display();
		change();
		Static_Method s1 = new Static_Method(102, "Rashid");
		s1.display();
		
	}

}
/*
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than object of a class.
A static method can be invoked without the need for creating an instance of a class.
static method can access static data member and can change the value of it.
*/