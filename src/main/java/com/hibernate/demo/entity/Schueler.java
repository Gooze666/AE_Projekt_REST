package com.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schueler")
public class Schueler {

	@Id
	@Column(name = "idschueler")
	private int idschueler;

	@Column(name = "institution_id")
	private int institution_id;

	@Column(name = "formulardaten")
	private String formuldardaten;

	@Column(name = "bestaetigt")
	private String bestaetigt;

	public Schueler() {

	}

	public Schueler(int institution_id, String formuldardaten, String bestaetigt) {
		this.institution_id = institution_id;
		this.formuldardaten = formuldardaten;
		this.bestaetigt = bestaetigt;
	}

	public int getIdschueler() {
		return idschueler;
	}

	public void setIdschueler(int idschueler) {
		this.idschueler = idschueler;
	}

	public int getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(int institution_id) {
		this.institution_id = institution_id;
	}

	public String getFormuldardaten() {
		return formuldardaten;
	}

	public void setFormuldardaten(String formuldardaten) {
		this.formuldardaten = formuldardaten;
	}

	public String getBestaetigt() {
		return bestaetigt;
	}

	public void setBestaetigt(String bestaetigt) {
		this.bestaetigt = bestaetigt;
	}
	

	@Override
	public String toString() {
		return "Schueler [idschueler=" + idschueler + ", institution_id=" + institution_id + ", formuldardaten="
				+ formuldardaten + ", besteatigt=" + bestaetigt + "]";
	}
}
