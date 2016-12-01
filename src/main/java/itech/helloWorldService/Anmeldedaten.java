package itech.helloWorldService;

import javax.ws.rs.FormParam;

public class Anmeldedaten {
	private String firma;
	private String strasse;
	private String hausnr;
	private String plz;
	private String ort;
	private String telefon;
	private String telefax;
	private String vorname;
	private String name;
	private String email;
	private String nachnameAzubi;
	private String vornameAzubi;
	private String geburtsdatumAzubi;
	private String geburtsortAzubi;
	private String staatsangehoerigkeitAzubi;
	private String geburtslandAzubi;
	private String strasseAzubi;
	private String hausnrAzubi;
	private String plzAzubi;
	private String ortAzubi;
	private String bundeslandAzubi;
	private String telefonAzubi;
	private String mobilAzubi;
	private String emailAzubi;
	private String nachnameErziehungsberechtigte;
	private String vornameErziehungsberechtigte;
	private String strasseErziehungsberechtigte;
	private String hausnrErziehungsberechtigte;
	private String plzErziehungsberechtigte;
	private String ortErziehungsberechtigte;
	private String telefonErziehungsberechtigte;
	private String emailErziehungsberechtigte;
	private String schulnameBildungsweg;
	private String bundeslandBildungsweg;
	private String entlassungsjahrbBldungsweg;
	private String hoechsterabschlussBildungsweg;
	private String schulbesuchsjahrBildungsweg;
	private String fachrichtungAusbildung;
	private String ausbildungszeitVomAusbildung;
	private String ausbildungszeitBisAusbildung;
	private String begruendungAusbildung;

	
	public Anmeldedaten(

			String firma, String strasse, String hausnr, String plz, String ort, String telefon, String telefax,
			String vorname, String name, String email, String nachname_azubi, String vorname_azubi,
			String geburtsdatum_azubi, String geburtsort_azubi, String staatsangehoerigkeit_azubi,
			String geburtsland_azubi, String strasse_azubi, String hausnr_azubi, String plz_azubi, String ort_azubi,
			String bundesland_azubi, String telefon_azubi, String mobil_azubi, String email_azubi,
			String nachname_erziehungsberechtigte, String vorname_erziehungsberechtigte,
			String strasse_erziehungsberechtigte, String hausnr_erziehungsberechtigte, String plz_erziehungsberechtigte,
			String ort_erziehungsberechtigte, String telefon_erziehungsberechtigte, String email_erziehungsberechtigte,
			String schulname_bildungsweg, String bundesland_bildungsweg, String entlassungsjahr_bildungsweg,
			String hoechsterabschluss_bildungsweg, String schulbesuchsjahr_bildungsweg, String fachrichtung_ausbildung,
			String ausbildungszeit_vom_ausbildung, String ausbildungszeit_bis_ausbildung,
			String begruendung_ausbildung) {
		this.setFirma(firma);
		this.setStrasse(strasse);
		this.setHausnr(hausnr);
		this.setPlz(plz);
		this.setOrt(ort);
		this.setTelefon(telefon);
		this.setTelefax(telefax);
		this.setVorname(vorname);
		this.setName(name);
		this.setEmail(email);
		this.setNachnameAzubi(nachname_azubi);
		this.setVornameAzubi(vorname_azubi);
		this.setGeburtsdatumAzubi(geburtsdatum_azubi);
		this.setGeburtsortAzubi(geburtsort_azubi);
		this.setStaatsangehoerigkeitAzubi(staatsangehoerigkeit_azubi);
		this.setGeburtslandAzubi(geburtsland_azubi);
		this.setStrasseAzubi(strasse_azubi);
		this.setPlzAzubi(plz_azubi);
		this.setOrtAzubi(ort_azubi);
		this.setBundeslandAzubi(bundesland_azubi);
		this.setTelefonAzubi(telefon_azubi);
		this.setMobilAzubi(mobil_azubi);
		this.setEmailAzubi(email_azubi);
		this.setNachnameErziehungsberechtigte(nachname_erziehungsberechtigte);
		this.setVornameErziehungsberechtigte(vorname_erziehungsberechtigte);
		this.setStrasseErziehungsberechtigte(strasseErziehungsberechtigte);
		this.setHausnrErziehungsberechtigte(hausnr_erziehungsberechtigte);
		this.setPlzErziehungsberechtigte(plz_erziehungsberechtigte);
		this.setOrtErziehungsberechtigte(ort_erziehungsberechtigte);
		this.setTelefonErziehungsberechtigte(telefon_erziehungsberechtigte);
		this.setEmailErziehungsberechtigte(email_erziehungsberechtigte);
		this.setSchulnameBildungsweg(schulname_bildungsweg);
		this.setBundeslandBildungsweg(bundesland_bildungsweg);
		this.setEntlassungsjahrbBldungsweg(entlassungsjahr_bildungsweg);
		this.setHoechsterabschlussBildungsweg(hoechsterabschluss_bildungsweg);
		this.setSchulbesuchsjahrBildungsweg(schulbesuchsjahr_bildungsweg);
		this.setFachrichtungAusbildung(fachrichtung_ausbildung);
		this.setAusbildungszeitVomAusbildung(ausbildungszeit_vom_ausbildung);
		this.setAusbildungszeitBisAusbildung(ausbildungszeit_bis_ausbildung);
		this.setBegruendungAusbildung(begruendung_ausbildung);

	}

