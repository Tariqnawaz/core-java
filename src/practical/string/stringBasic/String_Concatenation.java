package practical.string.stringBasic;

public class String_Concatenation {

	public static void main(String args[]){  
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar
		   
		   /***************/
		   String s1=50+30+"Sachin"+40+40;  
		   System.out.println(s1);//80Sachin4040  
		   
		   /**************/
		   String s4="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s4.concat(s2);  
		   System.out.println(s3);//Sachin Tendulkar  
		 }  

}
