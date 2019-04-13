package practical.multiThreading.threadGroup;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockDemo1_ScheduleAtFixedRate2_JavaWorld {

	 public static void main (String [] args)
	   {
	      Timer t = new Timer ();
	      t.scheduleAtFixedRate (new TimerTask ()
	                             {
	                                public void run ()
	                                {
	                                   System.out.println (new Date ().
	                                                       toString ());
	                                }
	                             },
	                             0,
	                             1000);
	      InputThread it = new InputThread ();
	      it.start ();
	      try
	      {
	          // Wait for input thread to terminate
	          it.join ();
	      }
	      catch (InterruptedException e)
	      {
	      }
	      // Terminate the timer and discard all scheduled tasks after the
	      // currently executing task leaves its run() method
	      t.cancel ();
	   }
	}
	class InputThread extends Thread
	{
	   public void run ()
	   {
	      try
	      {
	         // Wait for user to type Enter key
	         System.in.read ();
	      }
	      catch (java.io.IOException e)
	      {
	      }
	   }
	}