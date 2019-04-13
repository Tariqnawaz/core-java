package practical.understandingOopsConceptBasic.abstractClass;

public class Abstract_BankOperation {

	public static void main(String[] args) {
		Bank b=new SBI();//if object is PNB, method of PNB will be invoked    
		int interest=b.getRateOfInterest();    
		System.out.println("Rate of Interest is: "+interest+" %");    

	}

}

abstract class Bank{    
abstract int getRateOfInterest();    
}    
   
class SBI extends Bank{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
int getRateOfInterest(){return 7;}    
}    
