package com.words_store.home_controller_service;

import java.util.List;

import com.words_store.entity.wordStore;
import com.words_store.home_dto.homeControllerDTO;

public interface homeControllerService {

	
	public List<wordStore> returnAllWords();
	
	public void deleteWord();
	
	public void editWord();
	
	
	
	public void returnOneWord();

	homeControllerDTO addWord(homeControllerDTO dto);
}
