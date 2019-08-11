import java.awt.*;
import java.awt.event.*;

class FHPaint extends Frame implements MouseMotionListener
{
List l, ls;

Button b;

Color c=Color.BLACK;

Graphics g;

	FHPaint()
	{
		setVisible(true);
		setSize(500, 500);
		setResizable(true);
		setLayout(new FlowLayout());
		l=new List(5, false);
		l.setBounds(100, 100, 70, 70);
		l.add("ERASER");
		l.add("BLACK");
		l.add("RED");
		l.add("GREEN");
		l.add("BLUE");
		l.add("ORANGE");
		l.add("YELLOW");
		l.add("PINK");
		l.add("CYAN");
		ls=new List(5, false);
		ls.setBounds(100, 100, 70, 70);
		ls.add("OVAL");
		ls.add("FILLED OVAL");
		ls.add("RECT");
		ls.add("FILLED RECT");
		add(l);
		b=new Button("APPLY");
		b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
			switch(l.getSelectedIndex())
			{
				case 0: c=Color.WHITE;break;
				case 1: c=Color.BLACK;break;
				case 2: c=Color.RED;break;
				case 3: c=Color.GREEN;break;
				case 4: c=Color.BLUE;break;
				case 5: c=Color.ORANGE;break;
				case 6: c=Color.YELLOW;break;
				case 7: c=Color.PINK;break;
				case 8: c=Color.CYAN;break;
			}
		}});
		//add(b);
		add(ls);
		addMouseMotionListener(this);
		addWindowListener(
			new WindowListener()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
				public void windowDeactivated(WindowEvent we)
				{
					
				}
				public void windowActivated(WindowEvent we)
				{
					
				}
				public void windowDeiconified(WindowEvent we)
				{
					
				}
				public void windowIconified(WindowEvent we)
				{
					
				}
				public void windowClosed(WindowEvent we)
				{
					
				}
				public void windowOpened(WindowEvent we)
				{
					
				}
			}
		);
	}

	public void mouseDragged(MouseEvent me)
	{
		g=getGraphics();
			switch(l.getSelectedIndex())
			{
				case 0: c=Color.WHITE;break;
				case 1: c=Color.BLACK;break;
				case 2: c=Color.RED;break;
				case 3: c=Color.GREEN;break;
				case 4: c=Color.BLUE;break;
				case 5: c=Color.ORANGE;break;
				case 6: c=Color.YELLOW;break;
				case 7: c=Color.PINK;break;
				case 8: c=Color.CYAN;break;
			}
		g.setColor(c);
switch(ls.getSelectedIndex())
{
case 0:g.drawOval(me.getX(), me.getY(), 20, 20);break;
case 1:g.fillOval(me.getX(), me.getY(), 20, 20);break;
case 2:g.drawRect(me.getX(), me.getY(), 20, 20);break;
case 3:g.fillRect(me.getX(), me.getY(), 20, 20);break;
default:g.fillOval(me.getX(), me.getY(), 20, 20);break;
}
	}

	public void mouseMoved(MouseEvent me)
	{
		g=getGraphics();
	}
	
	public static void main(String a[])
	{
		new FHPaint();
	}
}