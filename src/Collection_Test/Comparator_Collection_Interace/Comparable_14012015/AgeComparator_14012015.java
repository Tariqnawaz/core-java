package Collection_Test.Comparator_Collection_Interace.Comparable_14012015;
import java.util.*;
public class AgeComparator_14012015 implements Comparator{
    
	@Override
	public int compare(Object o1, Object o2) {
		 Student s1=(Student)o1;  
		    Student s2=(Student)o2;  
		      
		    if(s1.age==s2.age)  
		    return 0;  
		    else if(s1.age>s2.age)  
		    return 1;  
		    else  
		    return -1;  
	}  
    }  

/*
 * AgeComparator.java

This class defines comparison logic based on the age. 
If age of first object is greater than the second, we are returning positive value,
 it can be any one such as 1, 2 , 10 etc. If age of first object is less than the second object,
  we are returning negative value, it can be any negative value and if age of both objects 
  are equal, we are returning 0.
 */