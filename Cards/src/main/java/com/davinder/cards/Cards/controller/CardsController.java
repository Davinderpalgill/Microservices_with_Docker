package com.davinder.cards.Cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davinder.cards.Cards.model.Cards;
import com.davinder.cards.Cards.model.Customer;
import com.davinder.cards.Cards.repository.CardsRepository;

@RestController
public class CardsController {
	
	@Autowired
	CardsRepository cardsRepository;
	
	@PostMapping("/myCards")
	public  List<Cards> getMyCards(@RequestBody Customer customer){
	      
	       List<Cards> list = cardsRepository.findByCustomerId(customer.getCustomerId());
	      if(list.isEmpty()) return null;
	      else return list;
}
}
	
