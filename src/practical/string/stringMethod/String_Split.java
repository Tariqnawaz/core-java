package practical.string.stringMethod;

public class String_Split {

	public static void main(String args[]){  
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on string  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  

	}

}