import java.util.*;

class Account
{
	String nm;
	int acno;
	double bal;
	Interest in;
	
	public Account(String nm,int acno,double bal,float rate)
	{
	
		this.nm=nm;
		this.acno=acno;
		this.bal=bal;
		in=new Interest(rate);
		
	}
	
	public void show()
	{
		System.out.println("Name"+nm);
		System.out.println("Balance"+bal);
		System.out.println("Account no"+acno);

		
		
	}
		
	class Interest
	{
		static final int n=3;
		float rate;
		public Interest(float rate)
		{
			this.rate=rate;
		}
		
		public void calInterest()
		{
		float  si=(float)(bal*rate*n)/100;
	
		System.out.println("Intrest is "+si);
		}
		
	}
}

class InnerEx
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name acno bal and rate");
		
		String s=sc.next();
		int acno=sc.nextInt();
		double bal=sc.nextDouble();
		float rate=sc.nextFloat();
		
		Account a=new Account(s,acno,bal,rate);
		a.show();
		a.in.calInterest();
	}
}