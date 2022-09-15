package com.davinder.loans.Loans.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Loans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="loan_id")
	private  long loanId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="loan_amount")
	private long principalAmount;
	
	@Column(name="balance_amount")
	private long balanceAmt;
	

	@Column(name ="tenure")
	private int tenure;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="start_dt")
	private LocalDate createdDate;
	
	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public long getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(long principalAmount) {
		this.principalAmount = principalAmount;
	}

	public long getBalanceAmt() {
		return balanceAmt;
	}

	public void setBalanceAmt(long balanceAmt) {
		this.balanceAmt = balanceAmt;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}


}
