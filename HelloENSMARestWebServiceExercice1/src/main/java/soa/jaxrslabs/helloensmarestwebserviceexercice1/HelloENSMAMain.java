package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class HelloENSMAMain {

    public static final URI BASE_URI = getBaseURI();

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/rest/").port(9991).build();
    }

    public static void main(String[] args) {
        ResourceConfig rc = new ResourceConfig();
        rc.packages("soa.jaxrslabs.helloensmarestwebserviceexercice1");
        try {
            HttpServer server = GrizzlyHttpServerFactory.createHttpServer(BASE_URI, rc);
            server.start();

            System.out.println(String.format("Jersey app started with WADL available at "
                    + "%sapplication.wadl\nHit enter to stop it...",
                    BASE_URI, BASE_URI));
            System.in.read();
            server.shutdownNow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
