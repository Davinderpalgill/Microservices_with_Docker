package com.davinder.accounts.accounts.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Accounts {
	
	@Column(name="customer_id")
	private int  customerId;
	
	@Column(name="account_number")
	@Id
	private long accountNumber;
	
	public int getCustomerid() {
		return customerId;
	}

	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchAddr() {
		return branchAddr;
	}

	public void setBranchAddr(String branchAddr) {
		this.branchAddr = branchAddr;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Column(name="account_type")
	private  String accountType;
	
	@Column(name="branch_address")
	private String branchAddr;
	
	@Column(name="create_dt")
	private LocalDate createDate;

}
