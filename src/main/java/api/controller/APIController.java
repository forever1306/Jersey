package api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.entity.Student;

@Path("/api")
public class APIController {
	
	@POST
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(Student student){
		
		return new Student();
	}
}
