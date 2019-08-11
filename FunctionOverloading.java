import java.util.*;

class Volumes
{
	public void volume(int l,int b,int h)
	{
		int a=l*b*h;
		System.out.println("Volume of box is : "+a);
	}
	
	public void volume(int l)
	{
		int a=l*l*l;
		System.out.println("Volume of cube is : "+a);
	}
	
	public void volume(double r,double h)
	{
		double a=3.14*r*r*h;
		System.out.println("Volume of Cylinder is : "+a);
	}
	
	public void volume(float r,float h)
	{
		double a=1/3f*3.14*r*r*h;
		System.out.println("Volume of Cone is : "+a);
	}
	
}

class FunctionOverloading
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner(System.in);
		Volumes v=new Volumes();
		
		System.out.println("Enter Length Breadth and Height:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		v.volume(l,b,h);
		System.out.println("Enter Length:");
		int s=sc.nextInt();	
		v.volume(s);
		System.out.println("Enter radius and height : ");
		double r=sc.nextDouble();
		double ht=sc.nextDouble();
		v.volume(r,ht);
		System.out.println("Enter radius and height : ");
		float rad=sc.nextFloat();
		float height=sc.nextFloat();
		v.volume(rad,height);
	}
}