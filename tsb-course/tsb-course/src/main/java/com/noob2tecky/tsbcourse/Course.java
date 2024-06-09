package com.noob2tecky.tsbcourse;


public class Course {
	private long id;
	private String author;
	private String name;
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", author=" + author + ", name=" + name + "]";
	}


	public long getId() {
		return id;
	}


	public String getAuthor() {
		return author;
	}


	public String getName() {
		return name;
	}


	public Course(long id, String author, String name) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
	}

}
