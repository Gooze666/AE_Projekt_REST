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
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;


@Path("itech")
public class ItechResource extends JerseyClient {
	
	private Client client;
    public ItechResource(Client client) 
    { 
    	this.client = client;
    }

    @Path("/login")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response presentLogin() {
    	return Response.ok(Itech.getResource("loginscreen.html"), MediaType.TEXT_HTML).build();
    }
    
       
    @Path("/login")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public Response processLogin(
    		@FormParam("username") String username,
    		@FormParam("password") String password) {
    	String typ = Itech.checkPassword(username,password);
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
    public Response formular() {
    	return Response.ok(Itech.getResource("anmeldeformular.html"), MediaType.TEXT_HTML).build();
    }
    
    @Path("/list")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response list() {
    	DbHandler db = new DbHandler();
    	db.getSchueler();
    	return Response.ok(Itech.getSchuelerList(db.schuelerList), MediaType.TEXT_HTML).build();
    }
    
    @Path("/schueler")
    @POST @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_HTML)
    public Response createSchueler(
    		final MultivaluedMap<String, String> formParams) {
    	Anmeldedaten daten = new Anmeldedaten(formParams);
        try {
			return speicherSchueler(daten.getJSON());
		} catch (JsonProcessingException e) {
			return Response.serverError().build();
		}
    }
    
    @Path("/schuelerjson")
    @POST @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_HTML)
    public Response speicherSchueler(
    		String jsonData) {
    	DbHandler db = new DbHandler();
    	db.createSchueler(1,jsonData, "N");
    	return Response.ok(Itech.getResource("anmeldungerfolgt.html"), MediaType.TEXT_HTML).build();
    }
    
    @Path("/schueler/{id}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response readSchueler(
    		@PathParam("id") int id) {
    	DbHandler db = new DbHandler();
    	Schueler schueler = db.getSchueler(id);
    	if(schueler == null)
    	{
    		return list();
    	}
    	else
    	{
    		Anmeldedaten daten = Anmeldedaten.fromJSON(schueler.getFormuldardaten());
    		String seite = Itech.getResource("anmeldeformularverwaltung.html");
    		if(daten == null)
    		{
    			return list();
    		}
    		return Response.ok(Itech.replaceDaten(seite, id, daten), MediaType.TEXT_HTML).build();
    	}
    }
    
    @Path("/schueler/{id}")
    @POST @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_HTML)
    public Response processSchueler(
    		@PathParam("id") int id,
    		final MultivaluedMap<String, String> formParams) {
    	switch(formParams.getFirst("_method"))
    	{
    	case "DELETE": return deleteSchueler(id);
    	case "PUT": return updateSchueler(id, formParams);
    	default: return list();
    	}
    }
    
    @Path("/schueler/{id}")
    @DELETE
    @Produces(MediaType.TEXT_HTML)
    public Response deleteSchueler(
    		@PathParam("id") int id) {
    	DbHandler db = new DbHandler();
        db.deleteSchueler(id);
        return list();
    }
    
    @Path("/schuelerstatus/{id}")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public Response bestaetigeSchueler(
    		@PathParam("id") int id) {
    	DbHandler db = new DbHandler();
        db.updateBesteatigtStatus(id, "J");        
    	return Response.ok(Itech.replaceEmail(db.getSchueler(id)), MediaType.TEXT_HTML).build();
    }
    
    @Path("/schueler/{id}")
    @PUT @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_HTML)
    public Response updateSchueler(
    		@PathParam("id") int id,
    		final MultivaluedMap<String, String> formParams) {
    	Anmeldedaten daten = new Anmeldedaten(formParams);
    	try {
    		DbHandler db = new DbHandler();
			db.updateFormulardaten(id, daten.getJSON());
		} catch (JsonProcessingException e) {
		}
    	return list();
    }

}