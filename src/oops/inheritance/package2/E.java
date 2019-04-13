package oops.inheritance.package2;

public class E extends D {
    void methodOfClassE(){
        System.out.println(k);     //Protected member can be inherited to any subclass
        System.out.println(m);     //public member is always inherited
 
        D d = new D();
        //System.out.println(d.k);     Protected member can not be used outside the package.
        System.out.println(d.m);    //public member can be used anywhere
    }

	public static void main(String[] args) {
		E e = new E();
		e.methodOfClassE();

	}

}
