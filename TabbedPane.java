import javax.swing.*;  
public class TabbedPane
 {  
	JFrame f;  
	TabbedPane()
	{  
  	  f=new JFrame("tabbedpane example");  

    	JPanel p1=new JPanel();  
    	JPanel p2=new JPanel();  
	
   	 JPanel p3=new JPanel();  
    	JTabbedPane tp=new JTabbedPane();  
  	  tp.setBounds(100,100,200,200);  
	 tp.add("button",p1);  
  	  tp.add("table",p2);  
	
  	  tp.add("combobox",p3);     
    	f.add(tp);  
	    f.setSize(400,400);  
 	   f.setLayout(null);  
  	  f.setVisible(true); 

		JButton b1=new JButton("Color");
		JButton b2=new JButton("Blue");
		//b1.setColor(Color.blue);
		b1.setBounds(50,50,20,20);
		p1.add(b1) ;
		p1.add(b2) ;
		String column[]={"Lastname","Firstname","SALARY"};
		String data[][]={{"        Lastname","Firstname","SALARY"},
			          {"        Lad","Tina","10"},
			        {"       Chavan","Sanjay","20"},
			        {"        Joshi","Rahul","20"}};
		
		JTable jt=new JTable(data,column);
		jt.setBounds(100,100,200,200);
		
		p2.add(jt);

		String City[]={"KOP","PUNE","NAGPUR"};
		JComboBox cb=new JComboBox (City);
		cb.setBounds(30,40,100,100);
		p3.add(cb);

		
	 
}  
	public static void main(String[] args) 
	{  
    		new TabbedPane();  
	}
}  	