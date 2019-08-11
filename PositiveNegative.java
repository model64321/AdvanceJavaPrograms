import java.util.*;

	class PositiveNegative
	{
		public static void main(String[] args)	
		{		
			int num=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number : ");
			num=s.nextInt();
			if(num<0)
			{
				System.out.println("Entered Number is Negative ");
			}
			else
			{
				System.out.println("Entered Number is Positive ");
			}
		}		
	}