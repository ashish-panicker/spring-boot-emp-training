package com.example.tracks.service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "modules")
public class Module {

	@Id
	private String id;
	private String title;
	private String description;

	public Module() {
		super();
	}

	public Module(String id, String title, String decription) {
		super();
		this.id = id;
		this.title = title;
		this.description = decription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

}
