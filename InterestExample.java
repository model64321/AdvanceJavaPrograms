import java.util.*;

class Account
{
	String name;
	int acc_no;
	double balance;
	Interest in;
	
	public Account(String name;int acc_no,double balance,float rate)
	{
		this.name=name;
		this.acc_no=acc_no;
		this.balance=balance;
		in=new Interest(rate);
	}
	
	public void show()
	{
		System.out.println("Account no is "+acc_no+" Name is "+name+" balance amount : "+balance+");
	}


	class Interest
	{
	static final n=3;
	float rate;
		public Interest(float rate)
		{
		this.rate=rate;
		}
	
		public void callInterest()
		{
		float si=(float)(balance*rate*n)/100;
		System.out.println("Simple interest is : "+si);
		}
	}
}

class InnerExample
{
	public static void main(String args [])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name,account no,balance and rate of interest : ");
	String s=sc.next();
	int ano=sc.nextInt();
	double b=sc.nextDouble;
	float r=sc.nextFloat();
	
	Account a=new Account(s,ano,b,r);
	a.show();
	a.callInterest();
	}
}