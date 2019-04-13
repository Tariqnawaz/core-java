package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Super_ProvidesByCompilerImplicitly extends Vehicle2 {
	
	int speed;  
	Super_ProvidesByCompilerImplicitly(int speed){  
	    this.speed=speed;  
	    System.out.println(speed);  
	  }  
	public static void main(String[] args) {
		Super_ProvidesByCompilerImplicitly s = new Super_ProvidesByCompilerImplicitly(10);

	}

}
class Vehicle2{  
	  Vehicle2(){System.out.println("Vehicle is created");}  
	}  
