package endpoint;



import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import service.TodoService;



@Path("/todo")
public class ToDoEndPoint {
	
	
	@Inject
	private TodoService tdservice ;
	
	
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
	

	
}
