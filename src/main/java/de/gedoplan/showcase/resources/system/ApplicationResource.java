package de.gedoplan.showcase.resources.system;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Registrierung Webservices.
 *
 * Dominik Mathmann
 */
@ApplicationPath("/rest")
public class ApplicationResource extends ResourceConfig {

    public ApplicationResource() {
        System.out.println("Register JacksonFeature...");
        super.packages("de.gedoplan.showcase.resources")
                .register(JacksonFeature.class);
    }

}
