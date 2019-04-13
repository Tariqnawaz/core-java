package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_Provingthiskeyword {

	void m(){  
		System.out.println(this);//prints same reference ID  
		}  
	public static void main(String[] args) {
		This_Provingthiskeyword obj = new This_Provingthiskeyword();
		System.out.println(obj);//prints the reference ID  
		  
		obj.m();

	}

}
/*
 *
Let's prove that this keyword refers to the current class instance variable. In this program, we are printing the 
reference variable and this, output of both variables are same.
 
 * 
 * */
 