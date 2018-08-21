package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;

public class QueryEmployeeDemo {

	public static void main(String[] args) {
		
		// create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query employees
			List<Employee> theEmployees = session.createQuery("from Employee").getResultList();
			
			// display the students
			displayEmployees(theEmployees);
			
			// query more
			theEmployees = session.createQuery("from Employee s where s.company='SB nation'").getResultList();
			displayEmployees(theEmployees);
			
			// new code to update
			
			// get object
			Employee myEmploy = session.get(Employee.class, 3);
			myEmploy.setCompany("Fucking stupid SB");
			
			// new code to delete
		 	session.createQuery("delete Employee s where s.company='Fucking stupid SB'").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("query done!");
		}finally {
			factory.close();
		}
		
		
	}

	private static void displayEmployees(List<Employee> theEmployees) {
		for (Employee tempEmployee : theEmployees) {
			System.out.println(tempEmployee);
		}
	}

}
