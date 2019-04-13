import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import LinkedList.Node;

public class CommonCollectioinProgram {
	public static void main(String[] args){
		ListInterface listInter = new ListInterface();
		listInter.LinkedList();
		
		SetInterface setInter = new SetInterface();
		//setInter.hashSet();
		//setInter.linkedHashSet();
		//setInter.treeSet();
		
		MapInterface mapInter = new MapInterface();
		//mapInter.hashMap();
		//mapInter.linkedHashMap();
		//mapInter.treeMap();
	}
}

class ListInterface{
	@SuppressWarnings("unchecked")
	public void LinkedList(){
		LinkedList<String> linList1 = new LinkedList<String>();
		LinkedList<String> linList2 = new LinkedList<String>();
		LinkedList<String> linList3 = new LinkedList<String>();
		LinkedList<String> linList4 = new LinkedList<String>();
		linList1.add("AA");                                         //1. 
		linList1.add("AB");                                         //2.  1 & 2 boolean add(Object item)
		System.out.println("LinList add()..1.. "+linList1);
		linList1.add(1, "AC");                                      //3.  void add(int index, Object item):
		System.out.println("LinList add(1,1)..2.. "+linList1);
		linList2.add("AD");                                         //4.
		linList2.add("AE");                                         //5.  4 & 5 boolean add(Object item)
		linList1.addAll(linList2);                                  //6.  boolean addAll(Collection c)
		System.out.println("LinList addAll()..3.. "+linList1);
		linList3.add("AF");                                         //7.
		linList3.add("AG");                                         //8.  7 & 8 boolean add(Object item)
		linList1.addAll(2,linList3);                                //9.  boolean addAll(int index, Collection c)
		System.out.println("LinList addAll(1,1)..4.. "+linList1);
		linList1.addFirst("AZ");                                    //10. 
		linList1.addFirst("AY");                                    //11. 10 & 11 void addFirst(Object item)
		System.out.println("LinList addFirst()..5.. "+linList1);
		linList1.addLast("AH");                                     //12. 
		linList1.addLast("AI");                                     //13. 12 & 13 void addLast(Object item)
		System.out.println("LinList addLast()..6.. "+linList1);    
		linList4 = (LinkedList<String>) linList1.clone();           //14.  Object clone():
		System.out.println("LinList clone()..7.. "+linList4);
		linList1.clear();                                           //15.  void clear()
		System.out.println("LinList clear()..8.. "+linList1);
		boolean var = linList4.contains("AD");                      //16.  boolean contains(Object item)
		System.out.println("LinList Contain()..9.. "+var);
		linList4.get(3);                                            //17.  Object get(int index)
		System.out.println("LinList get()..10.. "+linList4.get(3));
		linList4.getFirst();                                        //18.  Object getFirst()
		System.out.println("LinList getFirst()..11.. "+linList4.getFirst());
		linList4.getLast();                                         //19.  Object getLast()
		System.out.println("LinList getLast()..12.. "+linList4.getLast());
		linList4.indexOf("AE");                                     //20.  int indexOf(Object item)
		System.out.println("LinList indexOf()..13.. "+linList4.indexOf("AE"));
		linList4.lastIndexOf("AZ");                                 //20.  int int lastIndexOf(Object item)
		System.out.println("LinList lastIndexOf()..14.. "+linList4.lastIndexOf("AZ"));
		System.out.println("LinList pollFirst()..15.. "+linList4.pollFirst());          //21.  int pollFirst(Object item)
		System.out.println("LinList pollLast()..16.. "+linList4.pollLast());            //22.  int pollLast(Object item)
		System.out.println("LinList remove()..17.. "+linList4.remove());                //23.  int remove(Object item)
		System.out.println("LinList remove(1)..18.. "+linList4.remove(1));              //24.  Object remove(int index)
		System.out.println("LinList remove(obj)..19.. "+linList4.remove("AG"));         //23.  Object remove(Object obj)
		System.out.println("LinList removeFirst()..20.. "+linList4.removeFirst());      //24.  Object removeFirst()
		System.out.println("LinList removeLast()..21.. "+linList4.removeLast());        //25.  Object removeLast()
		System.out.println("LinList rem1oc..22.. "+linList4.removeFirstOccurrence("A"));//26.  Object removeFirstOccurrence()
		System.out.println("LinList remLoc..23.. "+linList4.removeLastOccurrence("E")); //27.  Object removeLastOccurrence()
		System.out.println("LinList set..24.. "+linList4.set(3,"EA"));                  //28.  Object Object set(int index, Object item)()
		System.out.println("LinList intSize..25.. "+linList4.size());                   //29.  int size()
		System.out.println("LinList intSize..26.. "+linList4);
		//linList1.poll();
	}
}

