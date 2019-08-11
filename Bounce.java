import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Bounce width=400 height=400></applet>*/

public class Bounce extends Applet implements MouseMotionListener,Runnable
{
	int x=0,y=0;
	int a=1,b=1;
	Thread t;
	
	public void paint(Graphics g)
	{
		String s;
		s="SAHIL";
		g.drawString(s,x,y);
		g.setColor(Color.orange);
	}
	public void init()
	{
		setBackground(Color.blue);
		addMouseMotionListener(this);
	}
	public void start()
	{
		t=new Thread(this);
		t.start();
	}
	public void mouseMoved(MouseEvent me)
	{
	}
	
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				t.sleep(22);
				x+=a;y+=b;
				if(x<=0)
				a=1;
				//if(y<=0)
				//b=1;
				if(x>=getWidth()-x)
				a=-1;
				//if(y>=getWidth()-y)
				//b=-1;
				repaint();
				
			}
		}
		catch(InterruptedException ie){}
	}
}

















