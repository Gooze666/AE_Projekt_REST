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

import org.glassfish.jersey.client.JerseyClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("itech")
public class ItechResource extends JerseyClient {
	
	private Client client;
    public ItechResource(Client client) { this.client = client; }

    @Path("/login")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String login() {
        return "<html><body>login</body></html>";
    }
    
    @Path("/formular")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String formular() {
        return "<html><body>formular</body></html>";
    }
    
    @Path("/list")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String list() {
        return "<html><body>list</body></html>";
    }
    
    @Path("/schueler")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String createSchueler(
    		@FormParam("json") String schueler) {
        return "<html><body>schueler?json="+schueler+"</body></html>";
    }
    
    @Path("/schueler/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String readSchueler(
    		@PathParam("id") long id) {
    	final class bla
    	{
    		public int eins = 5;
    		public int zwei = 10;
    	};
    	
    	ObjectMapper MAPPER = new ObjectMapper();
    	try {
			return MAPPER.writeValueAsString(new bla());
		} catch (JsonProcessingException e) {
			return "";
		}
    }
    
    @Path("/schueler/{id}")
    @DELETE
    @Produces(MediaType.TEXT_HTML)
    public String deleteSchueler(
    		@PathParam("id") long id) {
        // TODO: delete in database
    	return client.target("http://localhost:18181")
        		.path("itech").path("list")
        		.request(MediaType.TEXT_HTML)
        		.get().toString();
    }
    
    @Path("/schueler/{id}")
    @PUT
    @Produces(MediaType.TEXT_HTML)
    public String updateSchueler(
    		@PathParam("id") long id) {
    	// TODO: update in database
    	return client.target("http://localhost:18181")
        		.path("itech").path("list")
        		.request(MediaType.TEXT_HTML)
        		.get().toString();
    }

}