@SuppressWarnings("unchecked")
class SetInterface{
	public void hashSet(){
		HashSet<String> hashSet1 = new HashSet<String>();
		HashSet<String> hashSet2 = new HashSet<String>();
		HashSet<String> hashSet3 = new HashSet<String>();
		hashSet1.add("SA");
		hashSet1.add("SB");
		System.out.println("HashSet..1.."+hashSet1);
		hashSet2.add("SC");
		System.out.println("HashSet..2.."+hashSet2);
		System.out.println("Contain()..3.."+hashSet1.contains("SB"));
		System.out.println("ContainAll()..4.."+hashSet1.contains(hashSet2));
		hashSet1.addAll(hashSet2);
		System.out.println("HashSet addAll()..5.."+hashSet1);
		System.out.println("ContainAll()..6.."+hashSet1.contains(hashSet2));
		System.out.println("isEmpty()..7.."+hashSet1.isEmpty());
		System.out.println("size()..8.."+hashSet1.size());
		hashSet3 = (HashSet<String>) hashSet1.clone();
		System.out.println("clone()..9.."+hashSet3);
		System.out.println("Remove()..10.."+hashSet1.remove("SA"));
		System.out.println("RemoveAll()..11.."+hashSet1.removeAll(hashSet2));
		System.out.println("After removing .."+hashSet1);
		hashSet1.clear();
		System.out.println("Clear method..After clearing..."+hashSet1);
	}
	
	public void linkedHashSet(){
		LinkedHashSet<String> linHshSt1 = new LinkedHashSet<String>();	 
		LinkedHashSet<String> linHshSt2 = new LinkedHashSet<String>();	
		LinkedHashSet<String> linHshSt3 = new LinkedHashSet<String>();	
		linHshSt1.add("RAC");
		linHshSt1.add("RAB");
		System.out.println("linHshSt1..1.."+linHshSt1);
		linHshSt2.add("RSC");
		System.out.println("linHshSt..2.."+linHshSt2);
		System.out.println("Contain()..3.."+linHshSt1.contains("RAB"));
		System.out.println("ContainAll()..4.."+linHshSt1.contains(linHshSt2));
		linHshSt1.addAll(linHshSt2);
		System.out.println("linHshSt1 addAll()..5.."+linHshSt1);
		System.out.println("ContainAll()..6.."+linHshSt1.contains(linHshSt2));
		System.out.println("isEmpty()..7.."+linHshSt1.isEmpty());
		System.out.println("size()..8.."+linHshSt1.size());
		linHshSt3 = (LinkedHashSet<String>) linHshSt1.clone();
		System.out.println("clone()..9.."+linHshSt3);
		System.out.println("Remove()..10.."+linHshSt1.remove("RAC"));
		System.out.println("RemoveAll()..11.."+linHshSt1.removeAll(linHshSt2));
		System.out.println("After removing .."+linHshSt1);
		linHshSt1.clear();
		System.out.println("Clear method..After clearing..."+linHshSt1);
	}
	
