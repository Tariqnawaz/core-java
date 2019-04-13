package practical.understandingOopsConceptBasic.polymorphism;

public class Runtime_PolymorphismWithDataMember extends Bike1{
	int speedlimit=150;
	public static void main(String[] args) {
		Bike1 obj=new Runtime_PolymorphismWithDataMember();  
		  System.out.println(obj.speedlimit);//90 
	}

}
class Bike1{  
	 int speedlimit=90;  
	} 

/*
Java Runtime Polymorphism with data member

Method is overridden not the datamembers, so runtime polymorphism can't be achieved by data members.
In the example given below, both the classes have a datamember speedlimit, we are accessing the datamember by the reference
variable of Parent class which refers to the subclass object. Since we are accessing the datamember which is not overridden,
hence it will access the datamember of Parent class always.
*/