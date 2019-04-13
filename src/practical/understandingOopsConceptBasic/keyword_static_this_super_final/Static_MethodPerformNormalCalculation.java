package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Static_MethodPerformNormalCalculation {

	static int cube(int x ){
		return x * x * x;
	}
	public static void main(String[] args) {
		int result = Static_MethodPerformNormalCalculation.cube(5);
		System.out.println("size of cube is : " + result);

	}

}
/*
Restrictions for static method

There are two main restrictions for the static method. They are:
The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.
*/

/*
Q) why java main method is static?

Ans) because object is not required to call static method if it were non-static method, jvm create object first 
then call main() method that will lead the problem of extra memory allocation.
*/

/*
Java static block

Is used to initialize the static data member.
It is executed before main method at the time of classloading.
*/