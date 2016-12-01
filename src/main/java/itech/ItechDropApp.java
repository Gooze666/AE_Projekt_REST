package itech;

import io.dropwizard.Application;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Environment;
import itech.client.HelloWorldClient;
import itech.resources.HelloWorldJsonResource;
import itech.resources.HelloWorldResource;

import javax.ws.rs.client.Client;

public class ItechDropApp extends Application<ItechDropConf> {

    public static void main(final String[] args) throws Exception {
        new ItechDropApp().run(args);
    }

    @Override
    public void run(final ItechDropConf configuration,
                    final Environment environment) {
        final Client client = setupClient(environment);
        environment.jersey().register(new HelloWorldClient(client));
        environment.jersey().register(new HelloWorldResource());
        environment.jersey().register(new HelloWorldJsonResource());
        // Beispiel für einen
        System.out.println(configuration.getConsumableValue());
    }

    private Client setupClient(Environment environment) {
        return new JerseyClientBuilder(environment).build("REST Client");
    }

}