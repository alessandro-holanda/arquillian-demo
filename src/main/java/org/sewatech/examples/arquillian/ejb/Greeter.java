package org.sewatech.examples.arquillian.ejb;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/** 
 * Small example of EJB 3.1
 * 
 * @author Alexis Hassler
 */
@Stateless
@Path("/greeter")
public class Greeter {
    
    @GET
    @Path("/{name}")
    public String greet(@PathParam("name") String name) {
        return "Hello " + name;
    }
}
