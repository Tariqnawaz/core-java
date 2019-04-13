package practical.exceptionHandling;


public class ExpHndlg_PropogationException {

	void m(){  
	    int data=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  ExpHndlg_PropogationException obj=new ExpHndlg_PropogationException();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}
