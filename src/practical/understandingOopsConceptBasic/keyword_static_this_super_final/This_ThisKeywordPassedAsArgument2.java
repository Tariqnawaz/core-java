package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_ThisKeywordPassedAsArgument2 {

	int data=10;  
	This_ThisKeywordPassedAsArgument2(){  
	   B b=new B(this);  
	   b.display();  
	  }  

	public static void main(String[] args) {
		This_ThisKeywordPassedAsArgument2 t= new This_ThisKeywordPassedAsArgument2();

	}

}
class B{  
	This_ThisKeywordPassedAsArgument2 obj;  
	  B(This_ThisKeywordPassedAsArgument2 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  
	  