package Collection_Test.Map_Collection_All.HashMap;

import java.util.HashMap;
import java.util.*;

public class HashMap_testCollection_1_31122014 {
	
	 public static void main(String args[]){  
		   
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
