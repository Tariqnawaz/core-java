package practical.understandingOopsConceptBasic.keyword_static_this_super_final;

public class This_KeywordExample {

	 int id;  
	 String name;  
	      
	 This_KeywordExample(int id , String name)
	 {
		 this.id = id;
		 this.name = name;
	 }
	 void display(){System.out.println(id+" "+name);}  
	public static void main(String[] args) {
		This_KeywordExample s = new This_KeywordExample(101, "Sameer");
		s.display();

	}

}
