package endpoint;



import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.*;



@Path("/todo")
public class ToDoEndPoint {
	
	
	@Inject
	private service.TodoService tdservice;
	
	@GET
	@Path("/getTD/{id}")
	public String getToDo(@PathParam("id") Integer id) {
		return tdservice.getToDo(id);
	}
	
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
