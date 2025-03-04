package oops.abstopic.interfacetopic;

public class PublicPlace implements Person
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
