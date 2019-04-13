package object;

/*equals() method is a non-static method of java.lang.Object class. As all classes in java are sub classes of Object class, 
 * this method is inherited to every class you create in java. Here is the method signature of equals() method.*/
public class O001_ObjectClassExample {
	public static void main(String[] args){
       //Creating object of Class A and assigning it to a1
       A a1 = new A(); 
       //a1 is assigned to a2
       A a2 = a1;
       //That means a1 and a2 are pointing to same object.
       //Calling a1.equals(a2) will return true
       System.out.println(a1.equals(a2));       //Output : true
       //Creating another object of Class A and assigning it to a2
       a2 = new A();
       //Now, a1 and a2 will be pointing to different objects.
       //Now calling a1.equals(a2) will return false
       System.out.println(a1.equals(a2));      //Output : false
   }		
}

class A{
    int i = 10;
}

/*Overriding equals() method in your class :
As equals() method is not a final method, you can override it in your class so that you can compare the contents of two objects not just 
their physical address. i.e you can override equals() method so that it should return true if two objects have same contents.*/

class A1{
    int i;
    public A1(int i){
        this.i = i;
    }
    //Overriding equals() method
    @Override
    public boolean equals(Object obj){
        A a = (A) obj;
        //Comparing the fields of calling object and passed object
        return this.i == a.i;
    }
}
 
class Test1{
   public static void main(String[] args){
      //Creating object of Class A with i = 10
      A1 a1 = new A1(10);
      //Creating object of Class A with i = 20
      A1 a2 = new A1(20);
      //a1 and a2 have different contents
      //So calling a1.equals(a2) will return false
      System.out.println(a1.equals(a2));        //Output : false
      //Changing the value of a2.i to 10
      a2.i = 10;
      //Now, a1 and a2 have same contents
      //Now, calling a1.equals(a2) will return true
      System.out.println(a1.equals(a2));      //Output : true
   }
}

/* Difference Between “==” Operator and “equals() method” :
   As both “==” operator and equals() method are used to compare two objects, here are some differences between them.

 “==” operator returns true if and only if two references variables are pointing to same object. That means it checks only physical 
 address of the objects not their contents. Default version of equals() method also compares physical address of two objects, but you 
 can override and modify it to compare the contents of two objects.
 
You can use “==” operator to compare derived types as well as primitive types. But, equals() method is used only to compare the 
derived types.*/

class Test2{
   public static void main(String[] args){
      Integer I1 = new Integer(10);
      Integer I2 = new Integer(10);
      System.out.println(I1.equals(I2));       //Output : true
 
      Double D1 = new Double(25.6);
      Double D2 = new Double(25.6);
      System.out.println(D1.equals(D2));      //Output : true
 
      String s1 = new String("abc");
      String s2 = new String("abc");
      System.out.println(s1.equals(s2));     //Output : true
   }
}
/*Here is an example to show how to override equals() method to compare two objects having more than one fields.*/
class A2{
    int i;
    double j;
    String s;
    public A2(int i, double j, String s){
        this.i = i;
        this.j = j;
        this.s = s;
    }
    //Overriding equals() method
    @Override
    public boolean equals(Object obj){
        A2 a = (A2) obj;
        //Comparing the fields of calling object and passed object
        return this.i == a.i && this.j == a.j && this.s == a.s;
    }
}
 
class Test3{
   public static void main(String[] args){
      A2 a1 = new A2(10, 25.6, "First_Object");
      A2 a2 = new A2(20, 45.8, "Second_Object");
 
      System.out.println(a1.equals(a2));       //Output : false
      a2 = new A2(10, 25.6, "First_Object");
      System.out.println(a1.equals(a2));     //Output : true
   }
}

/* hashCode() Method Of java.lang.Object Class */
/* hashCode() method is also a non-static member of java.lang.Object class. It is also, like toString() and equals() methods, 
 * inherited to all classes you create in java. It returns an integer representation of memory address of the object.  */
class A4{
    int i = 10;
}
 
class HashCodeMethodDemo4{
   public static void main(String[] args){
       //Creating an instance of Class A
       A4 a = new A4();
        //Calling hashCode() method on a.
       System.out.println(a.hashCode());       //Output : 19770577
       //19770577 is an integer representation of memory address of object 'a'
   }
}

/*Contract Between equals() And hashCode() Method :
equals() and hashCode() methods of Object class are used to check the identity of objects. It is recommended that if you override one 
method then you must override other also. There is a relation or contract between these two methods that must be maintained all the time. 
That contract can be defined like this,

“If two objects are equal according to equals() method then they must have same hashcode() value. But, reverse is not always true.”*/

class Person{
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
 
    //Overriding equals() method
    @Override
    public boolean equals(Object obj){
        Person person = (Person) obj;
        return this.firstName == person.firstName && this.lastName == person.lastName && this.age == person.age;
    }
    //Overriding hashCode() method
    @Override
    public int hashCode(){
        int hashCode = 0;
        hashCode += firstName.hashCode();
        hashCode += lastName.hashCode();
        hashCode += Integer.toString(age).hashCode();
        return hashCode;
    }
}
 
