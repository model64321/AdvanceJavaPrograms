import calculations.area.*;

class PackageCall
{
	public static void main(String args [])
	{
		int r=4;
		Circle c1=new Circle(r);
		c1.getArea();
		Circle c2=new Circle();
		c2.getInput();
		c2.getArea();		
		int l=3;
		int b=4;
		Rectangle r1=new Rectangle(l,b);
		r1.getArea();
		Rectangle r2=new Rectangle();
		r2.getInput();
		r2.getArea();
	}
}