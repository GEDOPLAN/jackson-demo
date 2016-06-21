package de.gedoplan.showcase.resources.system;

import de.gedoplan.showcase.resources.BasicAnnotationResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 * Registrierung Webservices.
 *
 * Dominik Mathmann
 */
@ApplicationPath("/rest")
public class ApplicationResource extends Application {

    @Override
    public Set<Object> getSingletons() {
        final Set<Object> instances = new HashSet<Object>();
        instances.add(new JacksonFeature());
        instances.add(new LoggingFilter());
        return instances;
    }

}
