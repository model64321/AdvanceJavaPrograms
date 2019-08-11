import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class MenuBarExample extends Frame
{
	MenuBarExample(){
		
		Frame jf=new Frame();

		MenuBar mb=new MenuBar();
		Menu file=new Menu("File");
		Menu edit=new Menu("Edit");
		Menu format=new Menu("Format");
		MenuItem a=new MenuItem("a");
		MenuItem b=new MenuItem("b");
		MenuItem c=new MenuItem("c");
		MenuItem d=new MenuItem("d");
		MenuItem e=new MenuItem("e");
		MenuItem f=new MenuItem("f");

		file.add(a);
		file.add(b);
		edit.add(c);
		edit.add(d);
		format.add(e);
		format.add(f);

		mb.add(file);
		mb.add(edit);
		mb.add(format);

		jf.add(mb);
		jf.setVisible(true);
		jf.setSize(300, 300);
	
	}
	public static void main(String a[]){ new MenuBarExample(); }
}