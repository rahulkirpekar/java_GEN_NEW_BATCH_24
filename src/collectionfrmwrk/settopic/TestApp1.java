package collectionfrmwrk.settopic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashSet<String> setObj = new HashSet<>();
//		LinkedHashSet<String> setObj = new LinkedHashSet<>();
		TreeSet<String> setObj = new TreeSet<>();
		 
		setObj.add("Kunal");
		setObj.add("Rahul");
		setObj.add("Ankur");
		setObj.add("Brijesh");
		setObj.add("Rahul");
		setObj.add("Sagar");
		setObj.add("Kunal");
		setObj.add("Brijesh");
		
		Iterator<String> itr =	setObj.iterator();
		while(itr.hasNext()) 
		{
			String value = itr.next();
			System.out.println(value);
		}
	}

}
