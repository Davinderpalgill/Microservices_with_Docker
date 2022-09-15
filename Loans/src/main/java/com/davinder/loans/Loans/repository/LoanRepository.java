package com.davinder.loans.Loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.davinder.loans.Loans.model.Loans;

@Repository
public interface LoanRepository extends CrudRepository<Loans,Long>{
	
	 List<Loans> findByCustomerId(int customerId);

}
