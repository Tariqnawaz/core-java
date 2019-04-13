package Collection_Test.ArrayList_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_studentClassCollection_1_31122014 {
	public static void main(String args[]){  
		  //Creating user-defined class objects  
		Arraylist_studentClass_1_31122014 s1=new Arraylist_studentClass_1_31122014(101,"Sonoo",23);  
		Arraylist_studentClass_1_31122014 s2=new Arraylist_studentClass_1_31122014(102,"Ravi",21);  
		Arraylist_studentClass_1_31122014 s3=new Arraylist_studentClass_1_31122014(103,"Hanumat",25);  
		      
		  ArrayList<Arraylist_studentClass_1_31122014> al=new ArrayList<Arraylist_studentClass_1_31122014>();//creating arraylist  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		    
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
			  Arraylist_studentClass_1_31122014 st=(Arraylist_studentClass_1_31122014)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 }
}
