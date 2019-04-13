package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class Static_CounterWithoutStaticVarable {
	int count = 0;
	Static_CounterWithoutStaticVarable(){
		count++;
		System.out.println("count is : " + count);
		
	}
	public static void main(String[] args) {
		Static_CounterWithoutStaticVarable s = new Static_CounterWithoutStaticVarable();
		Static_CounterWithoutStaticVarable s1 = new Static_CounterWithoutStaticVarable();
		Static_CounterWithoutStaticVarable s2 = new Static_CounterWithoutStaticVarable();
		

	}

}
