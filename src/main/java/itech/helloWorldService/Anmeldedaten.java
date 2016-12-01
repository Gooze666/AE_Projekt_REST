package itech.helloWorldService;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MultivaluedMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	public Anmeldedaten(MultivaluedMap<String,String> formParams)
	{
		setFirma(formParams.getFirst("firma"));
		setStrasse(formParams.getFirst("strasse"));
		setHausnr(formParams.getFirst("hausnr"));
		setPlz(formParams.getFirst("plz"));
		setOrt(formParams.getFirst("ort"));
		setTelefon(formParams.getFirst("telefon"));
		setTelefax(formParams.getFirst("telefax"));
		setVorname(formParams.getFirst("vorname"));
		setName(formParams.getFirst("name"));
		setEmail(formParams.getFirst("email"));
		setNachnameAzubi(formParams.getFirst("nachname_azubi"));
		setVornameAzubi(formParams.getFirst("vorname_azubi"));
		setGeburtsdatumAzubi(formParams.getFirst("geburtsdatum_azubi"));
		setGeburtsortAzubi(formParams.getFirst("geburtsort_azubi"));
		setStaatsangehoerigkeitAzubi(formParams.getFirst("staatsangehoerigkeit_azubi"));
		setGeburtslandAzubi(formParams.getFirst("geburtsland_azubi"));
		setStrasseAzubi(formParams.getFirst("strasse_azubi"));
		setPlzAzubi(formParams.getFirst("plz_azubi"));
		setOrtAzubi(formParams.getFirst("ort_azubi"));
		setBundeslandAzubi(formParams.getFirst("bundesland_azubi"));
		setTelefonAzubi(formParams.getFirst("telefon_azubi"));
		setMobilAzubi(formParams.getFirst("mobil_azubi"));
		setEmailAzubi(formParams.getFirst("email_azubi"));
		setNachnameErziehungsberechtigte(formParams.getFirst("nachname_erziehungsberechtigte"));
		setVornameErziehungsberechtigte(formParams.getFirst("vorname_erziehungsberechtigte"));
		setStrasseErziehungsberechtigte(formParams.getFirst("strasseErziehungsberechtigte"));
		setHausnrErziehungsberechtigte(formParams.getFirst("hausnr_erziehungsberechtigte"));
		setPlzErziehungsberechtigte(formParams.getFirst("plz_erziehungsberechtigte"));
		setOrtErziehungsberechtigte(formParams.getFirst("ort_erziehungsberechtigte"));
		setTelefonErziehungsberechtigte(formParams.getFirst("telefon_erziehungsberechtigte"));
		setEmailErziehungsberechtigte(formParams.getFirst("email_erziehungsberechtigte"));
		setSchulnameBildungsweg(formParams.getFirst("schulname_bildungsweg"));
		setBundeslandBildungsweg(formParams.getFirst("bundesland_bildungsweg"));
		setEntlassungsjahrbBldungsweg(formParams.getFirst("entlassungsjahr_bildungsweg"));
		setHoechsterabschlussBildungsweg(formParams.getFirst("hoechsterabschluss_bildungsweg"));
		setSchulbesuchsjahrBildungsweg(formParams.getFirst("schulbesuchsjahr_bildungsweg"));
		setFachrichtungAusbildung(formParams.getFirst("fachrichtung_ausbildung"));
		setAusbildungszeitVomAusbildung(formParams.getFirst("ausbildungszeit_vom_ausbildung"));
		setAusbildungszeitBisAusbildung(formParams.getFirst("ausbildungszeit_bis_ausbildung"));
		setBegruendungAusbildung(formParams.getFirst("begruendung_ausbildung"));
	}

	public String getFirma() {
		return firma;
	}

	private void setFirma(String firma) {
		this.firma = firma;
	}

	public String getStrasse() {
		return strasse;
	}

	private void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnr() {
		return hausnr;
	}

	private void setHausnr(String hausnr) {
		this.hausnr = hausnr;
	}

	public String getPlz() {
		return plz;
	}

	private void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	private void setOrt(String ort) {
		this.ort = ort;
	}

	public String getTelefon() {
		return telefon;
	}

	private void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getTelefax() {
		return telefax;
	}

	private void setTelefax(String telefax) {
		this.telefax = telefax;
	}

	public String getVorname() {
		return vorname;
	}

	private void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public String getNachnameAzubi() {
		return nachnameAzubi;
	}

	private void setNachnameAzubi(String nachnameAzubi) {
		this.nachnameAzubi = nachnameAzubi;
	}

	public String getVornameAzubi() {
		return vornameAzubi;
	}

	private void setVornameAzubi(String vornameAzubi) {
		this.vornameAzubi = vornameAzubi;
	}

	public String getGeburtsdatumAzubi() {
		return geburtsdatumAzubi;
	}

	private void setGeburtsdatumAzubi(String geburtsdatumAzubi) {
		this.geburtsdatumAzubi = geburtsdatumAzubi;
	}

	public String getGeburtsortAzubi() {
		return geburtsortAzubi;
	}

	private void setGeburtsortAzubi(String geburtsortAzubi) {
		this.geburtsortAzubi = geburtsortAzubi;
	}

	public String getStaatsangehoerigkeitAzubi() {
		return staatsangehoerigkeitAzubi;
	}

	private void setStaatsangehoerigkeitAzubi(String staatsangehoerigkeitAzubi) {
		this.staatsangehoerigkeitAzubi = staatsangehoerigkeitAzubi;
	}

	public String getStrasseAzubi() {
		return strasseAzubi;
	}

	private void setStrasseAzubi(String strasseAzubi) {
		this.strasseAzubi = strasseAzubi;
	}

	public String getHausnrAzubi() {
		return hausnrAzubi;
	}

	private void setHausnrAzubi(String hausnrAzubi) {
		this.hausnrAzubi = hausnrAzubi;
	}

	public String getPlzAzubi() {
		return plzAzubi;
	}

	private void setPlzAzubi(String plzAzubi) {
		this.plzAzubi = plzAzubi;
	}

	public String getOrtAzubi() {
		return ortAzubi;
	}

	private void setOrtAzubi(String ortAzubi) {
		this.ortAzubi = ortAzubi;
	}

	public String getBundeslandAzubi() {
		return bundeslandAzubi;
	}

	private void setBundeslandAzubi(String bundeslandAzubi) {
		this.bundeslandAzubi = bundeslandAzubi;
	}

	public String getTelefonAzubi() {
		return telefonAzubi;
	}

	private void setTelefonAzubi(String telefonAzubi) {
		this.telefonAzubi = telefonAzubi;
	}

	public String getMobilAzubi() {
		return mobilAzubi;
	}

	private void setMobilAzubi(String mobilAzubi) {
		this.mobilAzubi = mobilAzubi;
	}

	public String getEmailAzubi() {
		return emailAzubi;
	}

	private void setEmailAzubi(String emailAzubi) {
		this.emailAzubi = emailAzubi;
	}

	public String getNachnameErziehungsberechtigte() {
		return nachnameErziehungsberechtigte;
	}

	private void setNachnameErziehungsberechtigte(String nachnameErziehungsberechtigte) {
		this.nachnameErziehungsberechtigte = nachnameErziehungsberechtigte;
	}

	public String getVornameErziehungsberechtigte() {
		return vornameErziehungsberechtigte;
	}

	private void setVornameErziehungsberechtigte(String vornameErziehungsberechtigte) {
		this.vornameErziehungsberechtigte = vornameErziehungsberechtigte;
	}

	public String getStrasseErziehungsberechtigte() {
		return strasseErziehungsberechtigte;
	}

	private void setStrasseErziehungsberechtigte(String strasseErziehungsberechtigte) {
		this.strasseErziehungsberechtigte = strasseErziehungsberechtigte;
	}

	public String getHausnrErziehungsberechtigte() {
		return hausnrErziehungsberechtigte;
	}

	private void setHausnrErziehungsberechtigte(String hausnrErziehungsberechtigte) {
		this.hausnrErziehungsberechtigte = hausnrErziehungsberechtigte;
	}

	public String getPlzErziehungsberechtigte() {
		return plzErziehungsberechtigte;
	}

	private void setPlzErziehungsberechtigte(String plzErziehungsberechtigte) {
		this.plzErziehungsberechtigte = plzErziehungsberechtigte;
	}

	public String getOrtErziehungsberechtigte() {
		return ortErziehungsberechtigte;
	}

	private void setOrtErziehungsberechtigte(String ortErziehungsberechtigte) {
		this.ortErziehungsberechtigte = ortErziehungsberechtigte;
	}

	public String getTelefonErziehungsberechtigte() {
		return telefonErziehungsberechtigte;
	}

	private void setTelefonErziehungsberechtigte(String telefonErziehungsberechtigte) {
		this.telefonErziehungsberechtigte = telefonErziehungsberechtigte;
	}

	public String getEmailErziehungsberechtigte() {
		return emailErziehungsberechtigte;
	}

	private void setEmailErziehungsberechtigte(String emailErziehungsberechtigte) {
		this.emailErziehungsberechtigte = emailErziehungsberechtigte;
	}

	public String getSchulnameBildungsweg() {
		return schulnameBildungsweg;
	}

	private void setSchulnameBildungsweg(String schulnameBildungsweg) {
		this.schulnameBildungsweg = schulnameBildungsweg;
	}

	public String getBundeslandBildungsweg() {
		return bundeslandBildungsweg;
	}

	private void setBundeslandBildungsweg(String bundeslandBildungsweg) {
		this.bundeslandBildungsweg = bundeslandBildungsweg;
	}

	public String getEntlassungsjahrbBldungsweg() {
		return entlassungsjahrbBldungsweg;
	}

	private void setEntlassungsjahrbBldungsweg(String entlassungsjahrbBldungsweg) {
		this.entlassungsjahrbBldungsweg = entlassungsjahrbBldungsweg;
	}

	public String getHoechsterabschlussBildungsweg() {
		return hoechsterabschlussBildungsweg;
	}

	private void setHoechsterabschlussBildungsweg(String hoechsterabschlussBildungsweg) {
		this.hoechsterabschlussBildungsweg = hoechsterabschlussBildungsweg;
	}

	public String getSchulbesuchsjahrBildungsweg() {
		return schulbesuchsjahrBildungsweg;
	}

	private void setSchulbesuchsjahrBildungsweg(String schulbesuchsjahrBildungsweg) {
		this.schulbesuchsjahrBildungsweg = schulbesuchsjahrBildungsweg;
	}

	public String getFachrichtungAusbildung() {
		return fachrichtungAusbildung;
	}

	private void setFachrichtungAusbildung(String fachrichtungAusbildung) {
		this.fachrichtungAusbildung = fachrichtungAusbildung;
	}

	public String getAusbildungszeitVomAusbildung() {
		return ausbildungszeitVomAusbildung;
	}

	private void setAusbildungszeitVomAusbildung(String ausbildungszeitVomAusbildung) {
		this.ausbildungszeitVomAusbildung = ausbildungszeitVomAusbildung;
	}

	public String getAusbildungszeitBisAusbildung() {
		return ausbildungszeitBisAusbildung;
	}

	private void setAusbildungszeitBisAusbildung(String ausbildungszeitBisAusbildung) {
		this.ausbildungszeitBisAusbildung = ausbildungszeitBisAusbildung;
	}

	public String getBegruendungAusbildung() {
		return begruendungAusbildung;
	}

	private void setBegruendungAusbildung(String begruendungAusbildung) {
		this.begruendungAusbildung = begruendungAusbildung;
	}

	public String getGeburtslandAzubi() {
		return geburtslandAzubi;
	}

	private void setGeburtslandAzubi(String geburtslandAzubi) {
		this.geburtslandAzubi = geburtslandAzubi;
	}
	
	public String getJSON() throws JsonProcessingException
	{
		ObjectMapper MAPPER = new ObjectMapper();
		return MAPPER.writeValueAsString(this);
	}
	
	public void fromJSON()
	{
		//todo
	}

}
