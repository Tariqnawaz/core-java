package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Super_KeywordExample extends Vehicle{
	int speed=100;  
    
	  void display(){  
	   System.out.println(super.speed);//will print speed of Vehicle now  
	  }  
	public static void main(String[] args) {
		Super_KeywordExample b=new Super_KeywordExample();  
		   b.display();
	}

}
class Vehicle{  
	  int speed=50;  
	}  
/*
 * Usage of java super Keyword

super is used to refer immediate parent class instance variable.
super() is used to invoke immediate parent class constructor.
super is used to invoke immediate parent class method.

In the above example Vehicle and Bike both class have a common property speed. Instance variable of current class is
 refered by instance bydefault, but I have to refer parent class instance variable that is why we use super keyword to
  distinguish between parent class instance variable and current class instance variable.
 * 
 */