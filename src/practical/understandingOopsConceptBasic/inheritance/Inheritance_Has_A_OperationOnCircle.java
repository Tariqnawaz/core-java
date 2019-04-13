package practical.understandingOopsConceptBasic.inheritance;

public class Inheritance_Has_A_OperationOnCircle {
	Operation op;//aggregation  
	 double pi=3.14;  
	    
	 double area(int radius){  
	   op=new Operation();  
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
	   return pi*rsquare;  
	 }  
	public static void main(String[] args) {
		Inheritance_Has_A_OperationOnCircle i = new Inheritance_Has_A_OperationOnCircle();
		double result=i.area(5);  
		System.out.println(result);  

	}

}
class Operation{  
	 int square(int n){  
	  return n*n;  
	 }  
	} 
