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

	public String createToDo(String toDo) {
		return this.tdlrepo.createToDo(toDo);
	}

}
