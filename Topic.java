package com.example.demo;


/**
 * @author Vinod
 *
 */

public class Topic {

	String id;
	String name;
	String decription;
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Topic(String id, String name, String decription) {
		super();
		this.id = id;
		this.name = name;
		this.decription = decription;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	@Override
	public String toString() {
		return "Topics [id=" + id + ", name=" + name + ", decription=" + decription + "]";
	}
	
	
	
}
