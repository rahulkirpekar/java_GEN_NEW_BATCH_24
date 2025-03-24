package collectionfrmwrk.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		LinkedList<String>list = new LinkedList();
		
		list.add("rakesh");
		list.add("ankur");
		list.add("ramesh");
		list.add("brijesh");
		list.add("amar");
		list.add("sagar");
		
		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
