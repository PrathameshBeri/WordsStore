package com.words_store.home_dto;

import com.fasterxml.jackson.annotation.JsonSetter;


public class homeControllerDTO {

	
	@JsonSetter("name")
	
	private String name;
	
	@JsonSetter("Descritption")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
