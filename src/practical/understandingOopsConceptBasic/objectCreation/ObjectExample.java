package practical.understandingOopsConceptBasic.objectCreation;

public class ObjectExample {
	public void move(){
		System.out.println("Object move ");
	}

	public static void main(String[] args) {
		ObjectExample oe = new ObjectExample();
	System.out.println("Creating Object" );
	 oe.move();

	}

}
