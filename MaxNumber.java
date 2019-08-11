import java.util.*;

	class MaxNumber
	{
		public static void main (String [ ] Args)
		{
			int n1,n2,n3;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st number : ");
			n1=sc.nextInt();
			System.out.println("Enter 2nd number : ");
			n2=sc.nextInt();
			System.out.println("Enter 3rd number : ");
			n3=sc.nextInt();
			
			if(n1>n2 && n1>n3)
			{
				System.out.println("Maximum Number is : "+n1);
		
			}
			else if(n2>n1 && n2>n3)
			{
				System.out.println("Maximum Number is : "+n2);
			}
			else
			{
				System.out.println("Maximum Number is : "+n3);
			}
		}
	}