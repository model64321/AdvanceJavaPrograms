import java.util.*;

class Interest 
{
	private double p;
	private double n;
	private double r;
	Scanner sc=new Scanner(System.in);
		
		public void getData()
		{	
			double val;
			System.out.println("Enter period : ");
			p=sc.nextDouble();
			System.out.println("Enter amount : ");
			n=sc.nextDouble();
			System.out.println("Enter rate : ");
			r=sc.nextDouble();
			val=(p*n*r)/100;
			System.out.println("Interest is : "+val);
		}
			
}

class ExampleInterest
{
	public static void main(String args [])
	{
		Interest a=new Interest();
		a.getData();
		
	}
}