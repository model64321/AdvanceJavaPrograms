class Drawing 
{
	public void draw()
	{
		System.out.println("Draw");
	}
	public void fill()
	{
		System.out.println("Fill");
	}
	public void erase()
	{
		System.out.println("Erase");
	}
}

class CircleDrawing extends Drawing
{
	public void draw()
	{
		System.out.println("Draw Circle");
	}
	public void fill()
	{
		System.out.println("Fill Circle");
	}
}

class RectangleDrawing extends Drawing
{
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
	public void erase()
	{
		System.out.println("Erase Rectangle");
	}
}

class ExampleDrawing
{
	public static void main(String args[])
	{
		Drawing d=new Drawing();
		CircleDrawing cd=new CircleDrawing();
		RectangleDrawing rd=new RectangleDrawing();
		Drawing d1;
		d1=d;
		d1.draw();
		d1.fill();
		d1.erase();
		d1=cd;
		d1.draw();
		d1.fill();
		d1.erase();
		d1=rd;
		d1.draw();
		d1.fill();
		d1.erase();	
	}
}