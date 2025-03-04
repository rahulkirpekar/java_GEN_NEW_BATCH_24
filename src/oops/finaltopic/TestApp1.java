package oops.finaltopic;

public class TestApp1 
{
	final int no;
	
	public TestApp1() 
	{
		no  = 200;
	} 
	public TestApp1(int no) 
	{
		this.no  = no;
	} 
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1(1000);
		
		System.out.println("obj.no : " + obj.no);
		
		
		// local variable
//		final int no = 10;
//		System.out.println("NO : " + no);
//		no = 10;
//		System.out.println("NO : " + no);
	}
}
