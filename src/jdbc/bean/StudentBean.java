package jdbc.bean;

// Pure Java Class
//  |
// POJO - Plain Old Java Object---Data Collection --->Data Container

// pure encapsulation 1) Dm's--private , 2) Mf's public

public class StudentBean
{
	private int rno,std ,marks;
	private String name    ;
	

	public StudentBean() 
	{
	}
	public StudentBean(int rno, String name,int std, int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	
	// getter and setters
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
