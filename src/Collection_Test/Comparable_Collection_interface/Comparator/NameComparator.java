package Collection_Test.Comparable_Collection_interface.Comparator;

import java.util.*;  
class NameComparator implements Comparator{  
public int Compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
return s1.name.compareTo(s2.name);  
}

@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}  
}  
