package practical.collection.list.arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList<String> obj = new ArrayList<String>();
	obj.add("Nazim");
	obj.add("Rashid");
	obj.add("Imran");
	obj.add("Danish");
	obj.add("Tariq Idrisi");
	System.out.println("Currently the array list has following elements:" + obj);
	
	/*adding element at the given index*/
	obj.add(0,"Nadim");
	obj.add(1,"Wasim");
	
	/*remove element like this*/
	obj.remove("Danish");
	obj.remove("Tariq Idrisi");
	System.out.println("current arrayList is :" +obj);
	
	/*another way to remove element from given index*/
	obj.remove(1);
	System.out.println("Now the Arraylist contains the following elements" + obj);
	
	/***append collection object to arraylist (addAll())***/
	ArrayList<String> obj1 = new ArrayList<String>();
	obj1.add("Dipesh");
	obj1.add("Shidu");
	obj1.add("Vinayak");
	obj1.add("Malik");
	System.out.println("adding arraylist2 to arraylist1");
	obj.addAll(obj1);
	System.out.println(obj);
	
	
	/***get the index of particular element (indexOf())****/
	System.out.println("Index of Imran is : " + obj.indexOf("Imran"));
	System.out.println("Index of Dipesh is :  " + obj.indexOf("Dipesh"));
	System.out.println("Index of Malik is : " + obj.indexOf("Malik"));
	System.out.println("Index of Nadim is : " + obj.indexOf("Nadim"));
	
	/***contains() method is used for checking the specified element existence in the given list.****/
	 System.out.println("ArrayList contains the string 'Nazim': "+obj.contains("Nazim"));
	 System.out.println("ArrayList contains the string 'Nazim Rashid': "+obj.contains("Nazim Rashid"));
	 System.out.println("ArrayList contains the string 'Rashid': "+obj.contains("Rashid"));
	 System.out.println("ArrayList contains the string 'Dipesh': "+obj.contains("Dipesh"));
	 System.out.println("ArrayList contains the string 'Wasim': "+obj.contains("Wasim"));
	}

}
