import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class CommonAlgorithms {
	
	
	
	public static void main(String[] args) {
		/*****1.****************************************************************************//*
		StringBuffer sb = new StringBuffer();
		//System.out.println(sb.append("ANNA12").toString().equals(sb.reverse().toString()) ? "Pelindrom" : "Not Pelindrom");
		
		
		*//*****2.****************************************************************************//*
		int n = 12;
		System.out.println( (n % 3 == 0 && n % 5 == 0) ? "Tomcat" : (n %  3 == 0 ) ? "Tom" : (n %  5 == 0 ) ? "cat" : n);
		
		*//*****3.****************************************************************************//*
		String name = "TariqaarereaAAa1 "; // count no of aa
		int count = 0;
		for(int i = 0 ; i < name.length() ; i++){
			if(name.toLowerCase().charAt(i) == 'a'){
				count++;
			}
		}
		System.out.println("count"+count);
		
		*//*****4.****************************************************************************//*
		int count = 0;
		Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("Tariqaarereaa1");
        
        while(matcher.find()){
        	count++;
        }
        System.out.println("count..."+count);
        
		*//*****5.****fabonacci***************************************************************//*
		int number = 10;
		int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        System.out.println("fibonacci.."+fibonacci);
		
		
		*//*****6.****************************************************************************************//*
		int count = 0;
		Integer[] a = { 1 , 2 , 3 , 4 , 5 , 9 , 11};
		
		Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(a);
        
        while(matcher.find()){
        	count++;
        }
        System.out.println("count..."+count);*/
		
		
		/*****7 Sort an array find the index of 9 with optimization******************************************/
		
		/*Integer[] a = { 1 , 2 , 3 , 4 , 5 , 9 , 11};
		System.out.println("index of 9 : "+Arrays.asList(a).indexOf(9)); // right
		
		Integer[] b = { 51 , 12 , 37 , 41 , 5 , 19 , 11, 1, 15};
		System.out.println("index of 11 "+Arrays.binarySearch(b, 12));*/
		
		/***** 8 count the each char in a string*************************************************************/
		/*String str = "Hello World";
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>();

		for (int i = 0; i < len; ++i){
		    char charAt = str.charAt(i);
		    if (!numChars.containsKey(charAt)){
		        numChars.put(charAt, 1);
		    }
		    else
		    {
		        numChars.put(charAt, numChars.get(charAt) + 1);
		    }
		}

		System.out.println(numChars);	*/
		
		
		
		/*String noofOcc ="Neterson Technologies";
		Map<Character,Integer> numberoftimes = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < noofOcc.length() ; i++){
			if(!numberoftimes.containsKey(noofOcc.charAt(i))){
				numberoftimes.put(noofOcc.charAt(i), 1);
			}else{
				numberoftimes.put(noofOcc.charAt(i),numberoftimes.get(noofOcc.charAt(i))+1);
			}
		}
		
		System.out.println(numberoftimes);*/
		
		CommonAlgorithms c = new CommonAlgorithms();
		c.factorial(10);
	}
	
	/***** 9 factorial *************************************************************************/
	public int factorial(int n){
		
		if(n == 0){
			
		}
		System.out.println(n);
		return n * factorial(n - 1);
	}
	
	/***** 8 without using temp variable  ********************************************************/
	int i = 30 ;
	int j = 20 ;
	
	j = (i+j) - j ;
	
	system.out.println(j);
	
}




