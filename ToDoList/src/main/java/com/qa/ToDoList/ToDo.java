package com.qa.ToDoList;

import javax.persistence.*;

@Entity
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String todo;

	public String getTodo() {
		return todo;
	}

	public void setID(int id) {
		this.id = id;
	}
	public int getID()
	{
		return id;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
}
