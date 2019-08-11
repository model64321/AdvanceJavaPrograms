import java.util.*;

	class Mult_table
	{
		public static void main (String [ ] args)
		{
			int no,mul;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number : ");
			no=sc.nextInt();
			
			for(int i=1;i<11;i++)
			{
				mul=i*no;
				System.out.println(" "+mul);
			}
			
		}
	}