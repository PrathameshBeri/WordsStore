package com.words_store.home_controller_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.words_store.entity.wordStore;
import com.words_store.home_dao.homeControllerDao;

@Service
public class homeControllerServiceImpl implements homeControllerService{

	@Autowired
	homeControllerDao wordRepo;
	
	@Override
	public List<wordStore> returnAllWords() {
		// TODO Auto-generated method stub
		
		
		return (List<wordStore>) wordRepo.findAll();
	}

	@Override
	public void deleteWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnOneWord() {
		// TODO Auto-generated method stub
		
	}

}
