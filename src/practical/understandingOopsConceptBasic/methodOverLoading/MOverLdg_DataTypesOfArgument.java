package practical.understandingOopsConceptBasic.methodOverLoading;

public class MOverLdg_DataTypesOfArgument {

	void sum(int a , int b){
		System.out.println(a + b);
	}
	void sun(double a , double b){
		System.out.println( a + b);
	}
	
	public static void main(String[] args) {
		MOverLdg_DataTypesOfArgument mthod = new MOverLdg_DataTypesOfArgument();
		mthod.sum(4, 7);
		mthod.sun(10,11);
	}

}
