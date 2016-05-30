package de.gedoplan.showcase.resources;

import com.fasterxml.jackson.annotation.JsonView;
import de.gedoplan.showcase.models.JSONViews;
import de.gedoplan.showcase.models.ModelFactory;
import de.gedoplan.showcase.models.Shipper;
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
@Path("view")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ViewResource {

    @GET
    @Path("overview")
    @JsonView(JSONViews.Summary.class)
    public Shipper getShipperOverview() {
        return ModelFactory.getShipper();
    }

    @GET
    @Path("detail")
    @JsonView(JSONViews.Details.class)
    public Shipper getShipperDetail() {
        return ModelFactory.getShipper();
    }

    @POST
    @Path("overview")
    public void setShipperOverview(@JsonView(JSONViews.Summary.class) Shipper shipper) {
        System.out.println("Company Name: " + shipper.getCompanyName());
        System.out.println("Phone: " + shipper.getPhone());
    }

    @POST
    @Path("detail")
    public void setShipperDetail(@JsonView(JSONViews.Details.class) Shipper shipper) {
        System.out.println("Company Name: " + shipper.getCompanyName());
        System.out.println("Phone: " + shipper.getPhone());
    }

}
