package Collection_Test.ArrayList_N_Vector.array_vector_14012015;

import java.util.*;    

/*Example of Java ArrayList

Let's see a simple example where we are using ArrayList to store and traverse the elements.*/


class TestArrayList21{    
 public static void main(String args[]){    
     
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Sonoo");//adding object in arraylist    
  al.add("Michael");    
  al.add("James");    
  al.add("Andy");    
  //traversing elements using Iterator  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }    
 }    
} 
