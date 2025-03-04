package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileReader fr = new  FileReader("C:\\Users\\Royal\\eclipse-workspace\\java_GEN_NEW_BATCH_24\\test1.txt");
			int temp;
			
			while(	(temp = fr.read())	!= -1) 
			{
				char value  = (char)temp;
				
				sb.append(value);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final Strring : " + sb);
	}
}
