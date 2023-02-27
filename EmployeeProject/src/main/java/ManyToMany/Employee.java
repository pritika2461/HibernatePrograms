package ManyToMany;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.*;
import javax.persistence.ManyToMany;

@Entity
public class Employee  
{
	@Id
	int Emp_id ;
	String Emp_name;
	String Emp_dept;
	
	// Mapping
	@ManyToMany @JoinTable(name= "Employee_Project_table",
			joinColumns= {@JoinColumn(name="Emp_id")},
			inverseJoinColumns= {@JoinColumn(name="P_id")})
	// (mappedBy ="Employee")
	
	// creating list 
	private List<Project> project;
	
	
	// getter and setter method
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public String getEmp_dept() {
		return Emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		Emp_dept = emp_dept;
	}
	
	public List<Project> getProject()
	{
		return project;
	}
	
	public void setProject(List<Project> project)
	{
		this.project=project;
	}
	// creating constructor
	public Employee(int emp_id, String emp_name, String emp_dept, List<Project> project) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_dept = emp_dept;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	

}
