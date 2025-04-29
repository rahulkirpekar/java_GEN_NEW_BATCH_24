package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// StudentDao---Student Table
public class StudentDao 
{
	// insert sql query
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+ sbean.getName() +"',"+ sbean.getStd() +","+ sbean.getMarks() +")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		Statement stmt = null; 
		int rowsAffected = 0 ;
		
//		1) getDbConnection object
		Connection conn = DBConnection.getConnection();

//		2) validate conn object
		if (conn!=null) 
		{
			try 
			{
//				3) create Statement Object
				stmt = conn.createStatement();
				
				// 4) insert---executeUpdate()
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--insertStudent() Db not connected");
		}
		return rowsAffected;
	}
	// update sql query
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno="+rno;
		
		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao--updateStudent() Db not connected ");
		}
		return rowsAffected;
	}
	// delete sql query
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = "+rno;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDoa--deletSttudent() db not connected");
		} 
		return rowsAffected;
	}
	
	// select sql query
	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		String selectQuery = "SELECT rno, name, std, marks  from student";
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				while(rs.next()) 
				{
					int rno = rs.getInt(1);// rs.getInt("rno");
					String name = rs.getString(2);// rs.getString("name");
					int std = rs.getInt(3);// rs.getInt("std");
					int marks = rs.getInt(4);// rs.getInt("marks");
				
					sbean =  new StudentBean(rno, name, std, marks);
					list.add(sbean);
//					System.out.println(rno+" " + name+" " + std+" " + marks); 
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--getAllStudentRecords()--Db not connected");
		}
		return list;
	}
	public StudentBean getStudentByRno(int rno) 
	{
		String selectStudentByRno = "SELECT * FROM student WHERE rno = "+rno;
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		StudentBean s = null; 
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(selectStudentByRno);
				
				rs.next();
				int rno1 = rs.getInt(1);
				String name = rs.getString(2);
				int std = rs.getInt(3);
				int marks = rs.getInt(4);
						
				s = new StudentBean(rno1, name, std, marks);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao -- getStudentByRno() db not connected");
		}
		return s;
	}
	public static void main(String[] args) 
	{
		StudentDao studentDao = new StudentDao();

		StudentBean s = studentDao.getStudentByRno(15);
		
		System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		
		/*			
		ArrayList<StudentBean> list = studentDao.getAllStudentRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		Scanner sc  = new Scanner(System.in);
		
		//-------------UPDATE Student------------------------------

		System.out.println("Enter Rno which you want to update student record : ");
		int rno= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks= sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		int rowsAffected = studentDao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
		

		System.out.println("Enter Rno which you want to delete : ");
		int rno= sc.nextInt();

		int rowsAffected = studentDao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully deleted :' " + rowsAffected);
		} else 
		{
			System.out.println("Student record not deleted :' " + rowsAffected);
		}
//-------------INSERT Student------------------------------
	
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks= sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		int rowsAffected = studentDao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted :' " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted :' " + rowsAffected);
		}
*/		
	}
}
