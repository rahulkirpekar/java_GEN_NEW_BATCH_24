package oops.abstopic.interfacetopic;

import java.util.Scanner;

public class TestApp2 
{
	public void getBehaveByPlace(Person person) 
	{
		person.getBehave();
		
		if (person instanceof Home) 
		{
			System.out.println("==>(person instanceof Home) true");
			// Downcasting----[parent refeerence convert into child class]
			Home home = (Home)person;
			home.getSocialEvent();
			
		}else if (person instanceof PublicPlace)
		{
			System.out.println("==>(person instanceof PublicPlace) true");

			PublicPlace publicObj = (PublicPlace)person;
			publicObj.getPublicEvent();
		}
		else if (person instanceof School)
		{
			System.out.println("==>(person instanceof School) true");
			School school = (School)person;
			school.getHomeWork();
		}
		else if (person instanceof Org)
		{
			System.out.println("==>(person instanceof Org) true");

			Org org = (Org)person;
			org.getTaskInfo();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below choice : ");
		System.out.println("1) For Home Place");
		System.out.println("2) For Org Place");
		System.out.println("3) For PublicPlace Place");
		System.out.println("4) For School Place");
		int choice  =  sc.nextInt();

		TestApp2 testApp = new  TestApp2();
				
		
		switch(choice) 
		{
			case 1: Home home = new Home();
					testApp.getBehaveByPlace(home);
					break;
					
			case 2: Org org= new Org();
					testApp.getBehaveByPlace(org);
					break;
					
			case 3: PublicPlace publicObj = new PublicPlace();
					testApp.getBehaveByPlace(publicObj);
					break;
					
			case 4:	School school =  new School();
					testApp.getBehaveByPlace(school);
					break;
		}
	}
}
