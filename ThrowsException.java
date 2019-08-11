import java.util.*;

class ThrowsEx 
{
	public static void prime(int n) throws Exception
	{
		int i=2;
		
		while(n%i!=0)
		{
			i++;
		}
		if(i!=n)
		{
			throw new Exception("No. should be prime");
		}
		System.out.println("No. is prime");
	}
	
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		try
		{
			prime(n);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
}