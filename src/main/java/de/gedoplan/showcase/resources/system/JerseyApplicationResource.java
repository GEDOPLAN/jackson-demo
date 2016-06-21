package de.gedoplan.showcase.resources.system;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Registrierung Webservices. Aktivieren für die Verwendung im Glassfish,
 * ersetzt ApplicationResource
 *
 * ! Stand 06.2016: Zur Verwendung muss zusätzlich die passende Version von:
 * jackson-module-jaxb-annotations-{version} im "modules" Ordner des Glassfish
 * abgelegt werden. s. https://java.net/jira/browse/GLASSFISH-21141
 *
 * Dominik Mathmann
 */
//@ApplicationPath("/jrest")
public class JerseyApplicationResource extends ResourceConfig {

    public JerseyApplicationResource() {
        System.out.println("Register Jackson");
        super.register(JacksonFeature.class)
                .packages("de.gedoplan.showcase.resources");
    }

}
