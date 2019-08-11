import java.util.*;

abstract class Vehicle
{
		protected String vehicleno;
		protected String model;
		protected String company;
		protected double price;
  		abstract void get();
		abstract void start();
		abstract void stop();
		abstract void show();
		
}

class Car extends Vehicle
{
	int eng_power;
	
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle  number");
		vehicleno=sc.next();
		System.out.println("Enter model");
		model=sc.next();
		System.out.println("Enter company");
		company=sc.next();
		System.out.println("Enter price");
		price=sc.nextDouble();
		System.out.println("Enter engine power");
		eng_power=sc.nextInt();
		
	}
	public void start()
	{
		System.out.println("Auto Start Button :) ");
	}
	
	public void stop()
	{
		System.out.println("Auto Stop Button ;)");
	}
	
	public void show()
	{
		System.out.println("Vehicle no is "+vehicleno);
		System.out.println("Model no is "+model);
		System.out.println("Company is "+company);
		System.out.println("Price : "+price);
		System.out.println("Engine Power : "+eng_power);
	}
	
}

class Scooter extends Vehicle
{
	boolean auto_start;
	
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle  number");
		vehicleno=sc.next();
		System.out.println("Enter model");
		model=sc.next();
		System.out.println("Enter company");
		company=sc.next();
		System.out.println("Enter price");
		price=sc.nextDouble();
    	System.out.println("Autostart True/False : ");
		auto_start=sc.nextBoolean();
		
	}
	
	public void start()
	{
		System.out.println("No Auto Start Button :) ");
	}
	
	public void stop()
	{
		System.out.println("No Auto Stop Button ;)");
	}
	
	public void show()
	{
		System.out.println("Vehicle no is "+vehicleno);
		System.out.println("Model no is "+model);
		System.out.println("Company is "+company);
		System.out.println("Price : "+price);
		System.out.println(" Auto Start is : "+auto_start);
		
	}		
}

class VehicleInfo
{
	public  static void main (String args[])
	{
			Scanner sc=new Scanner(System.in);
			int ch;
			Vehicle v[]=new Vehicle[2];			
			do
			{	
				System.out.println("\n1.Car\n2.Scooter\n3.Exit :o ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						v[0]=new Car();
						v[0].get();
						v[0].start();
						v[0].stop();
						v[0].show();
						break;
						
					case 2:
						v[1]=new Scooter();
						v[1].get();
						v[1].start();
						v[1].stop();
						v[1].show();
						break;
						
					case 3:
						System.exit(0);
						
					default :
						System.out.println("WronG ChoicE :( ");
						
				}
			}
			while(true);
			
	}
}
