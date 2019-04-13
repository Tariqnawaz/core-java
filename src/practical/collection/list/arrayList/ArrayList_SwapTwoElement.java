package practical.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SwapTwoElement {

	public static void main(String[] args) {
	 ArrayList<String> al = new ArrayList<String>();
	    al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");

	    System.out.println("ArrayList before Swap:");
	    for(String temp: al){
	        System.out.println(temp);
	    }

	    //Swapping 2nd(index 1) element with the 5th(index 4) element
	    Collections.swap(al, 1, 4);

	    System.out.println("ArrayList after swap:");
	    for(String temp: al){
	       System.out.println(temp);
	    }

	}

}
