package com.words_store.home_controller_service;

import java.util.List;

import com.words_store.entity.wordStore;

public interface homeControllerService {

	
	public List<wordStore> returnAllWords();
	
	public void deleteWord();
	
	public void editWord();
	
	public void addWord();
	
	public void returnOneWord();
}
