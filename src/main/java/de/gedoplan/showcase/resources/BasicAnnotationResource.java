package de.gedoplan.showcase.resources;

import de.gedoplan.showcase.models.Customer;
import de.gedoplan.showcase.models.ModelFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Grundlegene Beispiele für die Verwendung von Jackson Annotationen.
 *
 * @author Dominik Mathmann
 */
@Path("basic")
@Produces("application/json")
@Consumes("application/json")
public class BasicAnnotationResource {

    @GET
    public Customer getCustomer(){
        return ModelFactory.getCustomer();
    }
}
