package practical.understandingOopsConceptBasic.inheritance;

public class Inheritance_Example extends Employee{
	int bonus= 10000;
	
	public static void main(String[] args) {
		Inheritance_Example i = new Inheritance_Example();
		 System.out.println("Programmer salary is:"+i.salary);  
		   System.out.println("Bonus of Programmer is:"+i.bonus);  

	}

}
class Employee{
	float salary =40000;
}
