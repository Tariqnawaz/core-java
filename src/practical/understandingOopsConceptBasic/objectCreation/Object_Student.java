package practical.understandingOopsConceptBasic.objectCreation;

public class Object_Student {
	String name ;
	Integer rollNo;
	
	void insertRecord(Integer rollNo ,String name){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	void displayInformation(){
		System.out.println("Name is : " +name);
	}
	
	public static void main(String[] args) {
		Object_Student s = new Object_Student();
		Object_Student ss = new Object_Student();
		s.insertRecord(101,"Tariq");
		ss.insertRecord(102,"Farhad");
		s.displayInformation();
		ss.displayInformation();
	}

}
