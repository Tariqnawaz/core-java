package practical.understandingOopsConceptBasic.objectCreation;

public class Object_Rectangle_Multiple {

	Integer length ;
	Integer breath;
	
	void insertAreaOfRectangle(Integer length , Integer breath){
		this.length = length;
		this.breath = breath;
	}
	
	void dispalayRec(){
		System.out.println("Rectangle is : " + length * breath);
	}
	
	public static void main(String[] args) {
		Object_Rectangle_Multiple r1 = new Object_Rectangle_Multiple(),r2 = new Object_Rectangle_Multiple(); // creating two object
		
		r1.insertAreaOfRectangle(5, 9);
		r2.insertAreaOfRectangle(2, 11);
		
		r1.dispalayRec();
		r2.dispalayRec();
	}

}