class HashCodeMethodDemo5{
   public static void main(String[] args){
       //Creating two objects of Person with same content
       Person p1 = new Person("Robin", "Smith", 42);
       Person p2 = new Person("Robin", "Smith", 42);
       //Now, comparing p1 and p2 using equals() method
       //It will return true as both the objects have same content
       System.out.println(p1.equals(p2));       //Output : true
       //They will also have same hashcode value.
       System.out.println(p1.hashCode());      //Output : 159138795
       System.out.println(p2.hashCode());      //Output : 159138795
   }
}

/* clone() Method Of java.lang.Object Class */
/* clone() method is a non-static protected method of java.lang.Object class. This method is used to create a clone or copy of the 
 * given object. It throws CloneNotSupportedException if an object is not clone-able. 
 
 Not all the objects in java are clone-able. In order to make an object clone-able, the class of that object must implement Cloneable 
 interface. Cloneable interface is a marker interface. It does not have any methods or fields in it. It is just used to provide a marker 
 for cloning operation.
 */
class A5 implements Cloneable{
	int i;
	int j;
	public A5(int i, int j){
		this.i = i;
		this.j = j;
	}
	//Overriding clone() method
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class CloneMethodDemo5{
   public static void main(String[] args){
	   //Creating an instance of Class A
	   A5 a1 = new A5(10, 20);
	   //Declaring reference variable of Class A and assigning null to it
	   A2 a2 = null;
	   //enclosing a1.clone() in try-catch blocks
	   //as clone() throws CloneNotSupportedException
	   try{
		   //Creating a clone of a1 and assigning it to a2
		   a2 = (A2) a1.clone();
	   }catch (CloneNotSupportedException e){
		   System.out.println("Object is not clone-able");
	   }
	   System.out.println(a2.i);   //Output : 10
	   System.out.println(a2.j);   //Output : 20
   }
}

/* Shallow Copy And Deep Copy :
If a cloned object and original objects are not 100% disjoint, then it is called shallow copy. In shallow copy operation, any changes 
made to clone will be reflected in the original or vice-versa. This happens when an object has reference variables as fields. */
class A6{
	int i;
	public A6(int i){
		this.i = i;
	}
}

class B5 implements Cloneable{
	int j;
	A6 a;
	public B5(int j, A6 a){
		this.j = j;
		this.a = a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class CloneMethodDemo{
   public static void main(String[] args){
	   A6 a = new A6(10);
	   B5 b1 = new B5(20, a);
	   B5 b2 = null;

	   try{
		   //Creating clone of b1 and assigning it to b2
		    b2 = (B5) b1.clone();
	   }
	   catch (CloneNotSupportedException e){
		   System.out.println("Onject is not clone-able");
	   }
	   //Printing value of b1.a.i
	   System.out.println(b1.a.i);        //Output : 10
	   //Changing the value of b2.a.i to 100
	   b2.a.i = 100;
	   //This change will be reflected in original object 'b1'
	   System.out.println(b1.a.i);	     //Output : 100
   }
}


/*The default version of clone() method implements the shallow copy. Therefore, you need to override clone() method so that any changes 
 * made to clone should not be reflected in original or vice-versa. This type of cloning is called deep copy.*/
/*If a cloned object and original objects are 100% disjoint, then it is called deep copy. In deep copy operation, any changes made to 
 * cloned object will not be reflected in original object or vice-versa.*/
class A7 implements Cloneable{
	int i;
	public A7(int i){
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class B7 implements Cloneable{
	int j;
	A7 a;
	public B7(int j, A7 a){
		this.j = j;
		this.a = a;
	}

	//Overriding clone method to implement deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException{
		B7 b = (B7) super.clone();
		b.a = (A7) a.clone();
		return b;
	}
}

class CloneMethodDemo7{
   public static void main(String[] args){
	   A7 a = new A7(10);
	   B7 b1 = new B7(20, a);
	   B7 b2 = null;
	   try{
		   //Creating clone of b1 and assigning it to b2
		    b2 = (B7) b1.clone();
	   }
	   catch (CloneNotSupportedException e){
		   System.out.println("Onject is not clone-able");
	   }
	   //Printing value of b1.a.i
	   System.out.println(b1.a.i);        //Output : 10
	   //Changing the value of b2.a.i to 100
	   b2.a.i = 100;
	   //Now, this change will not effect the original object
	   System.out.println(b1.a.i);	     //Output : 10
   }
}

/*Some Extra Points About clone() Method :
If you try to clone an object of the class that does not implement Cloneable interface, you will get CloneNotSupportedException at run time.
*/
class A8{
	int i = 10;
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class CloneMethodDemo8{
   public static void main(String[] args){
	   A8 a1 = new A8();
	   try{
		   A8 a2 = (A8) a1.clone();   //This statement will throw CloneNotSupportedException
		   //Because, Class A does not implement Cloneable interface
	   }
	   catch (CloneNotSupportedException e){
		   e.printStackTrace();
	   }
   }
}

/*As clone method is protected, you must override it to use outside the class or else use it inside a class like below.*/
class A9{
	int i = 10;
	public static void main(String[] args){
		A9 a1 = new A9();
		A9 a2 = null;
		try{
			//Using clone() method directly as we are using it inside the class
			a2 = (A9) a1.clone();      
		}
		catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}