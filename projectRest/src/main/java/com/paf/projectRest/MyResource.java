package com.paf.projectRest;

//port jakarta.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import com.model.test;
import com.model.Fund_Management;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	test t1 = new test();
	Fund_Management appointmentObj = new Fund_Management();
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
    
  //POST METHOD
  	@POST 
  	@Path("t3") 
  	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
  	@Produces(MediaType.TEXT_PLAIN)
  	public String insertAppointments( @FormParam("ID") int ID,
  			                @FormParam("patientID") String patientID,
  							@FormParam("doctorID") String doctorID,
  							@FormParam("appointmentDate") String appointmentDate,
  							@FormParam("appointmentTime") String appointmentTime)
  							
  	{
  		String output = appointmentObj.insertAppointments(ID,patientID, doctorID, appointmentDate, appointmentTime);  
  		return output; 
  	}
}
