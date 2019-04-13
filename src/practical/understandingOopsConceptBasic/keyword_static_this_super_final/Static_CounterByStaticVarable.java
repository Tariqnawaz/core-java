package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Static_CounterByStaticVarable {
	
	static int count = 0;
	Static_CounterByStaticVarable(){
		count++;
		System.out.println("Count of static variable is : " +count);
	}
	public static void main(String[] args) {
		Static_CounterByStaticVarable s = new Static_CounterByStaticVarable();
		Static_CounterByStaticVarable s1 = new Static_CounterByStaticVarable();
		Static_CounterByStaticVarable s2 = new Static_CounterByStaticVarable();

	}

}
