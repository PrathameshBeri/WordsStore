package com.words_store.home_controller_service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.words_store.entity.wordStore;
import com.words_store.home_dao.homeControllerDao;
import com.words_store.home_dto.homeControllerDTO;

@Service
public class homeControllerServiceImpl implements homeControllerService{

	@Autowired
	homeControllerDao wordRepo;
	
	@Autowired
	ObjectMapper mapper;
	
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
	public homeControllerDTO addWord(homeControllerDTO dto) {
		// TODO Auto-generated method stub
		System.out.print(dto);
		wordStore ws = mapper.convertValue(dto, wordStore.class);
		
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
			String ldt = df.format(LocalDateTime.now());
		ws.setDateAdded(ldt);
		wordRepo.save(ws);
		return dto;
		
	}

	@Override
	public void returnOneWord() {
		// TODO Auto-generated method stub
		
	}

}
