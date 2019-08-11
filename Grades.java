import java.util.*;

	class Grades
	{
		public static void main(String[] args)
		{
			float Science,Maths,English,SST,Marathi;
			double Total,Average;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Marks For Science : ");
			Science=sc.nextFloat();
			System.out.println("Enter Marks For Maths : ");
			Maths=sc.nextFloat();
			System.out.println("Enter Marks For English : ");
			English=sc.nextFloat();
			System.out.println("Enter Marks For SSt : ");
			SST=sc.nextFloat();
			System.out.println("Enter Marks For Marathi : ");
			Marathi=sc.nextFloat();
			Total=Science+Maths+English+SST+Marathi;
			System.out.println("Your Total Marks : "+Total);
			Average=(Science+Maths+English+SST+Marathi)/5;
			System.out.println("Your Average : "+Average);
			
			if(Average<40)
			{
				System.out.println("FAIL");
			}
			else if(Average>=40 && Average<=60)
			{
				System.out.println("Grade C");
			}
			else if(Average>=60 && Average<=80)
			{
				System.out.println("Grade B");
			}
			else
			{
				System.out.println("Grade A");
			}
			
		}
	}