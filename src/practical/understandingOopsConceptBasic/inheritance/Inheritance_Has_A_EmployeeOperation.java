package practical.understandingOopsConceptBasic.inheritance;

public class Inheritance_Has_A_EmployeeOperation {
	int id;  
	String name;  
	Address address;  
	  
	public Inheritance_Has_A_EmployeeOperation(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	} 
	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");
		
		Inheritance_Has_A_EmployeeOperation e=new Inheritance_Has_A_EmployeeOperation(111,"Javed",address1);  
		Inheritance_Has_A_EmployeeOperation e2=new Inheritance_Has_A_EmployeeOperation(112,"Aziz",address2);  
		      
		e.display();  
		e2.display(); 
	}

}
class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}
