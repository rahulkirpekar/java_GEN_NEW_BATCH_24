package collectionfrmwrk.sortingtechniques.comparabletopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import collectionfrmwrk.listtopic.Student;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "rahul", 12);
		Student s2= new Student(2, "sagar", 7);
		Student s3= new Student(3, "rakesh", 11);
		Student s4= new Student(4, "ankur", 11);
		Student s5= new Student(5, "brijesh", 10);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
	
		ListIterator<Student> itr =	list.listIterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
		}
		System.out.println("--------------");
		
		Collections.sort(list, new StdWiseStudentComparator());
		
		itr =	list.listIterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
		}
//		
//		System.out.println("--------------");
//		
//		Collections.sort(list, new NameWiseStudentComparator());
//		
//		itr =	list.listIterator();
//		while(itr.hasNext()) 
//		{
//			Student s = itr.next();
//			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
//		}
	}
}
