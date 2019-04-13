package oops.typeCasting;

public class O001_TypeCastingAutoWidening {
	/*When you are converting data from small sized data type to big sized data type, i.e when you are converting data from left-placed
	  data type to right-placed data type in the above order, auto widening will be used. For example, when you are converting byte to
	  short or short to int, auto widening will be used.*/
	static float methodOne(int i)
    {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }
 
    public static void main(String[] args)
    {
        byte b = 10;
        short s = b;      //byte is auto widened to short
        double d = methodOne(s);    //short is auto widened to int and float to double
        System.out.println(d);
    }
}
