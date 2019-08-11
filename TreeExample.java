 
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample extends JFrame
{
    private JTree tree;
    public TreeExample()
    {
        //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        //create the child nodes
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("colors");
	DefaultMutableTreeNode red= new DefaultMutableTreeNode("red");
	DefaultMutableTreeNode green= new DefaultMutableTreeNode("green");
	DefaultMutableTreeNode blue= new DefaultMutableTreeNode("blue");
	DefaultMutableTreeNode orange= new DefaultMutableTreeNode("orange");
        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
	DefaultMutableTreeNode grapes = new DefaultMutableTreeNode("grapes ");
	DefaultMutableTreeNode mango = new DefaultMutableTreeNode("mango ");
	DefaultMutableTreeNode banana = new DefaultMutableTreeNode("banana ");
	DefaultMutableTreeNode pich = new DefaultMutableTreeNode("pich ");
        //add the child nodes to the root node
        root.add(color);
	color.add(red);
	color.add(green);
	color.add(blue);
	color.add(orange);
	
        root.add(fruitNode);
	fruitNode.add(grapes);
	fruitNode.add(mango);
	fruitNode.add(banana);
	fruitNode.add(pich);
         
        //create the tree by passing in the root node
        tree = new JTree(root);
        add(tree);
         
      //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
       
                new TreeExample();
            
        
    }      
}