package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class CreateEmployeeDemo {

	public static void main(String[] args) {
		
		//  create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		 
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// use the session object to save Java object
			
			// create a employee object
			System.out.println("Creating new employee object...");
			Employee tempEmployee1 = new Employee("Paul", "Wall", "Washington DC");
			Employee tempEmployee2 = new Employee("Chris", "Bosh", "Miami");
			Employee tempEmployee3 = new Employee("Andy", "Chen", "SB nation");
			Employee tempEmployee4 = new Employee("Paul", "Wall", "Washington DC");
			Employee tempEmployee5 = new Employee("Paul", "Wall", "Washington DC");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the employee...");
			session.save(tempEmployee1);
			session.save(tempEmployee2);
			session.save(tempEmployee3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
