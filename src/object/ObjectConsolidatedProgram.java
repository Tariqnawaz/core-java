package object;

/* Example 1 : equals method*/
public class ObjectConsolidatedProgram {
	int i;
	public ObjectConsolidatedProgram(){
		
	}
    public ObjectConsolidatedProgram(int i){
        this.i = i;
    }
    //Overriding equals() method
    @Override
    public boolean equals(Object obj){
    	OverRiddingEqualMethodExample a = (OverRiddingEqualMethodExample) obj;
        //Comparing the fields of calling object and passed object
        return this.i == a.i;
    }
	
	public static void main(String[] args){
		ObjectConsolidatedProgram a1 = new ObjectConsolidatedProgram();                          //Creating object of Class A and assigning it to a1
		ObjectConsolidatedProgram a2 = a1;                               //a1 is assigned to a2 
       //That means a1 and a2 are pointing to same object.
       System.out.println(a1.equals(a2));       //Output : true //Calling a1.equals(a2) will return true
       //Creating another object of Class A and assigning it to a2
       a2 = new ObjectConsolidatedProgram();
       //Now, a1 and a2 will be pointing to different objects.
       //Now calling a1.equals(a2) will return false
       System.out.println(a1.equals(a2));      //Output : false
       
       /* OverRiddingEqualMethodExample */
       ObjectConsolidatedProgram a11 = new ObjectConsolidatedProgram(10);  //Creating object of Class A with i = 10
       ObjectConsolidatedProgram a21 = new ObjectConsolidatedProgram(20);  //Creating object of Class A with i = 20
       //a1 and a2 have different contents
       //So calling a1.equals(a2) will return false
       System.out.println(a11.equals(a21));                                //Output : false
       a21.i = 10;                                                         //Changing the value of a2.i to 10
       //Now, a1 and a2 have same contents
       //Now, calling a1.equals(a2) will return true
       System.out.println(a11.equals(a21));      //Output : true
       
       /*hash code*/
       //Calling hashCode() method on a.
       System.out.println(a1.hashCode());       //Output : 19770577 //19770577 is an integer representation of memory address of object
   }		
}

class OverRiddingEqualMethodExample{
    int i = 10;
}

/* Example 2 : clone() Method*/
class CloneableExample implements Cloneable{
	int i;
	int j;
	public CloneableExample(int i, int j){
		this.i = i;
		this.j = j;
	}
	//Overriding clone() method
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	/* Shallow Copy And Deep Copy */
	int i1;
	public CloneableExample(int i1){
		this.i1 = i1;
	}
}

class CloneableExampleMain{
   public static void main(String[] args){
	   CloneableExample a1 = new CloneableExample(10, 20);    //Creating an instance of Class A
	   CloneableExample a2 = null;                            //Declaring reference variable of Class A and assigning null to it
	   //enclosing a1.clone() in try-catch blocks
	   //as clone() throws CloneNotSupportedException
	   try{
		   a2 = (CloneableExample) a1.clone();                //Creating a clone of a1 and assigning it to a2
	   }catch (CloneNotSupportedException e){
		   System.out.println("Object is not clone-able");
	   }
	   System.out.println(a2.i);   //Output : 10
	   System.out.println(a2.j);   //Output : 20
	   
	   /* Shallow Copy And Deep Copy */
	   
   }
}

/* GC & Finalize*/
class GcNFinalize{
    int i = 50;
    @Override
    protected void finalize() throws Throwable{
        System.out.println("From Finalize Method");
    }
    
    /*protected void finalize() throws Throwable{
        System.out.println("From Finalize Method");
     
        //Calling super class finalize() method explicitly
     
        super.finalize();
    }*/
}
 
class GcNFinalizeMain{
   public static void main(String[] args){
      //Creating two instances of class GcNFinalize
	   GcNFinalize a1 = new GcNFinalize();
	   GcNFinalize a2 = new GcNFinalize();
 
      //Assigning a2 to a1
      a1 = a2;
      //Now both a1 and a2 will be pointing to same object 
      //An object earlier referred by a1 will become abandoned
      System.out.println("done");
      
    //Making finalize() method to execute forcefully
      Runtime.getRuntime().runFinalization();
      System.out.println("done");
      
    //Calling garbage collector thread explicitly
      System.gc();              //OR call Runtime.getRuntime().gc();
      System.out.println("done");
   }
}