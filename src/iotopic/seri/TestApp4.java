package iotopic.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try 
		(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\java_GEN_NEW_BATCH_24\\liststudentsrecord.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);	
			)
		{
			// object array ---read from file---Deserialised			
			Student s[] = (Student[])oin.readObject();
			
			for (int i = 0; i < s.length; i++) 
			{
				s[i].disp();
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
