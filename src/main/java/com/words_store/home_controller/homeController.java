package com.words_store.home_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.words_store.home_controller_service.homeControllerServiceImpl;
import com.words_store.home_repository.homeControllerRepo;



@RestController
@RequestMapping(value = "/")
public class homeController {
	
	@Autowired
	homeControllerServiceImpl homeControllerService;

	
	@GetMapping
	public ResponseEntity getAllWords() {
		
		List<homeControllerRepo> words = homeControllerService.findAll();
		return new ResponseEntity(words, HttpStatus.CREATED);
	}
}
