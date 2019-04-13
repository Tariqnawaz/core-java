package Collection_Test.Comparable_Collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable_StudentTestCollection_1_31122014 {

	
	public static void main(String[] args) {
		  
		ArrayList al=new ArrayList();  
		al.add(new Comparable_Student_1_31122014(101,"Vijay",23));  
		al.add(new Comparable_Student_1_31122014(106,"Ajay",27));  
		al.add(new Comparable_Student_1_31122014(105,"Jai",21));  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			Comparable_Student_1_31122014 st=(Comparable_Student_1_31122014)itr.next();  
		System.out.println(st.rollno+""+st.name+""+st.age);  
		  }  

	}

}
