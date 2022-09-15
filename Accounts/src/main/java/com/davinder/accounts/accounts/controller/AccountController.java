package com.davinder.accounts.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davinder.accounts.accounts.model.Accounts;
import com.davinder.accounts.accounts.model.Customer;
import com.davinder.accounts.accounts.repository.AccountsRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountsRepository accountsRepository;
	
	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		
		Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}
		
	}
	

}
