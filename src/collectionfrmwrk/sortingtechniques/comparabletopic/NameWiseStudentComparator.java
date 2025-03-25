package collectionfrmwrk.sortingtechniques.comparabletopic;

import java.util.Comparator;
import collectionfrmwrk.listtopic.Student;

public class NameWiseStudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		return s1.getName().compareTo(s2.getName());
	}
}
