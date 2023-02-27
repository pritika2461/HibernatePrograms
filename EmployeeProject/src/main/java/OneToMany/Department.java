package OneToMany;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Department 
{
	@Id 
   private int Dept_Id;
   private String Dept_Name;
   
   // Annotations used for mapping
   @OneToMany 
   private List<Employee> employee;
   
   // creating getter and setter method
   public int getDept_Id() 
   {
		return Dept_Id;
	}
   
   
	public void setDept_Id(int dept_Id) 
	{
		Dept_Id = dept_Id;
	}
	
	
	public String getDept_Name() 
	{
		return Dept_Name;
	}
	
	public void setDept_Name(String dept_Name) 
	{
		Dept_Name = dept_Name;
	}
	
	public List<Employee> getEmployee()
	{
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	// creating constructor
	
	public Department(int dept_Id, String dept_Name, List<Employee> employee)
	{
		super();
		Dept_Id = dept_Id;
		Dept_Name = dept_Name;
		this.employee= employee;
	}
	public Department() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	   

   
}
