package oops.wrapperClasses;

import java.io.Serializable;

/* Number Class in java is an abstract class. It is placed in java.lang package. It has four abstract 
 * methods and two concrete methods. */

public class O004_WrapperClassNumberClass {
	public static void main(String[] args) {
		Byte B = new Byte("55");
        int i = B.intValue();
        System.out.println(i);      //Output : 55
 
        Short S = new Short("23");
        i = S.intValue();
        System.out.println(i);     //Output : 23
 
        Integer I = new Integer("56");
        i = I.intValue();
        System.out.println(i);    //Output : 56
 
        Long L = new Long("125");
        i = L.intValue();
        System.out.println(i);    //Output : 125
 
        Float F = new Float("23.56");
        i = F.intValue();
        System.out.println(i);    //Output : 23  (Value is truncated)
 
        Double D = new Double("521.56");
        i = D.intValue();
        System.out.println(i);   //Output : 521  (Value is truncated)
	}

}

/*------1st Example------*/
abstract class Number extends Object implements Serializable{
    private static final long serialVersionUID = 1L;

	//Four Abstract Methods
     public abstract int intValue();
     public abstract long longValue();
     public abstract float floatValue();
     public abstract double doubleValue();
 
     //Two Concrete Methods
     public byte byteValue()
     {
          return (byte)intValue();
     }
 
     public short shortValue()
     {
          return (short)intValue();
     }
     /* called in main method*/
}

/*------2nd Example------*/
/* longValue() Method */
/* It returns long value of  the specified object. It may involve truncation of the value. */
class WrapperClasses31{
    public static void main(String[] args){
        Byte B = new Byte("55");
        long l = B.longValue();
        System.out.println(l);      //Output : 55
 
        Short S = new Short("23");
        l = S.longValue();
        System.out.println(l);     //Output : 23
 
        Integer I = new Integer("56");
        l = I.longValue();
        System.out.println(l);    //Output : 56
 
        Long L = new Long("125");
        l = L.longValue();
        System.out.println(l);    //Output : 125
 
        Float F = new Float("23.56");
        l = F.longValue();
        System.out.println(l);    //Output : 23  (Value is truncated)
 
        Double D = new Double("521.56");
        l = D.longValue();
        System.out.println(l);   //Output : 521  (Value is truncated)
    }
}

/*------3rd Example------*/
/* floatValue() Method : */
/* It returns float value of the specified object. */
class WrapperClasses32{
    public static void main(String[] args){
        Byte B = new Byte("55");
        float f = B.floatValue();
        System.out.println(f);      //Output : 55.0
 
        Short S = new Short("23");
        f = S.floatValue();
        System.out.println(f);     //Output : 23.0
 
        Integer I = new Integer("56");
        f = I.floatValue();
        System.out.println(f);    //Output : 56.0
 
        Long L = new Long("125");
        f = L.floatValue();
        System.out.println(f);    //Output : 125.0
 
        Float F = new Float("23.56");
        f = F.floatValue();
        System.out.println(f);    //Output : 23.56
 
        Double D = new Double("521.56");
        f = D.floatValue();
        System.out.println(f);   //Output : 521.56
    }
}

/*------4th Example------*/
/* doubleValue() Method : */
/* It returns double value of the specified object. */
class WrapperClasses33{
    public static void main(String[] args){
        Byte B = new Byte("55");
        double d = B.doubleValue();
        System.out.println(d);      //Output : 55.0
 
        Short S = new Short("23");
        d = S.floatValue();
        System.out.println(d);     //Output : 23.0
 
        Integer I = new Integer("56");
        d = I.floatValue();
        System.out.println(d);    //Output : 56.0
 
        Long L = new Long("125");
        d = L.floatValue();
        System.out.println(d);    //Output : 125.0
 
        Float F = new Float("23.56");
        d = F.floatValue();
        System.out.println(d);    //Output : 23.559999465942383
 
        Double D = new Double("521.56");
        d = D.floatValue();
        System.out.println(d);   //Output : 521.5599975585938
    }
}

/*------5th Example------*/
/* byteValue() Method  : */
/* It returns byte value of the specified object. It may involve truncation. */
class WrapperClasses34{
    public static void main(String[] args){
        Byte B = new Byte("55");
        byte b = B.byteValue();
        System.out.println(b);      //Output : 55
 
        Short S = new Short("23");
        b = S.byteValue();
        System.out.println(b);     //Output : 23
 
        Integer I = new Integer("56");
        b = I.byteValue();
        System.out.println(b);    //Output : 56
 
        Long L = new Long("125");
        b = L.byteValue();
        System.out.println(b);    //Output : 125
 
        Float F = new Float("23.56");
        b = F.byteValue();
        System.out.println(b);    //Output : 23    (Value is truncated)
 
        Double D = new Double("521.56");
        b = D.byteValue();
        System.out.println(b);   //Output : 9
    }
}

/*------6th Example------*/
/* shortValue() Method   : */
/* It returns short value of specified object. It may involve truncation. */
class WrapperClasses35{
    public static void main(String[] args){
        Byte B = new Byte("55");
        short s = B.shortValue();
        System.out.println(s);      //Output : 55
 
        Short S = new Short("23");
        s = S.shortValue();
        System.out.println(s);     //Output : 23
 
        Integer I = new Integer("56");
        s = I.shortValue();
        System.out.println(s);    //Output : 56
 
        Long L = new Long("125");
        s = L.shortValue();
        System.out.println(s);    //Output : 125
 
        Float F = new Float("23.56");
        s = F.shortValue();
        System.out.println(s);    //Output : 23     (value is truncated)
 
        Double D = new Double("521.56");
        s = D.shortValue();
        System.out.println(s);   //Output : 521         (value is truncated)
    }
}

