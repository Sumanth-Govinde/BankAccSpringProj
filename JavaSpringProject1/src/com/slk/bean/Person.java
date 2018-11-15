package com.slk.bean;

public class Person extends Account{
	private String Name;
	private int age;
	Account account;
	
	public Person()
	{
		
	}

	public Person(String name, int age, Account account) {
		super();
		Name = name;
		this.age = age;
		this.account = account;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "\n\nPerson [Name=" + Name + ", age=" + age + ", account=" + account + "]";
	}
	
	
}
