package practical.understandingOopsConceptBasic.objectCreation;

public class Object_Annonymous_Factorial {

	void factorial(Integer n){
		Integer fact = 1;
		for(int i = 1 ; i<n ;i++){
			fact = fact * i;
		}
		System.out.println("Factorial for "+ n +" is :" +fact);
	}
	public static void main(String[] args) {
		new Object_Annonymous_Factorial().factorial(8);
		
		/*Object_Annonymous_Factorial factorialNo = new Object_Annonymous_Factorial();
		factorialNo.factorial(4);*/
		
	}

}