	public void treeSet(){
		TreeSet<String> treSt1 = new TreeSet<String>();
		TreeSet<String> treSt2 = new TreeSet<String>();	
		TreeSet<String> treSt3 = new TreeSet<String>();	
		treSt1.add("SA");
		treSt1.add("SB");
		System.out.println("treSt1..1.."+treSt1);
		treSt2.add("SC");
		System.out.println("treSt1..2.."+treSt1);
		System.out.println("Contain()..3.."+treSt1.contains("SB"));
		System.out.println("ContainAll()..4.."+treSt1.containsAll(treSt2));
		treSt1.addAll(treSt1);
		System.out.println("HashSet addAll()..5.."+treSt1);
		System.out.println("ContainAll()..6.."+treSt1.containsAll(treSt2));
		System.out.println("isEmpty()..7.."+treSt1.isEmpty());
		System.out.println("size()..8.."+treSt1.size());
		treSt3 = (TreeSet<String>) treSt1.clone();
		System.out.println("clone()..9.."+treSt3);
		System.out.println("Remove()..10.."+treSt1.remove("SA"));
		System.out.println("RemoveAll()..11.."+treSt1.removeAll(treSt2));
		System.out.println("After removing .."+treSt1);
		treSt1.clear();
		System.out.println("Clear method..After clearing..."+treSt1);
		
		treSt1.add("A");
		treSt1.add("C");
		treSt1.add("E");
		treSt1.add("K");
		System.out.println("Ceiling() value ..."+treSt1.ceiling("F"));
		/* The ceiling() method returns the least element in this set greater than or equal to the given element, or null if there is no 
		 * such element.*/
		System.out.println("Floor() value ..."+treSt1.floor("F"));
		/* The floor() method returns the greatest element in this set less than or equal to the given element, or null if there is no 
		 * such element.*/
		System.out.println("headSet() value ..."+treSt1.headSet("F"));
		/*The headset() method returns a view of the portion of this set whose elements are strictly less than toElement.*/
		System.out.println("tailSet() value ..."+treSt1.tailSet("B"));
		/* The tailSet() method returns a view of the portion of this set whose elements are greater than or equal to fromElement. */
		System.out.println("Tree Set List :"+treSt1);
		System.out.println("first() value ..."+treSt1.first());
		/* The first() method returns the first (lowest) element currently in this set. */
		System.out.println("last() value ..."+treSt1.last());
		/* The last() method returns the last (highest) element currently in this set. */
		System.out.println("lower() value ..."+treSt1.lower("E"));
		/* The lower() method returns the greatest element in this set strictly less than the given element, or null if there is 
		 * no such element. */
		System.out.println("higher() value ..."+treSt1.higher("E"));
		/* The higher() method returns the least element in this set strictly greater than the given element, or null if there is no 
		 * such element.*/
		System.out.println("descendingSet() value ..."+treSt1.descendingSet());
		/* he descendingSet() method returns a reverse order view of the elements contained in this set. */
		System.out.println("subSet() value ..."+treSt1.subSet("C" , "E"));
		/* The subSet() methods returns a view of the portion of this set whose elements range from fromElement, inclusive, to 
		 * toElement, exclusive.*/
		while(treSt3.isEmpty() == false){
			/* The isEmpty() methods returns true if this set contains no elements. */
			System.out.println("pollFirst() value ..Removed."+treSt3.pollFirst());
			/* The pollFirst() methods retrieves and removes the first (lowest) element, or returns null if this set is empty. */
		}
		System.out.println("Tree set 3.."+treSt3);
		Iterator iterator;
		
		treSt2.add("AA");
		treSt2.add("AB");
		treSt2.add("AC");
		System.out.println("Tree set 2.."+treSt2);
		System.out.println("pollLast Last element is: "+treSt2.pollLast());
		
		iterator = treSt1.descendingIterator();
		System.out.println("Treeset 1...Decending order..");
		while(iterator.hasNext()){
			System.out.println("Treeset 1...Decending order.."+iterator.next());
		}
		
		treSt3.add("A");
		treSt3.add("B");
		treSt3.add("K");
		treSt1.retainAll(treSt3);
		System.out.println("RetainAll..."+treSt1);
		/* The retainAll() methods gives the common results from both the objects */
		
		/* Comparator with treeSet*/
		TreeSet<String> treSt4 = new TreeSet<String>(new FirstComparator());
		treSt4.add("RED");
		treSt4.add("ORANGE");
		treSt4.add("BLUE");
		treSt4.add("GREEN");
        System.out.println(treSt4);
        
        TreeSet<Emp> treSet5 = new TreeSet<Emp>(new SecondSalaryComparator());
        treSet5.add(new Emp("Rajan", 11000));
        treSet5.add(new Emp("Raj", 7000));
        treSet5.add(new Emp("Raja", 9000));
        System.out.println("treSet 5 ..."+treSet5);
        for(Emp e: treSet5){
        	System.out.println(e);
        }
        System.out.println("***********************************************************************");
        TreeSet<Emp> treSet6 = new TreeSet<Emp>(new SecondNameComparator());
        treSet6.add(new Emp("Rajan", 11000));
        treSet6.add(new Emp("Raj", 7000));
        treSet6.add(new Emp("Raja", 9000));
        System.out.println("treSet6 ..."+treSet6);
        for(Emp e: treSet6){
        	System.out.println(e);
        }
	}
}






class FirstComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}

class SecondNameComparator implements Comparator<Emp>{
	public int compare(Emp emp1, Emp emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
}

class SecondSalaryComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp emp1, Emp emp2) {
		if(emp1.getSalary() > emp2.getSalary()){
			return 1;
		}else{
			return -1;
		}
	}
}

class Emp{
	private String name;
	private int salary;
	
	public Emp(String name , int salary){
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}

@SuppressWarnings("rawtypes")
class MapInterface{
	public void hashMap(){
		System.out.println("Started HashMap");
		HashMap<Integer , String> hashMap1 = new HashMap<Integer, String>();
		HashMap<Integer , String> hashMap2 = new HashMap<Integer, String>();
		hashMap1.put(1, "Hasan");
		hashMap1.put(2, "Shah");
		hashMap1.put(3, "Rashid");                                               //1. Object put(Object k, Object v)
		System.out.println("HashMap..1.."+hashMap1);
		hashMap2.put(3, "Nazim");
		hashMap1.putAll(hashMap2);                                               //2. void putAll(Map m)
		System.out.println("HashMap..2.."+hashMap1);
		Set set = hashMap1.entrySet();                                           //3. Set entrySet( )
		/* Returns a collection view of the mappings contained in this map. */
		Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");   
	         System.out.println(mentry.getValue());
	      }
	    System.out.println("HashMap get(1)..2.."+hashMap1.get(2));               //4. Object get(Object k)
	    hashMap1.remove(2);
	    System.out.println("HashMap remove(1)..2.."+hashMap1);                   //5. Object remove(Object k)
	    System.out.println("hashMap containKey : "+hashMap1.containsKey(1));     //6. boolean containsKey(Object k)
	    System.out.println("hashMap cntnVle : "+hashMap1.containsValue("Nazim"));//7. boolean containsValue(Object k)
	    System.out.println("hashMap isEmpty : "+hashMap1.isEmpty());             //8. boolean isEmpty()
	    Set hashMapKeySet = hashMap1.keySet();                                   //9. Set keySet( )
	    System.out.println("HashMap keySet.."+hashMapKeySet);
	    /* The keySet() method is used to get a Set view of the keys contained in this map. */
	    System.out.println("HashMap size().."+hashMap1.size());                  //10.int size( )
	    System.out.println("HashMap values().."+hashMap1.values());              //11.Collection values( )
	    HashMap hashMap3=(HashMap)hashMap1.clone();                              //12.Object clone()
	    System.out.println("HashMap clone..."+hashMap3);
	}
	
