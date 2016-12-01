package com.hibernate.demo.entity;

public class Main {

	public static void main(String[] args) {

		DbHandler db = new DbHandler();
		
		//db.createBenutzer("Hermes", "N", "54321", "hermes@herm.de");
		db.getBenutzer();
		for (Benutzer tempBenutzer : db.benutzerList){
			System.out.println(tempBenutzer);
		}
		
		//db.createSchueler(1, new JSONObject(), "N");
		
		// db.updateBesteatigtStatus(1, "J");
		
		//db.deleteSchueler(3);
	}

}
