package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApplication 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Student s = null;
		int choice = 0;
		int rno ;
		
		do 
		{	
			System.out.println("Enter below choice : ");
			System.out.println("1) insert Student         ");
			System.out.println("2) update Student By Rno  ");
			System.out.println("3) delete Student By Rno  ");
			System.out.println("4) display all records    ");
			System.out.println("5) search By Rno or name	");
			System.out.println("6) For Exit");
			choice  = sc.nextInt();
			
			mainMenu:
			switch(choice) 
			{
				case 1: s = new Student();
						s.scanData();
						list.add(s);
						System.out.println("Student record succfully inserted and Total records : "+list.size());
						break;
						
				case 2:
						System.out.println("Enter Rno which you want to Update student recorrd : ");
						rno = sc.nextInt();
						boolean flag = true;
						 
						 for(int i = 0 ; i< list.size();i++) 
						 {
							 s = list.get(i);
							 
							 if(s.getRno() == rno) 
							 {
								 s.updateData();
								 list.set(i, s);
								 flag = false;
								 break;
							 }
						 }
						 if(flag) 
						 {
							 System.out.println("Given rno not found in Student Records.");
						 }else 
						 {
							 System.out.println("Given "+ rno +" is updated from Student records.");
						 }
					
						break;
						
						
				case 3:  System.out.println("Enter Rno which you want to remove student recorrd : ");
						 rno = sc.nextInt();
						 
						 flag = true;
						 
						 for(int i = 0 ; i< list.size();i++) 
						 {
							 s = list.get(i);
							 
							 if(s.getRno() == rno) 
							 {
								 list.remove(i);
								 flag = false;
								 break;
							 }
						 }
						 if(flag) 
						 {
							 System.out.println("Given rno not found in Student Records.");
						 }else 
						 {
							 System.out.println("Given "+ rno +" is deleted from Student records.");
						 }
						break;
				case 4: 
						for(int i = 0 ; i< list.size();i++) 
						{
							s = list.get(i);
							s.dispData();
						}
						break;
				case 5:
						System.out.println("Enter below choice for Search Student record.");
						int choiceSearch;
						System.out.println("1) for Rno");	
						System.out.println("2) for Name");	
						System.out.println("3) for Main Menu");	
						
						choiceSearch = sc.nextInt();
						
						switch(choiceSearch) 
						{
							case 1: System.out.println("Enter Rno to search Student record: ");
							        int rnoSearch = sc.nextInt();
							        flag = true;
							        for(int i = 0 ; i< list.size();i++) 
									{
										s = list.get(i);
										if(s.getRno()==rnoSearch) 
										{
											flag = false;
											s.dispData();
											break;
										}
									}
							        if(flag) 
							        {
							        	System.out.println("Give "+rnoSearch+" is not present in Student records.");
							        }
									break;		
							case 2:
									sc.nextLine();
									System.out.println("Enter Name to search Student record: ");
							        String nameSearch = sc.nextLine();
							        flag = true;
							        for(int i = 0 ; i< list.size();i++) 
									{
										s = list.get(i);
										if(s.getName().equals(nameSearch)) 
										{
											flag = false;
											s.dispData();
											break;
										}
									}
							        if(flag) 
							        {
							        	System.out.println("Give "+nameSearch+" is not present int Student records.");
							        }
									break;	
							case 3:
									break mainMenu;
						}
						
						break;
				case 6: System.out.println("Student Application will be exi...");
						try 
						{
							Thread.sleep(2000);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(1);
						break;
			}
		}while(choice != 6);	
	}
}
