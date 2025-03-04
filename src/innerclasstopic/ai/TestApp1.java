package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		B obj = new B();
//		obj.disp();
		
		
		// Anonymous Innerclass
		A obj = new A() 
		{
			@Override
			public void disp() 
			{
				System.out.println("B--disp()");
			}
		};
				
		obj.disp();
		
	}
}
