

class ExceptionExample
{
	public static void main(String args [])
	{
		try
		{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int r=(x/y);
			System.out.println("Result is "+r);
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println(ab);
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		finally
		{
			System.out.println("Always Executed");
		}
	}
}