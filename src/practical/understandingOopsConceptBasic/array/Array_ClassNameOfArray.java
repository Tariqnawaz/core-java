package practical.understandingOopsConceptBasic.array;


public class Array_ClassNameOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]={4,4,5};  
		  
		Class c=arr.getClass();  
		String name=c.getName();  
		  
		System.out.println(name);  

	}

}
