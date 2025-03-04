package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		// Primitive--value--convert into----object---AutoBoxing
		
		// -object---convert into--primitive---UnBoxing
		
		list.add(true);//0 
		list.add('r');//1<==itr
		list.add(12);//2
		list.add(100l);//3
		list.add("royal");//4
		list.add(12f);//5
		list.add(12.21);//6
		Student s= new Student(1, "rahul", 12);
		list.add(s);//7

		System.out.println("list.size() : " + list.size());
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s1= (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println(obj);
			}
		}
//-----------------------------------------------------------------
/*		
		for (int i = 0; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			if (obj instanceof Student) 
			{
				Student s1= (Student)obj;
				System.out.println("list.get("+i+") : "+s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println("list.get("+i+") : " + obj);
			}
		}
//-----------------------------------------------------------------
		
		for (Object obj	: list) 
		{
			if (obj instanceof Student) 
			{
				Student s1= (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println(obj);
			}
		}
//-----------------------------------------------------------------
 */

	}
}