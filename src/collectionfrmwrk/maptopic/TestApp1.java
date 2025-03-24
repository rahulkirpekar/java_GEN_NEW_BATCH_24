package collectionfrmwrk.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashMap<Integer, String> mapObj = new HashMap<>();
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<>();
		TreeMap<Integer, String> mapObj = new TreeMap<>();
		
		mapObj.put(50, "ankur");
		mapObj.put(10, "rahul");// Entry---[Key,Value]
		mapObj.put(41, "rakesh");
		mapObj.put(28, "sagar");
		mapObj.put(3, "brijesh");
		
		
		for(Map.Entry<Integer, String> e :	mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
