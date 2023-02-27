package com.assignments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class Laptop 
{
	@Id 
	@Column(name="Laptop_ID")
	private int LID;
	
    private String Lname;
    
    @OneToOne
    @JoinColumn(name = "name")
    private Student student;
    
    // getter setter method
	public int getLID() 
	{
		return LID;
	}
	public void setLID(int lID)
	{
		LID = lID;
	}
	public String getLname()
	{
		return Lname;
	}
	
	public void setLname(String lname)
	{
		Lname = lname;
	}
	
	public Student getStudent()
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student = student;
	}
	
	
	
	// Generate constructor
	public Laptop(int lID, String lname, Student student)
	{
		super();
		LID = lID;
		Lname = lname;
		this.student=student;
	}
	
	// generate constructor 
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	
 
}
