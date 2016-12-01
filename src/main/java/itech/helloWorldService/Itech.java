package itech.helloWorldService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hibernate.demo.entity.Benutzer;
import com.hibernate.demo.entity.DbHandler;
import com.hibernate.demo.entity.Schueler;

public class Itech {

	static final String project_base = new File("").getAbsolutePath();
	
    public static String getResource(String res){
    	
    	StringBuilder sb = new StringBuilder();
    	BufferedReader r;
		try {
			r = new BufferedReader(new FileReader(project_base+"/src/main/resources/"+res));
		      
			String line = null;
			while((line=r.readLine())!=null)
			   sb.append(line);
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return sb.toString();
    }
    
    public static String checkPassword(String name, String pw)
    {
 	   DbHandler db = new DbHandler();
 	   db.getBenutzer();
 	   for(Benutzer tmp : db.benutzerList)
 	   {
 		   if(tmp.getInstitutionsname().equals(name))
 		   {
 			   if(tmp.getPasswort().equals(pw))
 			   {
 				   return tmp.getIst_admin();
 			   }
 			   else
 			   {
 				   return "";
 			   }
 		   }
 	   }
 	   return "";
    }
    
    public static String getSchuelerList(List<Schueler> liste)
    {
    	StringBuilder sb = new StringBuilder();
		for (Schueler schueler : liste)
		{
			sb.append("<br><a href=\"/itech/schueler/"
					+schueler.getIdschueler()+"\">"
					+"Name: "
					+getName(schueler.getFormuldardaten())
					+", ist bestätigt: "
					+schueler.getBestaetigt()
					+"</a>");
		}
		return "<html><body><h1>Liste der Anmeldungen:</h1>"+sb.toString()+"</body></html>";
    }
    
    private static String getName(String json)
    {
    	Anmeldedaten daten = Anmeldedaten.fromJSON(json);
    	if(daten == null)
    	{
    		return "unlesbare Daten";
    	}
    	return daten.getNachnameAzubi()+", "+daten.getVornameAzubi();
    }
    
    public static String replaceDaten(String seite, int id, Anmeldedaten daten)
    {
    	seite = seite.replaceAll("SCHUELERID", String.valueOf(id));
		seite = seite.replaceAll("BETRIEBFIRMA", daten.getFirma());
		seite = seite.replaceAll("BETRIEBSTRASSE", daten.getStrasse());
		seite = seite.replaceAll("BETRIEBHAUSNR", daten.getHausnr());
		seite = seite.replaceAll("BETRIEBPLZ", daten.getPlz());
		seite = seite.replaceAll("BETRIEBORT", daten.getOrt());
		seite = seite.replaceAll("BETRIEBTELEFON", daten.getTelefon());
		seite = seite.replaceAll("BETRIEBTELEFAX", daten.getTelefax());
		seite = seite.replaceAll("BETRIEBVORNAME", daten.getVorname());
		seite = seite.replaceAll("BETRIEBNAME", daten.getName());
		seite = seite.replaceAll("BETRIEBEMAIL", daten.getEmail());
		seite = seite.replaceAll("SCHUELERNACHNAME", daten.getNachnameAzubi());
		seite = seite.replaceAll("SCHUELERVORNAME", daten.getVornameAzubi());
		seite = seite.replaceAll("SCHUELERGEBURTSDATUM", daten.getGeburtsdatumAzubi());
		seite = seite.replaceAll("SCHUELERGEBURTSORT", daten.getGeburtsortAzubi());
		seite = seite.replaceAll("SCHUELERSTAAT", daten.getStaatsangehoerigkeitAzubi());
		seite = seite.replaceAll("SCHUELERGEBURTSLAND", daten.getGeburtslandAzubi());
		seite = seite.replaceAll("SCHUELERSTRASSE", daten.getStrasseAzubi());
		seite = seite.replaceAll("SCHUELERHAUSNR", daten.getHausnrAzubi());
		seite = seite.replaceAll("SCHUELERPLZ", daten.getPlzAzubi());
		seite = seite.replaceAll("SCHUELERORT", daten.getOrtAzubi());
		seite = seite.replaceAll("SCHUELERBUNDESLAND", daten.getBundeslandAzubi());
		seite = seite.replaceAll("SCHUELERTELEFON", daten.getTelefonAzubi());
		seite = seite.replaceAll("SCHUELERMOBIL", daten.getMobilAzubi());
		seite = seite.replaceAll("SCHUELEREMAIL", daten.getEmailAzubi());
		seite = seite.replaceAll("ERZBNACHNAME", daten.getNachnameErziehungsberechtigte());
		seite = seite.replaceAll("ERZBVORNAME", daten.getVornameErziehungsberechtigte());
		seite = seite.replaceAll("ERZBSTRASSE", daten.getStrasseErziehungsberechtigte());
		seite = seite.replaceAll("ERZBHAUSNR", daten.getHausnrErziehungsberechtigte());
		seite = seite.replaceAll("ERZBPLZ", daten.getPlzErziehungsberechtigte());
		seite = seite.replaceAll("ERZBORT", daten.getOrtErziehungsberechtigte());
		seite = seite.replaceAll("ERZBTELEFON", daten.getTelefonErziehungsberechtigte());
		seite = seite.replaceAll("ERZBEMAIL", daten.getEmailErziehungsberechtigte());
		seite = seite.replaceAll("SCHUELERSCHULEWEG", daten.getSchulnameBildungsweg());
		seite = seite.replaceAll("SCHUELERSCHULELAND", daten.getBundeslandBildungsweg());
		seite = seite.replaceAll("SCHUELERSCHULEJAHR", daten.getEntlassungsjahrbBldungsweg());
		seite = seite.replaceAll("SCHUELERSCHULEENDE", daten.getHoechsterabschlussBildungsweg());
		seite = seite.replaceAll("SCHUELERSCHULEBESUCH", daten.getSchulbesuchsjahrBildungsweg());
		seite = seite.replaceAll("SCHUELERFACH", daten.getFachrichtungAusbildung());
		seite = seite.replaceAll("SCHUELERZEIT", daten.getAusbildungszeitVomAusbildung());
		seite = seite.replaceAll("SCHUELERBISAUSBILDUNG", daten.getAusbildungszeitBisAusbildung());
		seite = seite.replaceAll("SCHUELERBEGRUENDUNG", daten.getBegruendungAusbildung());
		return seite;
    }
    
    public static String replaceEmail(Schueler schueler)
    {
    	Anmeldedaten daten = Anmeldedaten.fromJSON(schueler.getFormuldardaten());
    	String seite = getResource("email.html");
    	return seite.replaceAll("XXXXX", daten.getEmail());
    }
}