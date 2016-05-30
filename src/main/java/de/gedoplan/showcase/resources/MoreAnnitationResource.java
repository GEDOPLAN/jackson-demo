package de.gedoplan.showcase.resources;

import com.fasterxml.jackson.annotation.JsonView;
import de.gedoplan.showcase.models.ModelFactory;
import de.gedoplan.showcase.models.Order;
import de.gedoplan.showcase.models.OrderDetail;
import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Weiteführende Beispiele im Bereich "Serialisierung/Deserialization"
 *
 * @author Dominik Mathmann
 */
@Path("extended")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MoreAnnitationResource {

    @POST
    public void setOrder(Order order) {
        System.out.println("Additional Infos: " + order.getAdditionalInfos());
        System.out.println("orderID: " + order.getOrderID());
        System.out.println("Freight: " + order.getFreight());
        System.out.println("Shipname: " + order.getShipName());

    }

    @GET
    public Order getOrder() {
        return ModelFactory.getOrder();
    }

    @GET
    @Path("details")
    public OrderDetail getOrderDetail() {
        Order order = ModelFactory.getOrder();
        OrderDetail orderDetail = ModelFactory.getOrderDetail(order);
        return orderDetail;
    }
}
