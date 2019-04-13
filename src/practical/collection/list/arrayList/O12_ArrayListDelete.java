package practical.collection.list.arrayList;

import java.util.ArrayList;

public class O12_ArrayListDelete {

	public static void main(String[] args) {
	    ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        arrl.clear();
        System.out.println("After clear ArrayList:"+arrl);
	}

}
