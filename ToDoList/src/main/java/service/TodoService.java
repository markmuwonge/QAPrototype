package service;

import javax.inject.Inject;

import repo.JSONUtil;
import repo.ToDoListDB;

public class TodoService {

	@Inject
	JSONUtil json;
	
	@Inject
	ToDoListDB tdlrepo;
	
	String allToDoObjectsAsJson = "";
	
	public String getAllToDo() {
		this.tdlrepo.getAllTodo().stream()
			.forEach(x -> allToDoObjectsAsJson += this.json.toJSON(x) + "\n");
		
		return allToDoObjectsAsJson.trim();
	}

	public String createToDo(String toDo) {
		return this.tdlrepo.createToDo(toDo);
	}
	
	public String updateToDo(String toDo) {
		return this.tdlrepo.updateToDo(toDo);
	}
	
	public String deleteToDo(int id) {
		return this.tdlrepo.deleteToDo(id);
	}
	

}
