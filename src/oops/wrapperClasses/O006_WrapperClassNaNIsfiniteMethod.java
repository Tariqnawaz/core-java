package oops.wrapperClasses;

/*
-isNaN() and isInfinite() methods are the static members of java.lang.Double and java.lang.Float classes. 
 Both these two wrapper classes have their own version of these two methods.
 
-Before discussing about these two methods, let’s get to know about NaN, POSITIVE_INFINITY and NEGATIVE_INFINITY.
-NaN, POSITIVE_INFINITY and NEGATIVE_INFINITY are static and final constants of java.lang.Double and java.lang.Float
 wrapper classes.

-NaN : This constant holds Not-a-Number value of specified type. It represents mathematically undefined or unrepresentable
 number such as number obtained by dividing zero by zero or square root of a negative number.
-POSITIVE_INFINITY : This constant holds positive infinity value.
-NEGATIVE_INFINITY : This constant holds negative infinity value.*/

public class O006_WrapperClassNaNIsfiniteMethod {

	/*--------------1st Example--------------*/
	public static void main(String[] args) {
		//Assigning Not-A-Number value of type double to d1
        double d1 = Double.NaN;
        System.out.println(d1);            //Output : NaN
 
        //Assigning positive infinity value of type double to d2
        double d2 = Double.POSITIVE_INFINITY;
        System.out.println(d2);           //Output : Infinity
 
        //Assigning negative infinity value of type double to d3
        double d3 = Double.NEGATIVE_INFINITY;
        System.out.println(d3);           //Output : -Infinity
 
        //Assigning Not-A-Number value of type float to f1
        float f1 = Float.NaN;
        System.out.println(f1);         //Output : NaN
 
        //Assigning positive infinity value of type float to f2
        float f2 = Float.POSITIVE_INFINITY;
        System.out.println(f2);        //Output : Infinity
 
        //Assigning negative infinity value of type float to f3
        float f3 = Float.NEGATIVE_INFINITY;
        System.out.println(f3);       //Output : -Infinity

	}
}

/*--------------2nd Example--------------*/
/* isNaN() : This method returns true, if the specified number is Not-a-Number i.e mathematically undefined or 
 * unrepresentable number. Otherwise it returns false. Both, Double and Float wrapper classes have this method.*/
class IsNanAndIsInfinite1{
    public static void main(String[] args){
        double d = 0.0/0.0;
        System.out.println(Double.isNaN(d));    //Output : true
        d = Math.sqrt(-1.2);
        System.out.println(Double.isNaN(d));    //Output : true
 
        float f = 0.0f/0.0f;
        System.out.println(Float.isNaN(f));            //Output : true
        f = 0 * Float.POSITIVE_INFINITY;
        System.out.println(Float.isNaN(f));          //Output : true
    }
}

/*--------------3rd Example--------------*/
/* isInfinite() : This method returns true if the specified number is positively or negatively infinite. Both Double and 
 * Float wrapper classes have this method.*/
class IsNanAndIsInfinite2{
    public static void main(String[] args){
        double d = Double.POSITIVE_INFINITY / 0.0;
        System.out.println(Double.isInfinite(d));    //Output : true
        d = Double.NEGATIVE_INFINITY / 0.0;
        System.out.println(Double.isInfinite(d));    //Output : true
 
        float f = Float.POSITIVE_INFINITY * 2.2f;
        System.out.println(Float.isInfinite(f));            //Output : true
        f = Float.NEGATIVE_INFINITY * 4.12f;
        System.out.println(Float.isInfinite(f));          //Output : true
    }
}



