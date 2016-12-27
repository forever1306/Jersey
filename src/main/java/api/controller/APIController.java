package api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.entity.Student;

@Path("/api")
public class APIController {
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(){
		
		return new Student();
	}
}
