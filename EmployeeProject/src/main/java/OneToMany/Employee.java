package OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class Employee 
{
	@Id @Column(name = "E_Id")
    private int Emp_Id;
    private String Emp_Name;
	
	
	@ManyToOne @JoinColumn(name="dept_Id")
	
	// create object of department table
	private Department  department;
   
	// getter and setter method

	public int getEmp_Id() {
		return Emp_Id;
	}


	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}


	public String getEmp_Name() {
		return Emp_Name;
	}


	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
  
	// crating constructor from getter and setter method

	public Employee(int emp_Id, String emp_Name, Department department) {
		super();
		Emp_Id = emp_Id;
		Emp_Name = emp_Name;
		this.department = department;
	}
	
	public Employee()
	{
		super();
	}
	
    
    
}
