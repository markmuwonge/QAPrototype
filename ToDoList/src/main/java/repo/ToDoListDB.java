package repo;

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
	
	
	public String createToDo(String toDo) {
		ToDo aTodo = json.fromJSON(toDo, ToDo.class);
		manager.persist(aTodo);
	
		return "To-do added";
	}
	

	
	
	
	
	
}
