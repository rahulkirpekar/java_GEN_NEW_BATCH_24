package collectionfrmwrk.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queueObj = new PriorityQueue<>();
		
		queueObj.add("rahul");
		queueObj.add("ankur");
		queueObj.add("sagar");
		queueObj.add("ramesh");
		queueObj.add("brijesh");
		
		
		Iterator<String> itr =	queueObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
