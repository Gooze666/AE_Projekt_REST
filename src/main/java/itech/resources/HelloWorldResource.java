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

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("helloWorld")
public class HelloWorldResource extends JerseyClient {

    @Path("/simpleTextString")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorldString() {
        String helloWorld = HelloWorld.helloWorldString();
        return helloWorld;
    }
    
    @Path("/anmeldeformular")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String anmeldeformularString() {
    	BufferedReader r;
    	StringBuilder sb = new StringBuilder();
		try {
			r = new BufferedReader(new FileReader( "H:\\Workspace\\AE_Projekt_REST\\src\\main\\resources\\anmeldeformular.html"));
		      
			String line = null;
			while((line=r.readLine())!=null)
			   sb.append(line);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String anmeldeFormular = sb.toString();
        return anmeldeFormular;
    }
    
    @Path("/anmelden")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String anmelden(
    		@FormParam("id")String id,
    		@FormParam("vorname")String vorname
    		) {
    	
        return "Anmeldung als "+vorname+" mit "+id+" fehlgeschlagen";
    }
    
    @Path("/sekretaerformular")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sekretaerformularString() {
    	BufferedReader r;
    	StringBuilder sb = new StringBuilder();
		try {
			r = new BufferedReader(new FileReader( "H:\\Workspace\\AE_Projekt_REST\\src\\main\\resources\\sekretaerformular.html"));
		      
			String line = null;
			while((line=r.readLine())!=null)
			   sb.append(line);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sekretaerFormular = sb.toString();
        return sekretaerFormular;
    }
    
    @Path("/bestaetigen")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String bestaetigen(
    		@QueryParam("id")String id
    		) {
        return "Bestaetigung mit "+id+" fehlgeschlagen";
    }
    

    @Path("/simpleTextAccepted")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloWorldAccepted() {
        String helloWorld = HelloWorld.helloWorldString();
        return Response.accepted(helloWorld).build();
    }

    @Path("/simpleTextNoContent")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloWorldNoContent() {
        String helloWorld = HelloWorld.helloWorldString();
        return Response.noContent().build();
    }

    @Path("/simpleTextOk")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloWorld() {
        String helloWorld = HelloWorld.helloWorldString();
        return Response.ok(helloWorld, MediaType.TEXT_PLAIN).build();
    }

    @Path("/simpleTextGreetings")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response helloWorldGreetings(
            @QueryParam("name")String name,
            @QueryParam("gender") Gender gender) {
        String helloWorldGreetings = HelloWorld.helloWorldStringAdvanced(name, gender);
        return Response.ok(helloWorldGreetings, MediaType.TEXT_PLAIN).build();
    }

}
