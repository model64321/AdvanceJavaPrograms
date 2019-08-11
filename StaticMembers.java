import java.util.*;

class Box
{
	private int length;
	private int breadth;
	private int height;
	public static int same_len;
	Scanner sc=new Scanner(System.in);
	
	public void getVolume()
	{
	System.out.println("Enter length : ");
	length=sc.nextInt();
	System.out.println("Enter breadth : ");
	breadth=sc.nextInt();
	System.out.println("Enter height : ");
	height=sc.nextInt();
	if(length==breadth && breadth==height && height==length)
	{
		same_len++;
	}
	int vol=length*breadth*height;
	System.out.println("Volume is : "+vol);
	
	}
	public static void method()
	{
		System.out.println("No of boxes with same len bredth and height: "+same_len);
		
	}
}

class  StaticMembers
{
	public static void main(String args [])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes you want : ");
		int no_boxes=sc.nextInt();
		Box b[]=new Box[no_boxes];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Box();
			b[i].getVolume();
			
		}
		
		Box.method();
		
	}
	
	
}