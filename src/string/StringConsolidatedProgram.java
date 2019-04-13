package string;

public class StringConsolidatedProgram {
   public static void main(String[] args){
        //Creating String objects without using new operator
	   // String literals
        String s1 = "abc";          
        String s2 = "abc"+"def";
        String s3 = "123"+"A"+"B";
        System.out.println(s1);     //Output : abc
        System.out.println(s2);     //Output : abcdef
        System.out.println(s3);     //Output : 123AB
        
        /* get the length of the string*/
        String s = new String();                    //Creating an empty string object
        System.out.println(s.length());            //Output : 0
        char[] chars = {'J', 'A', 'V', 'A'};
        String s4 = new String(chars);            //Creating string object of 4 characters
        System.out.println(s4.length());         //Output : 4
        String s5 = new String(s1+"J2EE");       //Creating string object of 8 characters
        System.out.println(s5.length());        //Output : 8
        //Using String.length() method on string literals
        System.out.println("abc".length());        //Output : 3
        System.out.println("123456".length());     //Output : 6
        System.out.println("A".length());          //Output : 1
        
      //Concatenating five string literals using "+" operator
        String s6 = "Java"+"Concept"+"Of"+"The"+"Day";
		System.out.println(s6);       //Output : JavaConceptOfTheDay
		//Creating five string objects
		String s7 = new String("Java");
		String s8= new String("Concept");
		String s9 = new String("Of");
		String s10 = new String("The");
		String s11 = new String("Day");
		//Concatenating five string objects using "+" operator
		System.out.println(s7+s7+s9+s10+s11);      //Output : JavaConceptOfTheDay
        
		//You can concatenate a string object with other data types like int, double, long, char et
		int i = 1000;
		String s12 = "Java"+i;
		System.out.println(s12);        //Output : Java1000
		//Concatenating a string object with double type
		double d = 523.69;
		String s13 = "Java"+d;
		System.out.println(s13);      //Output : Java523.69
		//Concatenating a string object with char type
		char c = 'A';
		String s14 = "Java"+c;
		System.out.println(s14);       //Output : JavaA
		//Concatenating a string object with boolean type
		boolean b = true;
		String s15 = "Java"+b;
		System.out.println(s15);      //Output : Javatrue
		
		//concatenate string objects without using “+” operator
		String s16 = "JAVA";
		String s17 = "J2EE";
		System.out.println(s16.concat(s17));      //Output : JAVAJ2EE
		
		// charAt Example
		 String s18 = "Java Concept Of The Day";
        System.out.println(s18.charAt(5));      //Output : C
        System.out.println(s18.charAt(10));     //Output : p
        System.out.println(s18.charAt(25));     //This statement will throw StringIndexOutOfBoundsException
        
        // getChars Example
        String s19 = "Java Concept Of The Day";
        //Defining destination char array
        char[] dst = new char[10];
        //Copying the set of characters from s into dst.
        s19.getChars(5, 11, dst, 2);
        for (char c1 : dst){
            System.out.print(c1);       //Output : --Concep--
        }
        
        //toCharArray Example
        String s20 = "Java Concept Of The Day";
        //Converting string 's' into character array.
        char[] dst1 = s20.toCharArray();
        for (char c2 : dst1){
            System.out.print(c2);     //Output : Java Concept Of The Day
        }
        
        //substring Example
        String s21 = "Java Concept Of The Day";
        String subString1 = s21.substring(11);     
        System.out.println(subString1);           //Output : t Of The Day
        String subString2 = s21.substring(5, 15);
        System.out.println(subString2);  
        
        //string intern example
        String s22 = new String("JAVA");
        String s23 = s22.intern();       //Creating String Intern
        System.out.println(s22 == s23);       //Output : false
        System.out.println(s22.equals(s23));    //Output : true
        
        String s24 = "JAVA";
        String s25 = new String("JAVA");
        String s26 = s25.intern();       //Creating String Intern
        System.out.println(s24 == s26);       //Output : true
        
        String s27 = "JAVA";
        String s28 = s1.intern();       //Creating String Intern
        System.out.println(s27 == s28);       //Output : true
    }
}
