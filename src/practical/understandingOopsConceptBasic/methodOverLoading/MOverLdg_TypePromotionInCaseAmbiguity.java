package practical.understandingOopsConceptBasic.methodOverLoading;

public class MOverLdg_TypePromotionInCaseAmbiguity {

	void sum(int a , long b){
		System.out.println("int method is invoked");
	}
	void sum(long a , int b){
		System.out.println("long method is invoked");
	}
	public static void main(String[] args) {
		MOverLdg_TypePromotionInCaseAmbiguity m = new MOverLdg_TypePromotionInCaseAmbiguity();
		//m.sum(20,20);//now ambiguity
	}

}
