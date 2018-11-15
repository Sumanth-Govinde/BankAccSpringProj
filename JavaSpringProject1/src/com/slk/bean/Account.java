package com.slk.bean;

public class Account {
	private int accNo;
	private int balance;
	private String accHolder;
	
	public Account(){
		
	}
	
	
	public Account(int accNo, int balance, String accHolder) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int a){					//Deposit function
		this.balance=this.balance+a;
	}
	
	public void withdraw(int a){					//Withdraw function
		this.balance=this.balance-a;		
	}
	
	public int getBalance(){ 				//function to view balance
		return balance;
	}


	@Override
	public String toString() {
		return "\nAccount [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	
	
	
}