	@SuppressWarnings("serial")
	public void linkedHashMap(){
		final int MAX_ENTRIES = 5;
		System.out.println("LinkedHashMap Started...");
		LinkedHashMap<Integer , String> lnkdHshMp1 = new LinkedHashMap<Integer , String>();
		LinkedHashMap<Integer , String> lnkdHshMp2 = new LinkedHashMap<Integer , String>();
		lnkdHshMp1.put(3,"Bilal");
		lnkdHshMp1.put(1,"Azam");
		lnkdHshMp1.put(2,"Zahir");                                               //1. put()
		System.out.println("lnkdHshMp1..1..."+lnkdHshMp1);
		lnkdHshMp2.put(2,"Razzak");
		lnkdHshMp2.put(4,"Rahim");
		lnkdHshMp1.putAll(lnkdHshMp2);                                           //2. putAll(collection)
		System.out.println("lnkdHshMp1..2..."+lnkdHshMp1);
		Set linkedMap = lnkdHshMp1.entrySet();                                   //3. entrySet()
		Iterator iterator = linkedMap.iterator();
		while(iterator.hasNext()){
			//System.out.println("LinkedHashMap Element : "+ iterator.next());
			//or
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.print("LinkedHashMap Element : "+ me.getKey() + ": ");
	        System.out.println(me.getValue());
		}
		System.out.println("LinkedhshM get()"+lnkdHshMp1.get(2));               //4. get(Object)
		System.out.println("LkedHshMp containKey.."+lnkdHshMp1.containsKey(4)); //5. contain(Object)
	}
	
