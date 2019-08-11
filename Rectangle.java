package calculations.area;
import java.util.Scanner;

public class Rectangle
{
	int l,b;
	public Rectangle()
	{
	}
	public Rectangle(int l,int b)
	{
	this.l=l;
	this.b=b;
	}
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length and Breadth : ");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void getArea()
	{
	int ra=l*b;
	System.out.println("Area of rectangle is :"+ra);
	}
}