import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class DemoApplet extends Applet implements Runnable{
	private static final long serialVersionUID = 1L;
	
	/*Graphics g;
	private Image i;
	private int x             =400;
	private int y             =25;
	private int radius        =20;
	Thread t1;
	@Override
	public void init() {
		setSize(400, 400);
		t1 = new Thread(this);
		t1.start();
	}
	
	@Override
	public void start() {
		 
		
	}
	
	@Override
	public void run() {
		
		while(true){
			
		}
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
		repaint();
	}
	
	@Override
	public void stop() {
	
	
	}
	
	@Override
	public void destroy() {
	
	
	}*/
	
	/*Thread t;
	int i;
	int x=34,y=14;
	 
	public void init()
	{
	t=new Thread();
	}
	public void paint(Graphics g)
	{
	for(i=1;i<=5;i++)
	{
	g.fillOval(x,y,40,40);
	//g.setColor(Color.red);
	x=x+30;
	y=y+30;
	repaint();
	 
	try
	{
	t.sleep(1000);
	}
	catch(Exception e)
	{}
	}
	}*/

	Thread t;
    int i;
    int x=34,y=14;
    static int px=-1, py=-1;
    int sign=1;
    int inc=3;
 
public void init()
{
    t=new Thread();
 
}
public void paint(Graphics g)
{
    //setBackground(Color.WHITE);
    super.paint(g);
 
 
        g.fillOval(x,y,40,40);
        g.setColor(Color.RED);
 
        x=x + inc*sign;
        y=y + inc *sign;
 
        if( (x> 280 && y> 280)  || (x<30 && y<30))
        {
 
            sign= -sign;
 
        }
 
        try
        {
            t.sleep(5);
        }
        catch(Exception e)
        {}
        repaint();
 
 }
@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
