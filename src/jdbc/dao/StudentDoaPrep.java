package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// PreparedStatement
public class StudentDoaPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES(?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDoaPrep---insertStudent() Db not connected.");
		}
		return rowsAffected;
	}
	public void updateStudent() 
	{

	}
	// delete sql query
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = ?";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery); 
			
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep--deletSttudent() db not connected");
		} 
		return rowsAffected;
	}
	// select sql query
	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		String selectQuery = "SELECT rno, name, std, marks  from student";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean sbean = null;
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				rs = pstmt.executeQuery();
				while(rs.next()) 
				{
					int rno = rs.getInt(1);// rs.getInt("rno");
					String name = rs.getString(2);// rs.getString("name");
					int std = rs.getInt(3);// rs.getInt("std");
					int marks = rs.getInt(4);// rs.getInt("marks");
				
					sbean =  new StudentBean(rno, name, std, marks);
					list.add(sbean);
//						System.out.println(rno+" " + name+" " + std+" " + marks); 
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
	public static void main(String[] args) 
	{
		StudentDoaPrep dao = new StudentDoaPrep();

		ArrayList<StudentBean> list = dao.getAllStudentRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s =	list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
/*		System.out.println("Enter Name : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno which you want to Delete student record : ");
		int rno = sc.nextInt();
		
		StudentDoaPrep dao = new StudentDoaPrep();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccessfully Deleted");
		} else 
		{
			System.out.println("Student record not Deleted");
		}
		
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDoaPrep dao = new StudentDoaPrep();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record suuccessfully Inserted");
		} else 
		{
			System.out.println("Student record not Inserted");
		}
		*/
	}
}
