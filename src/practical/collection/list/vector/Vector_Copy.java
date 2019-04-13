package practical.collection.list.vector;

import java.util.Collections;
import java.util.Vector;

public class Vector_Copy {

	public static void main(String[] args) {
		 //First Vector of String type
	       Vector<String> va = new Vector<String>();
	       //Adding elements to the first Vector
	       va.add("AB");
	       va.add("BC");
	       va.add("CD");
	       va.add("DE");

	       //Second Vector
	       Vector<String> vb = new Vector<String>();
	       //Adding elements to the second Vector
	       vb.add("1st");
	       vb.add("2nd");
	       vb.add("3rd");
	       vb.add("4th");
	       vb.add("5th");
	       vb.add("6th");

	       /*Displaying the elements of second vector before
	         performing the copy operation*/
	       System.out.println("Vector vb before copy: "+vb);

	       //Copying all the elements of Vector va to Vector vb
	       Collections.copy(vb, va);

	       //Displaying elements after copy
	       System.out.println("Vector vb after copy: "+vb);
	}

}
