package Collection_Test.ArrayList_N_Vector.array_vector_14012015;

import java.util.*;      

/*Example of Java Vector

Let's see a simple example of java Vector class that uses Enumeration interface.*/


class TestVector1{      
 public static void main(String args[]){      
  Vector<String> v=new Vector<String>();//creating vector  
  v.add("umesh");//method of Collection  
  v.addElement("irfan");//method of Vector  
  v.addElement("kumar");  
  //traversing elements using Enumeration  
  Enumeration e=v.elements();  
  while(e.hasMoreElements()){  
   System.out.println(e.nextElement());  
  }  
 }      
} 