package com.hws.user;

import java.util.Date;

public class User {

	private int id;
	private String name;
	private Date timestamp;

	public User (){
		
	}
	public User(int id, String name, Date timestamp) {
		super();
		this.id = id;
		this.name = name;
		this.timestamp = timestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", timestamp=" + timestamp + "]";
	}

}
