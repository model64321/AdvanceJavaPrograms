import java.util.*;

class ManualException
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Print number");
			int no=sc.nextInt();
			
			if(no%2!=0)
			{
			throw new Exception("No must be even");
			}
			System.out.println("No is even");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}