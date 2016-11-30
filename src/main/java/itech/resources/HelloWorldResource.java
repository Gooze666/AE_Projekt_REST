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
			r = new BufferedReader(new FileReader("/AE_Projekt_REST/src/main/resources/anmeldeformular.html"));
		      
			String line = null;
			while((line=r.readLine())!=null)
			   sb.append(line);
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        String anmeldeFormular = sb.toString();
        return anmeldeFormular;
    }
    
    @Path("/loginscreen")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String loginScreenString() {
    	BufferedReader r;
    	StringBuilder sb = new StringBuilder();
		try {
			r = new BufferedReader(new FileReader("/AE_Projekt_REST/src/main/resources/loginscreen.html"));
		      
			String line = null;
			while((line=r.readLine())!=null)
			   sb.append(line);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String loginScreen = sb.toString();
        return loginScreen;
    }
    
    @Path("/anmeldung")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String anmelden(
    		@FormParam("username")String username,
    		@FormParam("passwort")String password
    		) {
    	
    	return username;
    }
    
    @Path("/anmeldeformularVerarbeitung")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    
    public String anmeldeformularVerarbeitung(
    	@FormParam("firma")String firma,
    	@FormParam("strasse")String strasse,
    	@FormParam("hausnr")String hausnr,
    	@FormParam("plz")String plz,
    	@FormParam("ort")String ort,
    	@FormParam("telefon")String telefon,
    	@FormParam("telefax")String telefax,
    	@FormParam("vorname")String vorname,
    	@FormParam("name")String name,
    	@FormParam("email")String email,
    	@FormParam("nachname_azubi")String nachname_azubi,
    	@FormParam("vorname_azubi")String vorname_azubi,
    	@FormParam("geburtsdatum_azubi")String geburtsdatum_azubi,
    	@FormParam("geburtsort_azubi")String geburtsort_azubi,
    	@FormParam("staatsangehoerigkeit_azubi")String staatsangehoerigkeit_azubi,
    	@FormParam("geburtsland_azubi")String geburtsland_azubi,
    	@FormParam("strasse_azubi")String strasse_azubi,
    	@FormParam("hausnr_azubi")String hausnr_azubi,
    	@FormParam("plz_azubi")String plz_azubi,
    	@FormParam("ort_azubi")String ort_azubi,
    	@FormParam("bundesland_azubi")String bundesland_azubi,
    	@FormParam("telefon_azubi")String telefon_azubi,
    	@FormParam("mobil_azubi")String mobil_azubi,
    	@FormParam("email_azubi")String email_azubi,
    	@FormParam("nachname_erziehungsberechtigte")String nachname_erziehungsberechtigte,
    	@FormParam("vorname_erziehungsberechtigte")String vorname_erziehungsberechtigte,
    	@FormParam("strasse_erziehungsberechtigte")String strasse_erziehungsberechtigte,
    	@FormParam("hausnr_erziehungsberechtigte")String hausnr_erziehungsberechtigte,
    	@FormParam("plz_erziehungsberechtigte")String plz_erziehungsberechtigte,
    	@FormParam("ort_erziehungsberechtigte")String ort_erziehungsberechtigte,
    	@FormParam("telefon_erziehungsberechtigte")String telefon_erziehungsberechtigte,
    	@FormParam("email_erziehungsberechtigte")String email_erziehungsberechtigte,
    	@FormParam("schulname_bildungsweg")String schulname_bildungsweg,
    	@FormParam("bundesland_bildungsweg")String bundesland_bildungsweg,
    	@FormParam("entlassungsjahr_bildungsweg")String entlassungsjahr_bildungsweg,
    	@FormParam("hoechsterabschluss_bildungsweg")String hoechsterabschluss_bildungsweg,
    	@FormParam("schulbesuchsjahr_bildungsweg")String schulbesuchsjahr_bildungsweg,
    	@FormParam("fachrichtung_ausbildung")String fachrichtung_ausbildung,
    	@FormParam("ausbildungszeit_vom_ausbildung")String ausbildungszeit_vom_ausbildung,
    	@FormParam("ausbildungszeit_bis_ausbildung")String ausbildungszeit_bis_ausbildung,
    	@FormParam("begruendung_ausbildung")String begruendung_ausbildung
    		) {
    	

        return firma;
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
