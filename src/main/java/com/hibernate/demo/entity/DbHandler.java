package com.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbHandler {

	SessionFactory factory;
	Session session;
	public List<Benutzer> benutzerList;
	public List<Schueler> schuelerList;

	// Creates the factory
	void createSessionFactory() {
		this.factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Benutzer.class)
				.addAnnotatedClass(Schueler.class).buildSessionFactory();
	}

	// Creates the session
	void createSession() {
		if (factory != null) {
			this.session = factory.getCurrentSession();
		} else {
			System.out.println("There was no factory found to create a session.");
		}
	}

	// Closes the session.
	void closeSession() {
		if (factory != null) {
			this.factory.close();
		} else {
			System.out.println("No session to close was found.");
		}
	}

	// Creates a Benutzer.
	public void createBenutzer(String name, String istAdmin, String passwort, String email) {
		createSessionFactory();
		createSession();
		try {
			System.out.println("Creating new Benutzer object...");
			Benutzer tempBenutzer = new Benutzer(name, istAdmin, passwort, email);

			// start a transaction
			session.beginTransaction();

			// save the Benutzer object
			System.out.println("Saving the Benutzer...");
			session.save(tempBenutzer);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
	}

	// Creates a Schueler.
	public void createSchueler(int institutionsid, String formulardaten, String besteatigt) {
		createSessionFactory();
		createSession();
		try {
			System.out.println("Creating new Schueler object...");
			Schueler tempSchueler = new Schueler(institutionsid, formulardaten, besteatigt);

			// start a transaction
			session.beginTransaction();

			// save the Schueler object
			System.out.println("Saving the Schueler...");
			session.save(tempSchueler);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
	}

	// Retrieves a list of all Benutzers.
	public List<Benutzer> getBenutzer() {
		createSessionFactory();
		createSession();
		try {
			// start a transaction
			session.beginTransaction();

			// fill list with Benutzers
			benutzerList = session.createQuery("from Benutzer").list();

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
		return benutzerList;
	}

	// Retrieves a list of all Schuelers.
	public List<Schueler> getSchueler() {
		createSessionFactory();
		createSession();
		try {
			// start a transaction
			session.beginTransaction();

			// fill list with Benutzers
			schuelerList = session.createQuery("from Schueler").list();

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
		return schuelerList;
	}
	
	// Retrieves a specific Schueler.
	public Schueler getSchueler(int id) {
		createSessionFactory();
		createSession();
		List<Schueler> schueler = null;
		try {
			// start a transaction
			session.beginTransaction();

			// fill list with Schuelers
			schueler = session.createQuery("from Schueler where idschueler = "+id).list();

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
		if(null != schueler && schueler.size() == 1)
			return schueler.get(0);
		return null;
	}

	// Update existing status of a Schueler.
	public void updateBesteatigtStatus(int schuelerId, String status) {
		createSessionFactory();
		createSession();
		int id = schuelerId;
		String statusNeu = status;
		try {
			// start a transaction
			session.beginTransaction();

			Schueler tempSchueler = (Schueler) session.get(Schueler.class, id);

			tempSchueler.setBestaetigt(statusNeu);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
	}

	// Update existing formula data of a Schueler.
	public void updateFormulardaten(int schuelerId, String daten) {
		createSessionFactory();
		createSession();
		int id = schuelerId;
		String datenNeu = daten;
		try {
			// start a transaction
			session.beginTransaction();

			Schueler tempSchueler = (Schueler) session.get(Schueler.class, id);

			tempSchueler.setFormuldardaten(datenNeu);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
	}

	// Delete existing Schueler.
	public void deleteSchueler(int schuelerId) {
		createSessionFactory();
		createSession();
		int id = schuelerId;
		try {
			// start a transaction
			session.beginTransaction();

			Schueler tempSchueler = (Schueler) session.get(Schueler.class, id);

			session.delete(tempSchueler);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
	}

	// Delete existing Benutzer.
	void deleteBenutzer(int benutzerId) {
		createSessionFactory();
		createSession();
		int id = benutzerId;
		try {
			// start a transaction
			session.beginTransaction();

			Benutzer tempBenutzer = (Benutzer) session.get(Benutzer.class, id);

			session.delete(tempBenutzer);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession();
		}
	}
}
