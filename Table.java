import javax.Swing.*;
import java.awt.*;
  
  public class TableEx
 {
       JFrame f;
       TableEx()
     {
            f=new JFrame();
            String column[]={"ID","NAME","SALARY"};
            String data[][]={{"1","Amit","10000"},
		    {"2","Anand","20000"}
                                      {"3","Rj","30000"}};
    
             JTable jt=new JTable(data,column);
              jt.setBounds(30,40,200,300);
             JScrollpane sp=new JScrollpane(jt);
              f.add(sp);
              f.setLayout(new FlowLayout());
              f.setSize(300,400);
              f.setVisible(true);
    }
 
  public static void main(String a[])
  {
    new TableEx();
   }
}