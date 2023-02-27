package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args)
	{
		// Creating the configration object
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	// Build session factory
    	SessionFactory factory=cfg.buildSessionFactory();
	    	
	    	// creating object of employee class
	    	Employee e1 = new Employee();
	    	e1.setEmp_id(101);
	    	e1.setEmp_name("Pritika");
	    	e1.setEmp_dept("Computer");
	    	
	    	Employee e2 = new Employee();
	    	e2.setEmp_id(102);
	    	e2.setEmp_name("Priti");
	    	e2.setEmp_dept("Account");
	    	
	    	Employee e3 = new Employee();
	    	e3.setEmp_id(103);
	    	e3.setEmp_name("Priya");
	    	e3.setEmp_dept("Civil");
	    	
	    	// creating object of Project class
	    	Project p1=new Project();
	    	p1.setP_id(11);
	    	p1.setP_name("Healthcare");
	    	
	    	Project p2=new Project();
	    	p2.setP_id(12);
	    	p2.setP_name("IOT");
	    	
	    	Project p3=new Project();
	    	p3.setP_id(13);
	    	p3.setP_name("ML");
	    	
	    	// Creating list of project and employee
	    	List<Project> pr1=new ArrayList<Project>();
	    	List<Employee> emp1=new ArrayList<Employee>();
	    	
	    	pr1.add(p1);
	        pr1.add(p2);
	    	pr1.add(p3);
	    	e1.setProject(pr1);
	   
	    	emp1.add(e1);
	    	emp1.add(e2);
	    	emp1.add(e3);
	    	p1.setEmployee(emp1);
	    	
	    	
	    	// setting the course with student
	        Session session=factory.openSession();
	        
	        //begin the transaction
	        Transaction tx=session.beginTransaction();
	        
	        // saving the transaction
	        session.save(e1);
	        session.save(e2);
	        session.save(p1);
	        session.save(e3);
	        session.save(p2);
	        session.save(p3);
	        
	        tx.commit();
	        session.close();
	        factory.close();

	}

}
