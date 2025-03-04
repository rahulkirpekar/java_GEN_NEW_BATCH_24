package oops.polymophismtopic.runtime;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace : Citizen--getBehave()");
	}
	public void getPublicEvent() 
	{
		System.out.println("PublicPlace : getPublicEvent()");
	}
}
