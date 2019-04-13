package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Static_Variable {

	int id;
	int age;
	String name;
	static String COLLEGE = "Rizvi College Of Science , Commerce and Arts";
	
	public Static_Variable(int id , int age , String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	void displayStudentInformation(){
		System.out.println("Id : " + id+ " Age : " +age+ " Name : " +name+ " College : " + COLLEGE);
	}
	public static void main(String[] args) {
		Static_Variable s = new Static_Variable(101, 23, "Shah Ruk Khan");
		Static_Variable s1 = new Static_Variable(1245, 24, "Salman Khan");
		s.displayStudentInformation();
		s1.displayStudentInformation();
		

	}

}
