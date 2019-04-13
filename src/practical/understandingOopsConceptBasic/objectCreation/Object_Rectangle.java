package practical.understandingOopsConceptBasic.objectCreation;

public class Object_Rectangle {
	Integer lenght ;
	Integer width ; 
	
	void insertAreaOfRectangle(Integer lenght , Integer width)
	{
		this.lenght = lenght;
		this.width = width;
	}
	
	void displayAreaOfRectangle(){
		System.out.println("Area of Rectangle is : " + lenght * width);
	}
	public static void main(String[] args) {
	Object_Rectangle rectangle = new Object_Rectangle();
	rectangle.insertAreaOfRectangle(5, 7);
	rectangle.displayAreaOfRectangle();
	}

}
