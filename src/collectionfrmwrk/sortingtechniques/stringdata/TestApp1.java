package collectionfrmwrk.sortingtechniques.stringdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("rakesh");
		list.add("ankur");
		list.add("brijesh");
		list.add("sagar");
		list.add("arya");
		
		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
		System.out.println("After Sorting : ");
		Collections.sort(list);
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
