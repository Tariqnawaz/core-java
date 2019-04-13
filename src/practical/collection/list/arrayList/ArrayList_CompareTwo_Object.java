package practical.collection.list.arrayList;

import java.util.ArrayList;

public class ArrayList_CompareTwo_Object {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("Good night");

        ArrayList<String> al2= new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> al3= new ArrayList<String>();
        for (String temp : al1)
            al3.add(al2.contains(temp) ? "Yes" : "No");
        System.out.println(al3);

        //Storing the comparison output in ArrayList<Integer>
        ArrayList<Integer> al4= new ArrayList<Integer>();
        for (String temp2 : al1)
             al4.add(al2.contains(temp2) ? 1 : 0);
        System.out.println(al4);

	}
		/*What is the logic in above code?
		If the first element of ArrayList al1 is present in al2 then ArrayList al3 would be having “Yes” 
		and al4 would be having “1” However if the element is not present “No” would be stored in al3 and
		0 would be in al4.*/
}
