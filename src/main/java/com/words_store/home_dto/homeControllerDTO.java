package com.words_store.home_dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;


public class homeControllerDTO {

	
	@JsonProperty("word")
	
	private String word;
	
	@JsonProperty("definition")
	private String definition;
	
	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	@JsonProperty("date_added")
	private String date_added;

	public String getWord() {
		return word;
	}

	public void setWord(String name) {
		this.word = name;
	}

	public homeControllerDTO() {
		
	}

	public homeControllerDTO(String word, String definition, String date_added) {
		super();
		this.word = word;
		this.definition = definition;
		this.date_added = date_added;
	}
	
	
	
}
