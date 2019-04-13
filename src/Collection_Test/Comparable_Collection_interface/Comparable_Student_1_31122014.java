package Collection_Test.Comparable_Collection_interface;

public class Comparable_Student_1_31122014 {

	int rollno;  
	String name;  
	int age;  
	
	Comparable_Student_1_31122014(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
}
	
	public int compareTo(Object obj){  
		Comparable_Student_1_31122014 st=(Comparable_Student_1_31122014)obj;  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
		}  
}
