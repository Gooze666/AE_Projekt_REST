package com.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Benutzer.class)
				.addAnnotatedClass(Schueler.class)
				.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a student object
			// System.out.println("Creating new student object...");
			// Student tempStudent = new Student("Paul", "Wall", "paul@hib.com");
			
			System.out.println("Creating new Benutzer object...");
			Benutzer tempBenutzer = new Benutzer("Karstadt", "N", "12345", "N");

			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the Benutzer...");
			session.save(tempBenutzer);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} catch (Exception ex){
			ex.printStackTrace();
		}
		finally {
			factory.close();
		}
	}
}
