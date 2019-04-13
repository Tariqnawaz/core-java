package practical.understandingOopsConceptBasic.methodOverLoading;

public class MOverLdg_ChangingNoOfArgument {

	void sum(int a , int b ){
		System.out.println( a + b);
	}
	void sum(int a , int b , int c){
		System.out.println(a + b + c);
	}
	public static void main(String[] args) {
		MOverLdg_ChangingNoOfArgument mthd = new MOverLdg_ChangingNoOfArgument();
		mthd.sum(20, 30);
		mthd.sum(20, 30 , 50);

	}

}
