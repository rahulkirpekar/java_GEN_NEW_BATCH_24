package oops.polymophismtopic.runtime;

public class School extends Person
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
