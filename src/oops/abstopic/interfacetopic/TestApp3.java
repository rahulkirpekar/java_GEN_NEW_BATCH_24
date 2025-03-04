package oops.abstopic.interfacetopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Person p = new Org();
		
		// static method--called by Interface Name
		Person.testStatic();
		
		// abstract method
		p.getBehave();
		
		// default method
		p.testDefault();
		
	}
}
