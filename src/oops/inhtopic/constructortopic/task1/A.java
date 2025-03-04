package oops.inhtopic.constructortopic.task1;

public class A 
{
	int no1;
	public A()
	{
		no1=10;
		System.out.println("A() : no1 : "  + no1);
	}
	public A(int no1)
	{
		this.no1 = no1;
		System.out.println("A(int no1) : no1 : "  + no1);
	}
}
