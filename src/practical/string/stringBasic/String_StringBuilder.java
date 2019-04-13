package practical.string.stringBasic;

public class String_StringBuilder {

	public static void main(String[] args) {
		/*******append********/
		System.out.println("/*******append********/");
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java
		
		/*******insert********/
		System.out.println("/*******insert********/");
		StringBuilder insert=new StringBuilder("Hello ");  
		insert.insert(1,"Java");//now original string is changed  
		System.out.println(insert);//prints HJavaello  
		
		/*******replace********/
		System.out.println("/*******replace********/");
		StringBuilder replace=new StringBuilder("Hello");  
		replace.replace(1,3,"Java");  
		System.out.println(replace);//prints HJavalo 
		
		/*******delete********/
		System.out.println("/*******delete********/");
		StringBuilder delete=new StringBuilder("Hello");  
		delete.delete(1,3);  
		System.out.println(delete);//prints Hlo
		
		/*******reverse********/
		System.out.println("/*******reverse********/");
		StringBuilder reverseM=new StringBuilder("Hello");  
		reverseM.reverse();  
		System.out.println(reverseM);//prints olleH  
		
		/*******capacity********/
		System.out.println("/*******capacity********/");
		StringBuilder capacity=new StringBuilder();  
		System.out.println(capacity.capacity());//default 16  
		capacity.append("Hello");  
		System.out.println(capacity.capacity());//now 16  
		capacity.append("java is my favourite language");  
		System.out.println(capacity.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		/*******ensureCapacity********/
		System.out.println("/*******ensureCapacity********/");
		StringBuilder ensureCapacity=new StringBuilder();  
		System.out.println(ensureCapacity.capacity());//default 16  
		ensureCapacity.append("Hello");  
		System.out.println(ensureCapacity.capacity());//now 16  
		ensureCapacity.append("java is my favourite language");  
		System.out.println(ensureCapacity.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		ensureCapacity.ensureCapacity(10);//now no change  
		System.out.println(ensureCapacity.capacity());//now 34  
		ensureCapacity.ensureCapacity(50);//now (34*2)+2  
		System.out.println(ensureCapacity.capacity());//now 70
	}

}
