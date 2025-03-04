package iotopic.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		// data -- student object--s1---write into file
		
		// Auto Closable Resource--Java--7th version
		try (
				FileOutputStream fout = new FileOutputStream("royallist.txt");
				ObjectOutputStream out  = new ObjectOutputStream(fout);
			)
		{
			// object write into file--->Serialized
			out.writeObject(s1);
			
			System.out.println("Success");
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
