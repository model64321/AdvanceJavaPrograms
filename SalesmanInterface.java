import java .util.*;

interface Commission
{
	static final double percent=0.25;
	void calCommission();
}

interface Payment
{
	void calPayment();
}

class Salesman implements Commission,Payment
{
	Scanner sc=new Scanner(System.in);
	String nm;
	double sal;
	double amt;
	
	public Salesman(String nm,float sal)
	{
		this.nm=nm;
		this.sal=sal;
		
	}
	
	public String toString()
	{
		return "\nName:- "+nm+"\nSalary:- "+sal;
	}
	public void getAmount()
	{
		System.out.println("Enter todays amount on your sale: ");
		amt=sc.nextFloat();
	}
	
	public void calCommission()
	{
		double cm=amt*percent;
		System.out.println("Total Commission on your sale is :"+cm);
	}
	
	public void calPayment()
	{
		double hra=0.30*sal;
		double da=0.40*sal;
		double pf=0.35*sal;
		double net=(sal+da+hra)-pf;
		
		
		System.out.print("\nhra="+hra+"\nda="+da+"\npf="+pf+"\nnet="+net);
	}
}

class SalesmanInterface
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		Salesman s=new Salesman("Sahil",100000);
		System.out.println(s);
		s.getAmount();
		Commission c=s;
		c.calCommission();
		Payment p=s;
		p.calPayment();
	}
}