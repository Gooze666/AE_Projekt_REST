package itech.resources;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import itech.helloWorldService.Gender;
import itech.helloWorldService.HelloWorld;
import itech.helloWorldService.HelloWorldJsonExample;
import itech.helloWorldService.Itech;

import org.glassfish.jersey.client.JerseyClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    public ItechResource(Client client) { this.client = client; }

    @Path("/login")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String presentLogin() {
    	return Itech.getResource("loginscreen.html");
    }
    
    @Path("/login")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String processLogin(
    		@FormParam("username") String username,
    		@FormParam("password") String password) {
    	//ToDo: check password
    	if(
    	//checkpassword(username,password)==		
    		false)
    	{
    		return presentLogin();
    	}
    	switch(username)
    	{
    	case "ceo": return formular();
    	case "löwe": return list();
    	default: return presentLogin();
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
        return "<html><body>list</body></html>";
    }
    
    @Path("/schueler")
    @POST @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_HTML)
    public String createSchueler(
    		final MultivaluedMap<String, String> formParams) {
        return "<html><body>"+formParams.toString()+"</body></html>";
        
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
