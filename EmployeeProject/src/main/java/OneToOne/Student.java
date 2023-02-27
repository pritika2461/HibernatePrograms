package com.assignments;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class Student 
{
	@Id
	@Column(name="Student_Id")
	
     private int id;
     private String name;
     
 	@OneToOne
 	@JoinColumn(name ="LID")
 	private Laptop laptop;
 	
 	// Getter and setter methods
 	
	 public int getId()
	 {
		return id;
   	 }
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public  Laptop getLaptop()
	{
	    return laptop;	
	}
	
	public void setLaptop(Laptop laptop)
	{
		this.laptop = laptop;
	}
	
	
	// constructor
	public Student(int id, String name,Laptop laptop) 
	{
		super();
		this.id = id;
		this.name = name;
		this.laptop=laptop;
	}
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
     
}  
