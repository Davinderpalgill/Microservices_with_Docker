package com.davinder.loans.Loans.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davinder.loans.Loans.model.Customer;
import com.davinder.loans.Loans.model.Loans;
import com.davinder.loans.Loans.repository.LoanRepository;

@RestController
public class LoanController {
	
	@Autowired
	LoanRepository loansRepository;
	
	@PostMapping("/getLoans")
	public List<Loans> getLoansById(@RequestBody Customer customer){
	      
	       List<Loans> list = loansRepository.findByCustomerId(customer.getCustomerId());
	      if(list.isEmpty()) return null;
	      else return list;
	}

}
