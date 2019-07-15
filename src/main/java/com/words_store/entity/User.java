package com.words_store.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq" )
	@Column
	private Long id;
	
	@Column
	private String userName;
	
	@OneToMany
	private List<wordStore> wordsLiked = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<wordStore> getWordsLiked() {
		return wordsLiked;
	}

	public void setWordsLiked(List<wordStore> wordsLiked) {
		this.wordsLiked = wordsLiked;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", wordsLiked=" + wordsLiked + "]";
	}
	
	
	
}
