import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
	
	class Tree extends JFrame
{
	Tree()
	{
		JFrame f=new JFrame();
	DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
	DefaultMutableTreeNode colors=new DefaultMutableTreeNode("colors");
	DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
                 DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
                 DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
                  root.add(colors);
    	 colors .add(red);
	 colors.add(green);
	 colors.add(blue);
    
                 final  JTree jt=new JTree(root);
                 final Label l=new Label("path will be shown here...");
                 
                 Button b=new Button("show path");
 
               b.addActionListener(new ActionListener()
                 {
                       public void actionPerformed(ActionEvent e)
                             {
                                   l.setText(jt.getSelectionPath()+"");
                              }
                 });

                      f.add(jt);
                      f.add(b);
	     f.add(l);
	     f.setVisible(true);
                      f.setSize(300,300);
                      f.setLayout(new FlowLayout());
        }
                   public static void main(String a[])
             {
                           new Tree();
             }
}

                    


