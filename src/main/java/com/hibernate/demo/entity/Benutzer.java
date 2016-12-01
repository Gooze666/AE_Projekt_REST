package com.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "benutzer")
public class Benutzer {

	@Id
	@Column(name = "institution_id")
	private int institution_id;

	@Column(name = "institutionsname")
	private String institutionsname;

	@Column(name = "ist_admin")
	private String ist_admin;

	
	@Column(name = "passwort")
	private String passwort;

	@Column(name = "email")
	private String email;

	public Benutzer() {

	}

	public Benutzer(String institutionsname, String ist_admin, String passwort, String email) {
		this.institutionsname = institutionsname;
		this.ist_admin = ist_admin;
		this.passwort = passwort;
		this.email = email;
	}

	public int getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(int institution_id) {
		this.institution_id = institution_id;
	}

	public String getInstitutionsname() {
		return institutionsname;
	}

	public void setInstitutionsname(String institutionsname) {
		this.institutionsname = institutionsname;
	}

	public String getIst_admin() {
		return ist_admin;
	}

	public void setIst_admin(String ist_admin) {
		this.ist_admin = ist_admin;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Benutzer [institution_id=" + institution_id + ", institutionsname=" + institutionsname + ", ist_admin="
				+ ist_admin + ", passwort=" + passwort + ", email=" + email + "]";
	}
}
