package practical.understandingOopsConceptBasic.objectCreation;

public class Object_ObjectCloning implements Cloneable{

	int rollno;  
	String name;  
	  
	Object_ObjectCloning(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
	}  
	public static void main(String[] args) {
		try{
		Object_ObjectCloning s1=new Object_ObjectCloning(101,"Nadim");  
		  
		Object_ObjectCloning s2=(Object_ObjectCloning)s1.clone();  
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		  
		}catch(CloneNotSupportedException c){}  

	}

}