	public void treeMap(){
		System.out.println("TreeMap started..");
		TreeMap<Integer , String> treMap1 = new TreeMap<Integer , String>();	
		TreeMap<Integer , String> treMap2 = new TreeMap<Integer , String>();
		treMap1.put(1,"Juned");
		treMap1.put(5,"Fard");
		treMap1.put(3,"mujib");
		treMap1.put(2,"Noor");                                                  //put()
		System.out.println("TreeMap..1.."+treMap1);
		treMap2.put(4, "Sadik");
		treMap1.putAll(treMap2);                                               //putAll()
		System.out.println("TreeMap..2.."+treMap1);
		System.out.println("TreeMap containKey().."+treMap1.containsKey(5));   //containKey(object)
		System.out.println("TMap ctainVle().."+treMap1.containsValue("mujib"));//containValue(object)
		System.out.println("TreeMap get().."+treMap1.get(1));                  //get(object);
		Set tMap = treMap1.entrySet();                                         //entrySet()
		Iterator iterator = tMap.iterator();
		while(iterator.hasNext()){
			Map.Entry me = (Entry) iterator.next();
			System.out.println("Key : "+me.getKey()+" Value :"+me.getValue());
		}
		System.out.println("TreeMap firstKey"+treMap1.firstKey());             //firstKey() 
		System.out.println("TreeMap lastKey"+treMap1.lastKey());               //lastKey()
		
		System.out.println("Ceilingentry for 4: "+ treMap1.ceilingEntry(4));  
		System.out.println("Ceilingentry for 5: "+ treMap1.ceilingEntry(5));  //ceilingEntry(object)
		/* The method call returns an entry with the least key greater than or equal to key, or null if there is no such key. */
		
		System.out.println("Ceiling key entry for 5: "+ treMap1.ceilingKey(5));
		System.out.println("Ceiling key entry for 7: "+ treMap1.ceilingKey(7));//ceilingKey(object)
		/* method is used to return the least key greater than or equal to the given key, or null if there is no such key. */
		
		System.out.println("FloorKey() Value is: "+ treMap1.floorKey(4));      //floorKey(object)
		/* method is used to return the greatest key less than or equal to the given key, or null if there is no such key. */
		
		NavigableSet nset=treMap1.descendingKeySet();
		System.out.println("DecendingKeySet.."+nset);                          //descendingKeySet()
		/* method is used to return a reverse order NavigableSet view of the keys contained in this map. */
		
		NavigableMap nmap=treMap1.descendingMap();                             //descendingMap()
	    System.out.println("Navigable map values: "+nmap);
		/* method is used to return a reverse order view of the mappings contained in this map. */
	    
	    System.out.println("FloorEntryValue is: "+ treMap1.floorEntry(6));    //floorEntry(object)
	    /* method is used to return a key-value mapping associated with the greatest key less than or equal to the given key, 
	     * or null if there is no such key.*/
	    
	    System.out.println("Get()..."+treMap1.get(1));                        //get(object)
	    
	    System.out.println("treeHaedMap.."+treMap1.headMap(3));               //headMap(object)
	    /* method is used to return a view of the portion of this map whose keys are strictly less than toKey.*/
	    
	    System.out.println("headMapValue is: "+ treMap1.headMap(3,true));    //headMap(int,boolean)
	    /*  method is used to return a view of the portion of this map whose keys are less than (or equal to, if 
	     * inclusive is true)toKey.*/
	    
	    System.out.println("higherEntryValue is: "+ treMap1.higherEntry(4)); //higherEntry(key)
	    /* method is used to return a key-value mapping associated with the least key strictly greater than the given key, or 
	     * null if there is no such key.*/
	    
	    System.out.println("higherKeyValue is: "+ treMap1.higherKey(3));     //higherKey(key)
	    /* method is used to return the least key strictly greater than the given key, or null if there is no such key. */
	    
	    System.out.println("isEmpty..."+treMap1.isEmpty());                  //isEmpty()
	    System.out.println("higherKey..."+treMap1.higherKey(3));               //higherKey()
	    /*method is used to return the least key strictly greater than the given key, or null if there is no such key.*/
	    
	    Set set=treMap1.keySet();
	    System.out.println("keySet Value is: "+set);                         //keySet()
	    /* method is used to return a Set view of the keys contained in this map. The set's iterator returns the keys in 
	     * ascending order.*/
	    
	    System.out.println("lastEntryValue is: "+ treMap1.lastEntry());      //lastEntry(key)
	    /* method is used to return a key-value mapping associated with the greatest key in this map, or null if the map is empty. */
	    
	    System.out.println("lowerEntryValue is: "+ treMap1.lowerEntry(5));   //lowerEntry
	    /*method is used to return a key-value mapping associated with the greatest key strictly less than the given key,
	     *  or null if there is no such key.*/
	    
	    System.out.println("lowerKeyValue is: "+ treMap1.lowerKey(5));       //lowerKey(key)
	    /* method is used to return the greatest key strictly less than the given key, or null if there is no such key. */
	    
	    System.out.println("navigableKeySetValue is: "+ treMap1.navigableKeySet());//navigableKeySet()
	    /* method is used to return a NavigableSet view of the keys contained in this map. The set's iterator returns the 
	     * keys in ascending order.*/
	    
	    System.out.println("pollFirstEntryValue..: "+ treMap1.pollFirstEntry());//pollFirstEntry()    
	    /* method is used to remove and returns a key-value mapping associated with the least key in this map, or null 
	     * if the map is empty.*/
	    
	    System.out.println("pollLastEntry....: "+ treMap1.pollLastEntry()); //pollLastEntry()
	    /* method is used to remove and returns a key-value mapping associated with the greatest key in this map, or null 
	     * if the map is empty.*/
	}
}


/***********************Comparator & comparable********************************/
class HDTV {
	private int size;
	private String brand;
 
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
/* 1. Comparable implements compareTo() */
class HDTV implements Comparable<HDTV> {
	private int size;
	private String brand;
 
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
	
