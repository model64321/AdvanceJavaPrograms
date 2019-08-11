import java.util.*;

class Employee
{
	String name;
	String dept;
	float sal;
	
	public Employee(String name,String dept,float sal)
	{
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	public void getCalc()
	{
		float hra=sal*0.30f;
		System.out.println("hra :"+hra);
		float da=sal*0.45f;
		System.out.println("da: "+da);
		float pf=sal*0.32f;
		System.out.println("pf:"+pf);
		float net=(sal+da+hra)-pf;
		System.out.println("net:"+net);
	}
	
}

class ExampleEmployee
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp name,dept and salary");
		String p=sc.next();
		String d=sc.next();
		float  s=sc.nextFloat();
		Employee a=new Employee(p,d,s);
		a.getCalc();
		
	}
}