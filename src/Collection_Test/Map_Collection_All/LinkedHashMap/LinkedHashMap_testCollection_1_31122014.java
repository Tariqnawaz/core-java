package Collection_Test.Map_Collection_All.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMap_testCollection_1_31122014 {

	 public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }
}
