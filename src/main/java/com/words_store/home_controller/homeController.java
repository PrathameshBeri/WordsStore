package com.words_store.home_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.words_store.entity.wordRoot;
import com.words_store.home_controller_service.homeControllerServiceImpl;
import com.words_store.home_dao.wordRootDao;
import com.words_store.home_dto.homeControllerDTO;



@RestController
@RequestMapping(value = "/wordGrimoire")
public class homeController {
	
	@Autowired
	homeControllerServiceImpl homeControllerService;
	
	@Autowired
	wordRootDao wrd;

	
	@GetMapping(value = "/allWords")
	public ResponseEntity getAllWords() {
		
		ResponseEntity res = new ResponseEntity(homeControllerService.returnAllWords(), HttpStatus.OK);
		//homeControllerService.return new ResponseEntity(words, HttpStatus.CREATED);
		
		return res.ok().body(res);
		
	}
	
	
	@PostMapping(value = "/saveWord")
	public ResponseEntity saveWord(@RequestBody homeControllerDTO word) {
		
		homeControllerDTO respon = homeControllerService.addWord(word);
		//ws.setWord(req.get);
		
		return new ResponseEntity(respon, HttpStatus.OK);
	}
	
	@PostMapping(value = "/saveRoot")
	public ResponseEntity saveRoot(@RequestBody String wr) {
		wordRoot wrc = new wordRoot("greek");
		
		wrd.save(wrc);
		
		
		return new ResponseEntity(null, HttpStatus.OK);
	}
}   
