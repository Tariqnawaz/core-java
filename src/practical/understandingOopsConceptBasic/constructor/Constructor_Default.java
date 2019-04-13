package practical.understandingOopsConceptBasic.constructor;

public class Constructor_Default {

	int id;
	String name;
	
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Constructor_Default c = new Constructor_Default();
		Constructor_Default c1 = new Constructor_Default();
		c.display();
		c1.display();
	}

}
