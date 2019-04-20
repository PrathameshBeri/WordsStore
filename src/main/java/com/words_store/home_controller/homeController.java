package com.words_store.home_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.words_store.entity.wordStore;
import com.words_store.home_controller_service.homeControllerServiceImpl;



@RestController
@RequestMapping(value = "/wordGrimoire")
public class homeController {
	
	@Autowired
	homeControllerServiceImpl homeControllerService;

	
	@GetMapping(value = "/allWords")
	public ResponseEntity getAllWords() {
		
		ResponseEntity res = new ResponseEntity(homeControllerService.returnAllWords(), HttpStatus.OK);
		//homeControllerService.return new ResponseEntity(words, HttpStatus.CREATED);
		
		return res.ok().body(res);
		
	}
	
	
	@PostMapping(value = "/saveWord")
	public ResponseEntity saveWord(HttpRequest req) {
		
		wordStore ws = new wordStore();
		//ws.setWord(req.get);
		
		return null;
	}
}