	public int getSize() {
	return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	@Override
	public int compareTo(HDTV tv) {
 
		if (this.getSize() > tv.getSize())
			return 1;
		else if (this.getSize() < tv.getSize())
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(65, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
 
		if (tv1.compareTo(tv2) > 0) { // here 1st obj check the 2 obj,if greater than 0 
			System.out.println(tv1.getBrand() + " is better.");
		} else {
			System.out.println(tv2.getBrand() + " is better.");
		}
	}
}

/* 2. Comparator implements compare() */
class HDTV1 {
	private int size;
	private String brand;
 
	public HDTV1(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
 
class SizeComparator implements Comparator<HDTV1> {
	@Override
	public int compare(HDTV1 tv1, HDTV1 tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		HDTV1 tv1 = new HDTV1(55, "Samsung");
		HDTV1 tv2 = new HDTV1(60, "Sony");
		HDTV1 tv3 = new HDTV1(42, "Panasonic");
 
		ArrayList<HDTV1> al = new ArrayList<HDTV1>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		Collections.sort(al, new SizeComparator()); // Collections.sort internally calls compare() to sort the list of obj.
		for (HDTV1 a : al) {
			System.out.println(a.getBrand());
		}
	}
}


/* Java program to find middle element of LinkedList in one pass */
/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of linked list we need to find length first
 * but since we can only traverse linked list one time, we will use two pointers
 * one which we will increment on each iteration while other which will be
 * incremented every second iteration. so when first pointer will point to the
 * end of linked list, second will be pointing to the middle element of linked list
 * @author
 */
class LinkedListTest {
  
  
    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
      LinkedList linkedList = new LinkedList();
      LinkedList.Node head = linkedList.head();
      linkedList.add( new LinkedList.Node("1"));
      linkedList.add( new LinkedList.Node("2"));
      linkedList.add( new LinkedList.Node("3"));
      linkedList.add( new LinkedList.Node("4"));
    
      //finding middle element of LinkedList in single pass
      LinkedList.Node current = head;
      int length = 0;
      LinkedList.Node middle = head;
    
      while(current.next() != null){
          length++;
          if(length%2 ==0){
              middle = middle.next();
          }
          current = current.next();
      }
    
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : " + middle);
      
    } 
  
}

class LinkedList{
    private Node head;
    private Node tail;
  
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
        }
    }
}


/* Code Example of checking duplicate on Array in Java */
class CheckDuplicatesInJavaArray {

    public static void main(String args[])  {
       
       String[] withDuplicates = new String[] {"one","two","three","one"};
        String[] withoutDuplicates = new String[] {"one","two","three"};
      
        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));
      
        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));

      
        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));

      
    }
  
    /*
     * brute force way of checking if array contains duplicates in Java
     * comparing each element to all other elements of array
     * complexity on order of O(n^2) not advised in production
     */
    public static boolean bruteforce(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * detect duplicate in array by comparing size of List and Set
     * since Set doesn't contain duplicate, size must be less for an array which contains duplicates
     */
    public static boolean checkDuplicateUsingSet(String[] input){
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if(inputSet.size()< inputList.size()){
            return true;
        }
        return false;
    }
  
    /*
     * Since Set doesn't allow duplicates add() return false
     * if we try to add duplicates into Set and this property
     * can be used to check if array contains duplicates in Java
     */
    public static boolean checkDuplicateUsingAdd(String[] input) {
        Set tempSet = new HashSet();
        for (String str : input) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }
}

/* Dictionary Class Example */
class DictionaryDemo {

	   public static void main(String[] args) {
	     
	   // create a new hashtable
	   Dictionary d = new Hashtable();
		  
	   // add some elements
	   d.put("1", "Chocolate");
	   d.put("2", "Cocoa");
	   d.put("5", "Coffee");
		  
	   // return an enumeration of the keys from this dictionary.
	   for (Enumeration e = d.keys(); e.hasMoreElements();) {
	   System.out.println(e.nextElement());
	   }
	   }
	}




