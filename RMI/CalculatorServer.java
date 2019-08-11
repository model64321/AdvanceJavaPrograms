import java.rmi.*;

public class CalculatorServer
{

	CalculatorServer()
	{
	
			try{
				Calculator c=new CalculatorImpl();
				Naming.rebind("rmi://127.0.0.1:1099/CalculatorService",c);
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public static void main(String args [])
	{
		new CalculatorServer();
	
	
	}


}