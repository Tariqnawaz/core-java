package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Final_MethodExample extends Bike1{

	//void run(){System.out.println("running safely with 100kmph");}  
    
	   public static void main(String args[]){  
		   Final_MethodExample honda= new Final_MethodExample();  
	   honda.run(); 
}
}
class Bike1{  
	  final void run(){System.out.println("running");}  
	}  
