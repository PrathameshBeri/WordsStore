package com.words_store.entity;

import java.io.Serializable;
import java.time.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "words")
public class wordStore implements Serializable {

	

	private static final long serialVersionUID = 12345678L;
	
	
	@Id
	@JsonProperty(value = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "WORD")
	@JsonProperty(value = "word")
	private String word;
	
	@Column(name = "DEFINITION")
	@JsonProperty(value = "word")
	private String definition;
	
	@Column(name = "Date_Added")
	@JsonProperty(value = "date_added")
	private LocalDateTime dateAdded;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	public wordStore(String word, String definition, LocalDateTime dateAdded) {
		super();
		this.word = word;
		this.definition = definition;
		this.dateAdded = dateAdded;
	}

	public wordStore() {
		// TODO Auto-generated constructor stub
	}
	
	public wordStore(String word, String definition) {
		
		super();
		this.word = word;
		this.definition = definition;
		this.dateAdded = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "wordStore [id=" + id + ", word=" + word + ", definition=" + definition + ", dateAdded=" + dateAdded
				+ "]";
	}
}
