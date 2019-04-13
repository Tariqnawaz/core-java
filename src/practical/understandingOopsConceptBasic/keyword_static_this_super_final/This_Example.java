package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_Example {

	 void m(){  
		  System.out.println("method is invoked");  
		  }  
		  void n(){  
		  this.m();//no need because compiler does it for you.  
		  }  
		  void p(){  
		  n();//complier will add this to invoke n() method as this.n()  
		  }  
	public static void main(String[] args) {
		This_Example t = new This_Example();
		t.p();
	}

}
