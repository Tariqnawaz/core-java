package oops.polymorphism;

public class O001_MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*-----------1st Example ----------------------*/
	void methodOverloaded(){
        //No argument method
    }
 
    void methodOverloaded(int i){
        //One argument is passed
    }
 
    void methodOverloaded(double d){
        //One argument is passed but type of argument is different
    }
 
    void methodOverloaded(int i, double d){
        //Two argument method
        //Method signature of this method is methodOverloaded(int, double)
    }
 
    void methodOverloaded(double d, int i){
        //It is also two argument method but type of arguments changes
        //Method signature of this method is methodOverloaded(double, int)
    }
 
   /* void methodOverloaded(double d1, int i1){
        //It has same method signature methodOverloaded(double, int) as of above method
        //So, it is a Duplicate method, You will get compile time error here
    }*/
 
    void differentMethod(){
        //Different method
    }
    
   
}

/*--------------2nd Example ------------------------*/
/*Overloaded methods may have same return types or different return types. It does not effect method overloading.*/

class MethodOverloading1
{
    void methodOverloaded()
    {
        //No argument method, return type is void
    }
 
    int methodOverloaded(int i)
    {
        //Returns int type
        return i;
    }
 
    int methodOverloaded(double d)
    {
        //Same return type as of above method
        return 0;
    }
 
    /*void methodOverloaded(double d)
    {
        //Duplicate method because it has same method signature as of above method
    }*/
}

