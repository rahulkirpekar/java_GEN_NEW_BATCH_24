package oops.inhtopic.mli.task1;

public class SeniorManager extends Manager
{
	int teamSize;

	public SeniorManager(int id,String name,String department,int teamSize) 
	{
		this.id=id;
		this.name=name;
		this.department = department;
		this.teamSize=teamSize;
	}
	public void strategize() 
	{
		System.out.println(name + " is strategizing for a team of " + teamSize + " members.");
	}
}