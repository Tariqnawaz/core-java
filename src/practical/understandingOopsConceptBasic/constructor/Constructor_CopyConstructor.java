package practical.understandingOopsConceptBasic.constructor;

public class Constructor_CopyConstructor {

	int id;  
    String name;
    Constructor_CopyConstructor(int id , String name){
    	this.id = id;
    	this.name = name;
    }
    Constructor_CopyConstructor(Constructor_CopyConstructor c){
    	id = c.id;
    	name = c.name;
    }
    void display(){System.out.println(id+" "+name);}  
	public static void main(String[] args) {
		Constructor_CopyConstructor cd = new Constructor_CopyConstructor(101,"ADIL");
		Constructor_CopyConstructor cdd = new Constructor_CopyConstructor(cd);
		cd.display();
		cdd.display();

	}

}
/*
There is no copy constructor in java. But, we can copy the values of one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class
In this example, we are going to copy the values of one object into another using java constructor.
*/