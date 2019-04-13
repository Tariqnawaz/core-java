package practical.understandingOopsConceptBasic.methodOverLoading;

public class MOverLdg_OverLoadMainMethod {

	public static void main(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Now print method is going to print");
		main(10);
	}

}
