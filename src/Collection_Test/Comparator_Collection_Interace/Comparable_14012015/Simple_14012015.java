package Collection_Test.Comparator_Collection_Interace.Comparable_14012015;
import java.util.*;  
import java.io.*;  
public class Simple_14012015 {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		System.out.println("Sorting by Name..."); 
		
		Collections.sort(al,new NameComparator_14012015());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		System.out.println("sorting by age...");  
		
		Collections.sort(al,new AgeComparator_14012015());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student st1=(Student)itr2.next();  
		System.out.println(st1.rollno+" "+st1.name+" "+st1.age);  
		}  
		  
		}  
	}
}

  

  
 
  

  

  

  
