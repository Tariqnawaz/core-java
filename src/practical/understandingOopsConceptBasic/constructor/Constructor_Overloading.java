package practical.understandingOopsConceptBasic.constructor;

public class Constructor_Overloading {

	int id;
	int age ; 
	String name;
	
	Constructor_Overloading(int i , String n){
		id = i;
		name = n;
	}
	Constructor_Overloading(int i , String n , int a){
		id = i;
		name = n;
		age = a;
	}
	void dispaly(){
		System.out.println("1st constructor with two parameter" + id +" " + name);
	}
	void dispalyInformation(){
		System.out.println("2st constructor with Three parameter" + id +" " + name + " " + age);
	}
	public static void main(String[] args) {
		Constructor_Overloading c = new Constructor_Overloading(101, "ADIL");
		Constructor_Overloading c1 = new Constructor_Overloading(1001, "YASIR" , 25);
		c.dispaly();
		c1.dispalyInformation();

	}

}
