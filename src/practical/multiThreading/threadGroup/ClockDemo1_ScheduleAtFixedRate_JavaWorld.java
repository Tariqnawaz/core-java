package practical.multiThreading.threadGroup;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockDemo1_ScheduleAtFixedRate_JavaWorld {

	public static void main(String[] args) {
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
	}

}