	private String getFirma() {
		return firma;
	}

	private void setFirma(String firma) {
		this.firma = firma;
	}

	private String getStrasse() {
		return strasse;
	}

	private void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	private String getHausnr() {
		return hausnr;
	}

	private void setHausnr(String hausnr) {
		this.hausnr = hausnr;
	}

	private String getPlz() {
		return plz;
	}

	private void setPlz(String plz) {
		this.plz = plz;
	}

	private String getOrt() {
		return ort;
	}

	private void setOrt(String ort) {
		this.ort = ort;
	}

	private String getTelefon() {
		return telefon;
	}

	private void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	private String getTelefax() {
		return telefax;
	}

	private void setTelefax(String telefax) {
		this.telefax = telefax;
	}

	private String getVorname() {
		return vorname;
	}

	private void setVorname(String vorname) {
		this.vorname = vorname;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private String getNachnameAzubi() {
		return nachnameAzubi;
	}

	private void setNachnameAzubi(String nachnameAzubi) {
		this.nachnameAzubi = nachnameAzubi;
	}

	private String getVornameAzubi() {
		return vornameAzubi;
	}

	private void setVornameAzubi(String vornameAzubi) {
		this.vornameAzubi = vornameAzubi;
	}

	private String getGeburtsdatumAzubi() {
		return geburtsdatumAzubi;
	}

	private void setGeburtsdatumAzubi(String geburtsdatumAzubi) {
		this.geburtsdatumAzubi = geburtsdatumAzubi;
	}

	private String getGeburtsortAzubi() {
		return geburtsortAzubi;
	}

	private void setGeburtsortAzubi(String geburtsortAzubi) {
		this.geburtsortAzubi = geburtsortAzubi;
	}

	private String getStaatsangehoerigkeitAzubi() {
		return staatsangehoerigkeitAzubi;
	}

	private void setStaatsangehoerigkeitAzubi(String staatsangehoerigkeitAzubi) {
		this.staatsangehoerigkeitAzubi = staatsangehoerigkeitAzubi;
	}

	private String getStrasseAzubi() {
		return strasseAzubi;
	}

	private void setStrasseAzubi(String strasseAzubi) {
		this.strasseAzubi = strasseAzubi;
	}

	private String getHausnrAzubi() {
		return hausnrAzubi;
	}

	private void setHausnrAzubi(String hausnrAzubi) {
		this.hausnrAzubi = hausnrAzubi;
	}

	private String getPlzAzubi() {
		return plzAzubi;
	}

	private void setPlzAzubi(String plzAzubi) {
		this.plzAzubi = plzAzubi;
	}

	private String getOrtAzubi() {
		return ortAzubi;
	}

	private void setOrtAzubi(String ortAzubi) {
		this.ortAzubi = ortAzubi;
	}

	private String getBundeslandAzubi() {
		return bundeslandAzubi;
	}

	private void setBundeslandAzubi(String bundeslandAzubi) {
		this.bundeslandAzubi = bundeslandAzubi;
	}

	private String getTelefonAzubi() {
		return telefonAzubi;
	}

	private void setTelefonAzubi(String telefonAzubi) {
		this.telefonAzubi = telefonAzubi;
	}

	private String getMobilAzubi() {
		return mobilAzubi;
	}

	private void setMobilAzubi(String mobilAzubi) {
		this.mobilAzubi = mobilAzubi;
	}

	private String getEmailAzubi() {
		return emailAzubi;
	}

	private void setEmailAzubi(String emailAzubi) {
		this.emailAzubi = emailAzubi;
	}

	private String getNachnameErziehungsberechtigte() {
		return nachnameErziehungsberechtigte;
	}

	private void setNachnameErziehungsberechtigte(String nachnameErziehungsberechtigte) {
		this.nachnameErziehungsberechtigte = nachnameErziehungsberechtigte;
	}

	private String getVornameErziehungsberechtigte() {
		return vornameErziehungsberechtigte;
	}

	private void setVornameErziehungsberechtigte(String vornameErziehungsberechtigte) {
		this.vornameErziehungsberechtigte = vornameErziehungsberechtigte;
	}

	private String getStrasseErziehungsberechtigte() {
		return strasseErziehungsberechtigte;
	}

	private void setStrasseErziehungsberechtigte(String strasseErziehungsberechtigte) {
		this.strasseErziehungsberechtigte = strasseErziehungsberechtigte;
	}

	private String getHausnrErziehungsberechtigte() {
		return hausnrErziehungsberechtigte;
	}

	private void setHausnrErziehungsberechtigte(String hausnrErziehungsberechtigte) {
		this.hausnrErziehungsberechtigte = hausnrErziehungsberechtigte;
	}

	private String getPlzErziehungsberechtigte() {
		return plzErziehungsberechtigte;
	}

	private void setPlzErziehungsberechtigte(String plzErziehungsberechtigte) {
		this.plzErziehungsberechtigte = plzErziehungsberechtigte;
	}

	private String getOrtErziehungsberechtigte() {
		return ortErziehungsberechtigte;
	}

	private void setOrtErziehungsberechtigte(String ortErziehungsberechtigte) {
		this.ortErziehungsberechtigte = ortErziehungsberechtigte;
	}

	private String getTelefonErziehungsberechtigte() {
		return telefonErziehungsberechtigte;
	}

	private void setTelefonErziehungsberechtigte(String telefonErziehungsberechtigte) {
		this.telefonErziehungsberechtigte = telefonErziehungsberechtigte;
	}

	private String getEmailErziehungsberechtigte() {
		return emailErziehungsberechtigte;
	}

	private void setEmailErziehungsberechtigte(String emailErziehungsberechtigte) {
		this.emailErziehungsberechtigte = emailErziehungsberechtigte;
	}

	private String getSchulnameBildungsweg() {
		return schulnameBildungsweg;
	}

	private void setSchulnameBildungsweg(String schulnameBildungsweg) {
		this.schulnameBildungsweg = schulnameBildungsweg;
	}

	private String getBundeslandBildungsweg() {
		return bundeslandBildungsweg;
	}

	private void setBundeslandBildungsweg(String bundeslandBildungsweg) {
		this.bundeslandBildungsweg = bundeslandBildungsweg;
	}

	private String getEntlassungsjahrbBldungsweg() {
		return entlassungsjahrbBldungsweg;
	}

	private void setEntlassungsjahrbBldungsweg(String entlassungsjahrbBldungsweg) {
		this.entlassungsjahrbBldungsweg = entlassungsjahrbBldungsweg;
	}

	private String getHoechsterabschlussBildungsweg() {
		return hoechsterabschlussBildungsweg;
	}

	private void setHoechsterabschlussBildungsweg(String hoechsterabschlussBildungsweg) {
		this.hoechsterabschlussBildungsweg = hoechsterabschlussBildungsweg;
	}

	private String getSchulbesuchsjahrBildungsweg() {
		return schulbesuchsjahrBildungsweg;
	}

	private void setSchulbesuchsjahrBildungsweg(String schulbesuchsjahrBildungsweg) {
		this.schulbesuchsjahrBildungsweg = schulbesuchsjahrBildungsweg;
	}

	private String getFachrichtungAusbildung() {
		return fachrichtungAusbildung;
	}

	private void setFachrichtungAusbildung(String fachrichtungAusbildung) {
		this.fachrichtungAusbildung = fachrichtungAusbildung;
	}

	private String getAusbildungszeitVomAusbildung() {
		return ausbildungszeitVomAusbildung;
	}

	private void setAusbildungszeitVomAusbildung(String ausbildungszeitVomAusbildung) {
		this.ausbildungszeitVomAusbildung = ausbildungszeitVomAusbildung;
	}

	private String getAusbildungszeitBisAusbildung() {
		return ausbildungszeitBisAusbildung;
	}

	private void setAusbildungszeitBisAusbildung(String ausbildungszeitBisAusbildung) {
		this.ausbildungszeitBisAusbildung = ausbildungszeitBisAusbildung;
	}

	private String getBegruendungAusbildung() {
		return begruendungAusbildung;
	}

	private void setBegruendungAusbildung(String begruendungAusbildung) {
		this.begruendungAusbildung = begruendungAusbildung;
	}

	private String getGeburtslandAzubi() {
		return geburtslandAzubi;
	}

	private void setGeburtslandAzubi(String geburtslandAzubi) {
		this.geburtslandAzubi = geburtslandAzubi;
	}

}
