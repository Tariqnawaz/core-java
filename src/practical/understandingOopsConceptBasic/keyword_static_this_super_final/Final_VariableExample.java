package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Final_VariableExample {

	final int speedlimit=90;//final variable  
	 void run(){  
	  System.out.println(speedlimit);   
	 }  
	public static void main(String[] args) {
		Final_VariableExample obj=new  Final_VariableExample();  
		 obj.run(); 

	}

}
/*
 * The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

	variable
	method
	class
  The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or
  uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which
  will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final 
  keyword.
  */
