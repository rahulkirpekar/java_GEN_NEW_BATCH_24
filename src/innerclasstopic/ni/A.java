package innerclasstopic.ni;

// Outer class
public class A 
{
	static int no = 1000;

	// [InnerClass + static] ===> [Nested Innerclass]
	static class B
	{
		void disp() 
		{
			System.out.println("NO : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		
		obj.disp();
	}
}
