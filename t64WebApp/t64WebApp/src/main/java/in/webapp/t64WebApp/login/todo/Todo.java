package in.webapp.t64WebApp.login.todo;

import java.time.LocalDate;

public class Todo {
	
	//id,description,authorName,targetDate,isDone
	
	private int id;
	private String description;
	private String name;
	private LocalDate targetDate;
	private boolean done;
	
	public Todo(int id, String description, String name, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todos [id=" + id + ", description=" + description + ", name=" + name + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}
	
	

}
