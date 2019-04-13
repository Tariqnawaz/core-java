package practical.exceptionHandling;


import java.io.IOException;

public class ExpHndlg_ThrowsException {

	void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  ExpHndlg_ThrowsException obj=new ExpHndlg_ThrowsException();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}
