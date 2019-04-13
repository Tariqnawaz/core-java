package practical.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Sorting {

	public static void main(String[] args) {
	ArrayList<String> listOfCountries = new ArrayList<String>();
	listOfCountries.add("India");
	listOfCountries.add("United States");
	listOfCountries.add("United Kingdom");
	listOfCountries.add("Australia");
	listOfCountries.add("Qatar");
	listOfCountries.add("Istanbul");
	listOfCountries.add("United Arab Emirates");
	System.out.println("ArrayList before sorting" + listOfCountries);
	
	Collections.sort(listOfCountries);
	System.out.println("Arraylist after sorting");
	for(String sortingCountry : listOfCountries){
		System.out.println(sortingCountry);
	}
	
	System.out.println("/**//*////*////*//*/*//*///*//*//*//*/*");
	System.out.println("Starting integer value soting");
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(4);
	arrayList.add(40);
	arrayList.add(1);
	arrayList.add(35);
	arrayList.add(11);
	System.out.println("before sorting integer value" + arrayList);
	
	Collections.sort(arrayList);
	System.out.println("after sorting integer value is :");
	for(Integer number : arrayList){
		System.out.println(number);
	}
	
	System.out.println("/****************************sorting desending wise************************************/");
	ArrayList<String> sortingElementDescWise = new ArrayList<String>();
	sortingElementDescWise.add("ZZ");
	sortingElementDescWise.add("WW");
	sortingElementDescWise.add("AA");
	sortingElementDescWise.add("FF");
	sortingElementDescWise.add("KK");
	sortingElementDescWise.add("II");
	
	System.out.println("before sorting the element");
	for(String charters : sortingElementDescWise){
		System.out.println(charters);
	}
	
	Collections.sort(sortingElementDescWise, Collections.reverseOrder());
	System.out.println("sorting element in desending order");
	for(String charAtDescendingOrder : sortingElementDescWise){
		System.out.println(charAtDescendingOrder);
	}
	}

}
