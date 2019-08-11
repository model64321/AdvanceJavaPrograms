import javax.swing.*;    
import java.awt.event.*;    
public class MenuuExample

{    
JFrame f;    
JMenuBar mb;    
JMenu file,edit,help;    
JMenuItem cut,copy,paste;    
 
MenuuExample(){    
	
	f=new JFrame();    
	mb=new JMenuBar();
	
	file=new JMenu("File");
	edit=new JMenu("Edit");
	help=new JMenu("Help");
	
	
	cut=new JMenuItem("cut");    
	copy=new JMenuItem("copy");    
	paste=new JMenuItem("paste");    
   
	mb.add(file);
	mb.add(edit);
	mb.add(help);

	file.add(cut);
	edit.add(copy);
	help.add(paste);

	f.setVisible(true);
	f.setSize(400,400);
	f.setJMenuBar(mb);
	
}  

   
public static void main(String[] args) {    
    new MenuuExample();    
}    
}    