package de.gedoplan.showcase.resources;

import de.gedoplan.showcase.models.Employee;
import de.gedoplan.showcase.models.ModelFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Dominik Mathmann
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("custome")
public class CustomeResource {

    @GET
    public Employee getEmployee(){
        return ModelFactory.getEmployee();
    }
    
    @POST
    public void setEmployee(Employee emp){
        System.out.println(emp);
    }
}
