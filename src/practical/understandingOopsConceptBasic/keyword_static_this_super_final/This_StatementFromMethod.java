package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_StatementFromMethod {

	public static void main(String[] args) {
		new A().getA().msg();  
	}
}
class A{  
	A getA(){  
	return this;  
	}  
void msg(){System.out.println("Hello java");}  
    }
