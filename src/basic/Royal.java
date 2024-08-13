class A
{
	int no1;	
}
class B
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.no1=10;
		System.out.println("B :: Hello World ---obj.no1 : " + obj.no1);
	}
}
class C
{
	public static void main(String args[])
	{
		System.out.println("C :: Hello World");
	}
}
class D
{
	public static void main(String args[])
	{
		System.out.println("D :: Hello World");
	}
}
class TestApp
{
	public static void main(String args[])
	{
		System.out.println("TestApp :: Hello World");
	}
}


