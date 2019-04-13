package practical.understandingOopsConceptBasic.methodOverLoading;

public class MOverLdg_TypePromotion {

	void sum(int a , long b){
		System.out.println(a+b);
	}
	void sum(int a , int b , int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		MOverLdg_TypePromotion mtd = new MOverLdg_TypePromotion();
		mtd.sum(20,20);
		mtd.sum(20,20,20);
	}

}
