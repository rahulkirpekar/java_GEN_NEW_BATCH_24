package oops.abstopic.interfacetopic;

public class School implements Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School : Student--getBehave()");
	}
	public void getHomeWork() 
	{
		System.out.println("School : getHomeWork()");
	}
}
