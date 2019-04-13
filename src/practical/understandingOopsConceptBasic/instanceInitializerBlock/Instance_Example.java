package practical.understandingOopsConceptBasic.instanceInitializerBlock;

public class Instance_Example {

	int speed;  
    
	Instance_Example(){System.out.println("speed is "+speed);}  
   
    {speed=100;}  
       
    public static void main(String args[]){  
    	Instance_Example b1=new Instance_Example();  
    	Instance_Example b2=new Instance_Example(); 
	}

}
