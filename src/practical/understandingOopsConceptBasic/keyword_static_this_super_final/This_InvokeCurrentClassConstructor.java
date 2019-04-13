package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_InvokeCurrentClassConstructor {

	int id;  
    String name; 
    
    This_InvokeCurrentClassConstructor(){
    	System.out.println("default constructor is invoked");
    }
    
    This_InvokeCurrentClassConstructor(int id , String name){
    	this();
    	this.id = id;
    	this.name = name;
    }
    void display(){
    	System.out.println(id + "   " + name);
    }
	public static void main(String[] args) {
		This_InvokeCurrentClassConstructor c = new This_InvokeCurrentClassConstructor(101 , "Nazim");
		c.display();

	}

}
