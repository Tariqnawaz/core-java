package practical.multiThreading.threadGroup;

public class ThreadGroup_ThreadLocal_JavaWorld {

	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2 ("A");
	      MyThread2 mt2 = new MyThread2 ("B");
	      MyThread2 mt3 = new MyThread2 ("C");
	      mt1.start ();
	      mt2.start ();
	      mt3.start ();
	}

}
class MyThread2 extends Thread
{
   private static ThreadLocal tl =
      new ThreadLocal ()
          {
             protected synchronized Object initialValue ()
             {
                return new Integer (sernum++);
             }
          };
   private static int sernum = 100;
   MyThread2 (String name)
   {
      super (name);
   }
   public void run ()
   {
      for (int i = 0; i < 10; i++)
           System.out.println (getName () + " " + tl.get ());
   }
}