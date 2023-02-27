package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args) 
	{
		// creating configuration object
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	// Build the session factory
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	// create object of department
    	Department d1 = new Department();
    	d1.setDept_Id(101);
    	d1.setDept_Name("Computer");
    	
    	// create object of employee
    	Employee e1 = new Employee();
    	e1.setEmp_Id(111);
    	e1.setEmp_Name("Pritika");
    	e1.setDepartment(d1);
    	
    	Employee e2 = new Employee();
    	e2.setEmp_Id(112);
    	e2.setEmp_Name("Shraddha");
    	e2.setDepartment(d1);

    	
    	
    	Employee e3 = new Employee();
    	e3.setEmp_Id(113);
    	e3.setEmp_Name("Sharda");
    	e2.setDepartment(d1);

    	// creating the list of employee
    	List<Employee> list = new ArrayList<Employee>();
    	list.add(e1);
    	list.add(e2);
    	list.add(e3);
    	
    	// setting employee with the department
    	d1.setEmployee(list);
    	
       // open the session
    	Session session = factory.openSession();
    	
    	// begin transaction
    	Transaction tx = session.beginTransaction();
    	
    	// saving the entity object
    	session.save(d1);
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	
    	// Committing the transaction
    	tx.commit();
    	
    	// closing the session and factory
    	session.close();
    	factory.close();
	}

}
