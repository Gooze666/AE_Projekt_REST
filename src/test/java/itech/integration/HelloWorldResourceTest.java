package itech.integration;

import itech.resources.HelloWorldResource;
import org.junit.Before;

public class HelloWorldResourceTest {
    private HelloWorldResource resource;

    @Before
    public void setup() {
        // Before each test, we re-instantiate our resource so it will reset
        // the counter. It is good practice when dealing with a class that
        // contains mutable data to reset it so tests can be ran independently
        // of each other.
        resource = new HelloWorldResource();
    }

    /*@Test
    public void idStartsAtOne() {
        HelloWorld result = resource.helloWorld();
        System.out.println(result.getMediaType());
        Assert.assertTrue(result.getMediaType().equals(
                "dff"
        ));
    }*/

    /*@Test
    public void idIncrementsByOne() {
        Saying result = resource.sayHello(Optional.of("dropwizard"));
        Saying result2 = resource.sayHello(Optional.of("dropwizard2"));

        assertThat(result2.getId()).isEqualTo(result.getId() + 1);
    }

    @Test
    public void absentNameReturnsDefaultName() {
        Saying result = resource.sayHello(Optional.<String>absent());
        assertThat(result.getContent()).contains("Stranger");
    }

    @Test
    public void nameReturnsName() {
        Saying result = resource.sayHello(Optional.of("dropwizard"));
        assertThat(result.getContent()).contains("dropwizard");
    }*/
}
