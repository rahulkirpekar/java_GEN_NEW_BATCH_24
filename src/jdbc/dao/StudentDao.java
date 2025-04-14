package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.util.DBConnection;

// StudentDao---Student Table
public class StudentDao 
{
	// insert sql query
	public int insertStudent() 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('rahul',12,80)";
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
	public void updateStudent() 
	{

	}
	// delete sql query
	public void deleteStudent() 
	{

	}
	// select sql query
	public void getAllStudentRecords() 
	{

	}
	public static void main(String[] args) 
	{
		//----------INSERT Student----------
		StudentDao studentDao = new StudentDao();
		
		
		int rowsAffected = studentDao.insertStudent();
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted :' " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted :' " + rowsAffected);
		}
	}
}
