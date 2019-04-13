package Collection_Test.Map_Collection_All.Hashtable;

import java.util.Hashtable;
import java.util.*;

public class Hashtable_testCollection_1_31122014 {

	public static void main(String args[]){  
		   
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  Hashtable<Integer,Integer> hm1=new Hashtable<Integer,Integer>();
		  hm1.put(102 , 10215);
		  hm1.put(105 , 10855);
		  hm1.put(103 , 14785);
		  hm1.put(110 , 136985);
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  for(Map.Entry m:hm1.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }
		 }  
}
