package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_ConstructorCall {

	 int id;  
	    String name;  
	    String city;  
	      
	    This_ConstructorCall(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    This_ConstructorCall(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	public static void main(String[] args) {
		This_ConstructorCall c =new This_ConstructorCall(101, "Abid");
		This_ConstructorCall c1 =new This_ConstructorCall(101, "Abid" ,"Mumbai");
		c.display();
		c1.display();

	}

}
/*
 * Rule: Call to this() must be the first statement in constructor.
 */
