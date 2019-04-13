package practical.string.stringBasic;

public class String_StringBuffer{

	public static void main(String args[]){  
		
		/********AppendMethod***********/
		System.out.println("/********AppendMethod***********/");
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		/********InsertMethod***********/
		System.out.println("/********InsertMethod***********/");
		StringBuffer insertMethod=new StringBuffer("Hello ");  
		insertMethod.insert(1,"Java");//now original string is changed  
		System.out.println(insertMethod);//prints HJavaello
		
		/********ReplaceMethod***********/
		System.out.println("/********ReplaceMethod***********/");
		StringBuffer replaceMethod=new StringBuffer("Hello");  
		replaceMethod.replace(1,3,"Java");  
		System.out.println(replaceMethod);//prints HJavalo  
		
		/********DeleteMethod***********/
		System.out.println("/********DeleteMethod***********/");
		StringBuffer deleteMethod=new StringBuffer("Hello");  
		deleteMethod.delete(1,3);  
		System.out.println(deleteMethod);//prints Hlo 
		
		/********ReverseMethod***********/
		System.out.println("/********ReverseMethod***********/");
		StringBuffer reverseMethod=new StringBuffer("Hello");  
		reverseMethod.reverse();  
		System.out.println(reverseMethod);//prints olleH  
		
		/********capacityMethod***********/
		System.out.println("/********CapacityMethod***********/");
		StringBuffer capacityMethod=new StringBuffer();  
		System.out.println(capacityMethod.capacity());//default 16  
		capacityMethod.append("Hello");  
		System.out.println(capacityMethod.capacity());//now 16  
		capacityMethod.append("java is my favourite language");  
		System.out.println(capacityMethod.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		/********ensureCapacityMethod***********/
		System.out.println("/********ensureCapacityMethod***********/");
		StringBuffer ensureCapacity=new StringBuffer();  
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
