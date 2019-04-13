package practical.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayList_Iteration_All {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	ArrayList<Integer> arrList = new ArrayList<Integer>();
	arrList.add(10);
	arrList.add(2561);
	arrList.add(841);
	arrList.add(187);
	arrList.add(618);
	arrList.add(100);
	arrList.add(8754155);

	System.out.println("Normal for Loop");
	for(int counter=0;counter<arrList.size();counter++){
		System.out.println(arrList.get(counter));
	}
	
	System.out.println("Advanced For loop");
	int i =0;
	for(Integer number : arrList){
		System.out.println("advanced loop index "+i+" size is " + number );
		i++;
	}
	
	System.out.println("while loop for iterationg arraylist");
	int count = 0;
	while(arrList.size() > count){
		System.out.println(arrList.get(count));
		count++;
	}
	
	/*System.out.println("Looping Array list using iterating ");
	Iterator itr = arrList.iterator();
	while(itr.hasNext()){
		System.out.println(itr.hasNext());
	}*/
	
	
	System.out.println("Enumeration object");
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("Core Java");
	arrayList.add("Advanced Java");
	arrayList.add("Java Swing");
	arrayList.add("Java Sturts Framework");
	arrayList.add("Java Spring FrameWork");
	
	Enumeration<String> e = Collections.enumeration(arrayList);
	while(e.hasMoreElements()){
		System.out.println(e.hasMoreElements());
	}
	
	
	}

}
