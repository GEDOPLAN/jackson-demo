package de.gedoplan.showcase.resources;

import com.fasterxml.jackson.annotation.JsonView;
import de.gedoplan.showcase.models.ModelFactory;
import de.gedoplan.showcase.models.Shipper;
import de.gedoplan.showcase.models.views.DetailView;
import de.gedoplan.showcase.models.views.ListView;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
    @JsonView(ListView.class)
    public Shipper getShipperOverview() {
        return ModelFactory.getShipper();
    }

    @GET
    @Path("detail")
    @JsonView(DetailView.class)
    public Shipper getShipperDetail() {
        return ModelFactory.getShipper();
    }
}
