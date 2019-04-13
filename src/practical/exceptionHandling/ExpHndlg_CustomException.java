package practical.exceptionHandling;


import java.io.IOException;

public class ExpHndlg_CustomException {

	 
	   static void validate(int age)throws IOException{  
	     if(age<18)  
	      throw new IOException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  

}
