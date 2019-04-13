package practical.understandingOopsConceptBasic.methodOverLoading;

public class MOverLdg_TypePromotionIfMatchingFound {

	void sum(int a , int b){
		System.out.println("int method is invoked");
	}
	void sum(long a , long b){
		System.out.println("long method is invoked");
	}
	public static void main(String[] args) {
		MOverLdg_TypePromotionIfMatchingFound mtd = new MOverLdg_TypePromotionIfMatchingFound();
		mtd.sum(20,20);//now int arg sum() method gets invoked  

	}

}
