package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Final_ClassExample extends Bike2{

	public static void main(String[] args) {
		new Final_ClassExample().run(); 

	}

}
class Bike2{  
	  final void run(){System.out.println("running...");}  
	}  

/*
 final class Bike{}   final class example

class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda();  
  honda.run();  
  }  
} */


/*
 *If you declare any parameter as final, you cannot change the value of it. 
 
class Bike11{   
int cube(final int n){  
 n=n+2;//can't be changed as n is final  
 n*n*n;  
}  
public static void main(String args[]){  
  Bike11 b=new Bike11();  
  b.cube(5);  
}  
}  
*/