package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// 8-primitive
		// 1- user defined datatype
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(6);
		list.add(5);
		
		Iterator<Integer> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer value = itr.next();
			System.out.println(value);
		}
	}
}
