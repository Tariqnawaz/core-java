package practical.understandingOopsConceptBasic.constructor;

public class Constructor_Parameterized {

	int id;
	String name;
	Constructor_Parameterized(int id , String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void displayStudentInformation(){
		System.out.println("Student info is : " +id + " " + name);
	}
	public static void main(String[] args) {
		Constructor_Parameterized c = new Constructor_Parameterized(101,"Abdul");
		Constructor_Parameterized c1 = new Constructor_Parameterized(102,"Rafiq");
		c.displayStudentInformation();
		c1.displayStudentInformation();
	}

}
