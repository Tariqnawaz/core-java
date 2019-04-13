package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_ThisKeywordPassedAsArgument {

	void m(This_ThisKeywordPassedAsArgument obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
	public static void main(String[] args) {
		This_ThisKeywordPassedAsArgument t = new This_ThisKeywordPassedAsArgument();
		t.p();

	}

}
