package calculations.area;
import java.util.Scanner;

public class Circle
{
	int r;
	public Circle()
	{
	}
	public Circle(int r)
	{
	this.r=r;
	}
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius ");
		r=sc.nextInt();
	}
	public void getArea()
	{
	double ca=r*r*3.14;
	System.out.println("Area of circle is :"+ca);
	}
}