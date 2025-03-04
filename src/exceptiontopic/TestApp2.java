package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		try 
		{
			a[5] = 10;
			
		}
		catch (NullPointerException e) 
		{
			System.out.println("Catch Block Handled Exception");
			e.printStackTrace();
		}finally 
		{
			System.out.println("Finally Block");	
		}
				
		
		
		System.out.println("General Statements");
		
		
	}
}
