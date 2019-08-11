import javax.swing.*;  
public class TabbedPane
 {  
	JFrame f;  
	TabbedPaneExample()
	{  
  	  f=new JFrame("tabbedpane example");  
     
    	JPanel p1=new JPanel();  
   
    	JPanel p2=new JPanel();  
   	 JPanel p3=new JPanel();  
    	JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(50,50,200,200);  
    tp.add("button",p1);  
    tp.add("combobox",p2);  
    tp.add("table",p3);    
    f.add(tp);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

		JButton b1=new JButton("blue");
		JButton b2=new JButton("b");
		//b1.setColor(Color.blue);
		b1.setBounds(10,10,20,20);
		p1.add(b1) ;
		p1.add(b2) ;

	String Country[]={"india","US","AUS"};
		JComboBox cb=new JComboBox (Country);
		cb.setBounds(30,40,100,100);
		p2.add(cb);

		String data[][]={{"101","neha","10000"},
			        {"102","sneha","2000"},
			        {"103","amit","3000"}};
		String column[]={"ID","NAME","SALARY"};
		JTable jt=new JTable(data,column);
		jt.setBounds(30,30,50,50);
		
		p3.add(jt);
	 
}  
public static void main(String[] args) {  
    new TabbedPane();  
}}  