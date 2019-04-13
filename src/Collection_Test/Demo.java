package Collection_Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class Demo {
	public Integer id;
	public String name ;
	Demo(Integer id , String name){
		this.id= id;
		this.name = name;
	}
	
	public static void main(String args[]){
	/***---------ArrayList----------**/	
		List<String> a = new ArrayList<String>();
		a.add("12");
		a.add("13");
		a.add("14");
		a.add("15");
		a.add("16"); // adding single-single strings in 1st arrayList object
		
		List<String> aa = new ArrayList<String>();
		aa.add("21");
		aa.add("22");
		a.addAll(aa); // adding 2nd arrayList object in 1st arrayList
		
		for(String s : a){
			System.out.println("List of array "+ s);
		}
		
		Demo d1 = new Demo(1, "aaa");
		Demo d2 = new Demo(2, "aab");
		Demo d3 = new Demo(3, "aac");
		List<Demo> d = new ArrayList<Demo>();
		d.add(d1);
		d.add(d2);
		d.add(d3); // adding Objects one by one in arrayList
		
		for(Demo dd : d){
			System.out.println("List of Demo Object of array "+ dd.id + " " + dd.name);
		}
		
		System.out.println(" .. Ends ..");
		
		/***---------LinkedList----------**/	
		List<String> link = new LinkedList<String>();
		link.add("bala");
		link.add("kala");
		link.add("chala");
		link.add("mala");
		link.add("thala");
		
		System.out.println("Linked list "+ link);
		System.out.println(" .. Ends ..");
		
		/***---------Hash Set----------**/	
		Set<String> setName = new HashSet<String>();
		setName.add("aaa123");
		setName.add("aaa124");
		setName.add("aaa123");
		setName.add("aaa126");
		setName.add("aaa123");
		
		for(String s : setName){
			System.out.println("List of HashSet Object of array "+ s);
		}
		System.out.println(" .. Ends ..");
		/***---------LinkedHashSet----------**/	
		Set<String> linkSetName = new LinkedHashSet<String>();
		linkSetName.add("raj");
		linkSetName.add("taj");
		linkSetName.add("maza");
		linkSetName.add("taza");
		linkSetName.add("raj");
		
		for(String s : linkSetName){
			System.out.println("List of LinkedHashSet Object of array "+ s);
		}
		
		System.out.println(" .. Ends ..");
		/***---------Tree Set----------**/
		Set<String> treeSetName = new TreeSet<String>();
		treeSetName.add("Ajay");
		treeSetName.add("Vijay");
		treeSetName.add("Raja");
		treeSetName.add("Mukesh");
		treeSetName.add("Chandu");
		
		for(String s : treeSetName){
			System.out.println("List of TreeSet Object of array "+ s);
		}
		
		System.out.println(" .. Ends ..");
		/***---------HashMap----------**/
		Map<Integer , String> hashMap = new HashMap<Integer , String>();
		hashMap.put(2, "Ganna");
		hashMap.put(1, "Anna12");
		hashMap.put(3, "Channa");
		
		for(Map.Entry s : hashMap.entrySet()){
			System.out.println("List of HashMap Object id "+ s.getKey() + " value " + s.getValue());
		}
		
		System.out.println("hashMap .." +hashMap);
		System.out.println(" .. Ends ..");
		/***---------LinkedHashMap----------**/
		Map<Integer , String> linkedHashMap = new LinkedHashMap<Integer , String>();
		linkedHashMap.put(1, "Dada");
		linkedHashMap.put(3, "mama");
		linkedHashMap.put(2, "nana");
		
		for(Map.Entry s : linkedHashMap.entrySet()){
			System.out.println("List of linkedHashMap Object id "+ s.getKey() + " value " + s.getValue());
		}
		
		System.out.println(" .. Ends ..");
		/***---------TreeMap----------**/
		Map<Integer , String> treeMap = new TreeMap<Integer , String>();
		treeMap.put(5, "Series");
		treeMap.put(1, "Banna");
		treeMap.put(6, "Xerox1");
		
		for(Map.Entry s : treeMap.entrySet()){
			System.out.println("List of TreeMap Object id "+ s.getKey() + " value " + s.getValue());
		}
		
		System.out.println(" .. Ends ..");
		/***---------Hashtable----------**/
		Map<Integer , String > hashTable = new Hashtable<Integer,String>();  
		hashTable.put(501, "Munna");
		hashTable.put(103, "Pulla");
		hashTable.put(698, "Reddy");
		
		for(Map.Entry s : hashTable.entrySet()){
			System.out.println("List of Hashtable Object id "+ s.getKey() + " value " + s.getValue());
		}
		
		Map<Integer,Integer> hm1=new Hashtable<Integer,Integer>();
		  hm1.put(102 , 10215);
		  hm1.put(105 , 10855);
		  hm1.put(103 , 14785);
		  hm1.put(110 , 136985);
	  for(Map.Entry s : hm1.entrySet()){
			System.out.println("List of Hashtable1 Object id "+ s.getKey() + " value " + s.getValue());
		}  
		  
	}
}
