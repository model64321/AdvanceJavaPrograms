import java.awt.*;  
import javax.swing.*;    
  
public class JScrollPaneExample {  

   
  	JScrollPaneExample()
	{
  	 JFrame frame = new JFrame("Scroll Pane Example");    
        frame.setSize(500, 500);  
        frame.setVisible(true);  
	
 	frame.setLayout(new FlowLayout());
 
  
        TextArea txt = new TextArea(20,20);  
        JScrollPane pane= new JScrollPane(txt);  
  
    	
	frame.add(pane);
  
	}
     
    public static void main(String[] args) {  
  
  
	new JScrollPaneExample();   
    }  
}  