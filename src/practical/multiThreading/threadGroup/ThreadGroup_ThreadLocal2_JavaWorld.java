package practical.multiThreading.threadGroup;

public class ThreadGroup_ThreadLocal2_JavaWorld {

	public static void main(String[] args) {
		MyThread3 mt1 = new MyThread3 ("A");
	      MyThread3 mt2 = new MyThread3 ("B");
	      MyThread3 mt3 = new MyThread3 ("C");
	      mt1.start ();
	      mt2.start ();
	      mt3.start ();
	}
	
}
class MyThread3 extends Thread
{
   private static ThreadLocal tl = new ThreadLocal ();
   private static int sernum = 100;
   MyThread3 (String name)
   {
      super (name);
   }
   public void run ()
   {
      synchronized ("A")
      {
         tl.set ("" + sernum++);
      }
      for (int i = 0; i < 10; i++)
           System.out.println (getName () + " " + tl.get ());
   }
}