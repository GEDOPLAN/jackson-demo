package de.gedoplan.showcase.resources;

import de.gedoplan.showcase.models.ModelFactory;
import de.gedoplan.showcase.models.Order;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Weiteführende Beispiele im Bereich "Deserialization" GEDOPLAN, Dominik
 * Mathmann
 *
 * @author Dominik Mathmann
 */
@Path("deextend")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DeserializationResource {

    @POST
    public void getOrder(Order order) {
        System.out.println("Additional Infos: " + order.getAdditionalInfos());
        System.out.println("orderID: " + order.getOrderID());
        System.out.println("Freight: " + order.getFreight());
        
    }

    @GET
    public Order getOrder() {
        return ModelFactory.getOrder();
    }
}
