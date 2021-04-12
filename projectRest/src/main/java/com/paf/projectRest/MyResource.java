package com.paf.projectRest;

//port jakarta.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import com.model.test;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	test t1 = new test();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("t1")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
     return "Got it!";
       
    }
    @GET
    @Path("t2")
    @Produces(MediaType.TEXT_PLAIN)
    public String getqt() {
        return "Got gggg";
    }
}
