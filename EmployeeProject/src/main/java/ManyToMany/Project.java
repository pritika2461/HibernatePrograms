package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{
	// Anotations
	@Id @Column(name= "Project_id")
	int P_id;
	String P_name;
	
	@ManyToMany (mappedBy="project")
	private List<Employee> employee;
	
	// setter and setter method
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	
	public List<Employee> getEmployee()
	{
		return employee;
	}
	
	public void setEmployee(List<Employee> employee)
	{
		this.employee = employee;
	}
	
	// creating constructor
	public Project(int p_id, String p_name, List<Employee> employee) {
		super();
		P_id = p_id;
		P_name = p_name;
		this.employee = employee;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
