import java.rmi.*;

public class CalculatorClient
{

	public static void main(String args [])
	{
		try{
		
			Calculator c=(Calculator)Naming.lookup("127.0.0.1:1099/CalculatorService");
			System.out.println("Addition is :-"+c.add(10,15));
		
		
		
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
		}
	
	
	}


}