package practical.understandingOopsConceptBasic.constructor;

public class Constructor_CopyValueWithoutConstructor {

	int id;  
    String name;
    Constructor_CopyValueWithoutConstructor(int id , String name){
    	this.id = id;
    	this.name = name;
    }
    Constructor_CopyValueWithoutConstructor(){
    }
    
    void display(){System.out.println(id+" "+name);}
    
	public static void main(String[] args) {
		Constructor_CopyValueWithoutConstructor c = new Constructor_CopyValueWithoutConstructor(101, "AMIR");
		Constructor_CopyValueWithoutConstructor cd = new Constructor_CopyValueWithoutConstructor();
		cd.id = c.id;
		cd.name = c.name;
		c.display();
		cd.display();
	}

}
