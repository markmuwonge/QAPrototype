package com.qa.repo;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.ToDoList.ToDo;




@Transactional
public class ToDoListDB {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil json;
	
	public List<ToDo> getAllTodo(){
		return manager.createQuery("Select a from ToDo a", ToDo.class).getResultList();
	}

	public String createToDo(String toDo) {
		ToDo aTodo = json.fromJSON(toDo, ToDo.class);
		manager.persist(aTodo);
	
		return "To-do added";
	}
	
	public String updateToDo(String toDo) {
		ToDo aTodo = json.fromJSON(toDo, ToDo.class);
		manager.merge(aTodo);
		return "To-do successfully updated";
	}
	
	public String deleteToDo(int id) {
		manager.remove(manager.find(ToDo.class, id));
		
		return "To-do successfully deleted";
	}
	

	
	
	
	
	
}
