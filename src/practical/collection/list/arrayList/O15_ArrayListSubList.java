package practical.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class O15_ArrayListSubList {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Click");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = arrl.subList(2, 4);
        System.out.println("Sub List: "+list);
	}

}
