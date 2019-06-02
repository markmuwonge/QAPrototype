package com.qa.endpoint;



import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.qa.service.TodoService;



@Path("/todo")
public class ToDoEndPoint {
	
	
	@Inject
	private TodoService tdservice ;
	
	@GET
	@Path("/getAllTD")
	public String getAllToDo() {
		return tdservice.getAllToDo();
	}
	
	@POST
	@Path("/createTD")
	public String createToDo(String toDo) {
		return tdservice.createToDo(toDo);
	}
	
	@POST
	@Path("/updateTD")
	public String updateToDo(String toDo) {
		return tdservice.updateToDo(toDo);
	}
	
	@GET
	@Path("/deleteTD/{id}")
	public String deleteTodo(@PathParam("id") Integer id) {
		return tdservice.deleteToDo(id);
	}
	
	
	

	
}
