package practical.string.stringBasic;

public class String_ToString {

	 int rollno;  
	 String name;  
	 String city;  
	  
	 String_ToString(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
		 String_ToString s1=new String_ToString(101,"Raj","lucknow");  
	   String_ToString s2=new String_ToString(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  

}
