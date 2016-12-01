package itech.resources;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import itech.helloWorldService.Anmeldedaten;
import itech.helloWorldService.Gender;
import itech.helloWorldService.HelloWorld;
import itech.helloWorldService.HelloWorldJsonExample;
import itech.helloWorldService.Itech;

import org.glassfish.jersey.client.JerseyClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hibernate.demo.entity.Benutzer;
import com.hibernate.demo.entity.Schueler;
import com.hibernate.demo.entity.DbHandler;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;


@Path("itech")
public class ItechResource extends JerseyClient {
	
	private Client client;
	private DbHandler db;
    public ItechResource(Client client) 
    { 
    	this.client = client;
    	db = new DbHandler();
    }

    @Path("/login")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String presentLogin() {
    	return Itech.getResource("loginscreen.html");
    }
    
   public String checkPassword(String name, String pw)
   {
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
    
    @Path("/login")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String processLogin(
    		@FormParam("username") String username,
    		@FormParam("password") String password) {
    	//ToDo: check password
    	String typ = checkPassword(username,password);
    	if(typ.equals(""))
    	{
    		return presentLogin();
    	}
    	switch(typ)
    	{
    	case "N": return formular();
    	default: return list();
    	}
    }
    
    @Path("/formular")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String formular() {
    	return Itech.getResource("anmeldeformular.html");
    }
    
    @Path("/list")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String list() {
    	db.getSchueler();
    	StringBuilder sb = new StringBuilder();
		for (Schueler schueler : db.schuelerList){
			if(schueler.getBestaetigt().equals("0"))
			{
				sb.append("<br><a href=\"/itech/formular/"
						+schueler.getIdschueler()+"\">"
						//+getName(schueler.getFormuldardaten())
						+"</a>");
			}
		}
        return "<html><body><h1>List der unbestätigten Anmeldungen:</h1>"+sb.toString()+"</body></html>";
    }
    
    @Path("/schueler")
    @POST @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_HTML)
    public String createSchueler(
    		final MultivaluedMap<String, String> formParams) {
    	Anmeldedaten daten = new Anmeldedaten(formParams);
        try {
			return speicherSchueler(daten.getJSON());
		} catch (JsonProcessingException e) {
			return formular();
		}
    }
    
    @Path("/schuelerjson")
    @POST @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_HTML)
    public String speicherSchueler(
    		String jsonData) {
    	//todo: insert data into database
    	return "done";
    }
    
    @Path("/schueler/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String readSchueler(
    		@PathParam("id") long id) {
    	final class Schueler
    	{
    		public String vorname = "eins";
    		public String nachname = "zwei";
    	};
    	Schueler schueler = new Schueler();
    	//ToDo: Read Schueler from database
    	ObjectMapper MAPPER = new ObjectMapper();
    	try {
			return MAPPER.writeValueAsString(schueler);
		} catch (JsonProcessingException e) {
			return "";
		}
    }
    
    @Path("/schueler/{id}")
    @DELETE
    @Produces(MediaType.TEXT_HTML)
    public String deleteSchueler(
    		@PathParam("id") long id) {
        // TODO: remove id from database
    	return list();
    }
    
    @Path("/schueler/{id}")
    @PUT @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_HTML)
    public String updateSchueler(
    		@PathParam("id") long id,
    		final MultivaluedMap<String, String> formParams) {
    	// TODO: update id in database
    	return list();
    }

}