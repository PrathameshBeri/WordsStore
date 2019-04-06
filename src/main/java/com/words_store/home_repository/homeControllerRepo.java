package com.words_store.home_repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "words")
public class homeControllerRepo implements Serializable {

	private static final long serialVersionUID = 12345678L;
	
	
	@Id
	@JsonProperty(value = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Integer id;
	
	@Column(name = "WORD")
	@JsonProperty(value = "word")
	public String word;
	
	@Column(name = "DEFINITION")
	@JsonProperty(value = "word")
	public String definition;
	
	
}
