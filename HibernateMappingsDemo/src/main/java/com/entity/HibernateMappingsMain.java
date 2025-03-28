package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMappingsMain {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	    
		Department dep1 = new Department();// transient 
	    Department dep2 = new Department();
		dep1.setDepartmentName("Software");
		dep2.setDepartmentName("Civil");

		
		Employee emp2 = new Employee();
		emp2.setEmployeeName("Sneha");
        emp2.setEmployeeEmail("abc.gmail.com"); 
    	emp2.getDepartments().add(dep1);
		emp2.getDepartments().add(dep2);
		
	
	
	    s.persist(dep1);
	    s.persist(dep2);
        s.persist(emp2);
        
		t.commit();
		s.close();
		
	}

}
