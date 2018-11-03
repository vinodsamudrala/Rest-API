package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;


public class Alien {

	public String name ;
	public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + "]";
	}
	
	
}
