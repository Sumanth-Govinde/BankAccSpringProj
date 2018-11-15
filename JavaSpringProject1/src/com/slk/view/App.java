package com.slk.view;
import java.util.*;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.bean.Account;
import com.slk.bean.Person;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pp=new Person[10]; int a=-1;
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Person p1=(Person)context.getBean("p1");
		Person p2=(Person)context.getBean("p2");
		int ch;char c;
		do{
		System.out.println("Menu:\n1.Create Account\n2.Get Balance\n3.Deposit\n4.Withdraw\n\nChoose your option: ");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
		
		
		
			switch(ch){
		case 1:
				a=a+1;
				pp[a]=new Person();
				
				System.out.println("Enter the name: ");
				pp[a].setName(s.next());
				
				System.out.println("Enter the age: ");
				pp[a].setAge(s.nextInt());
				
				System.out.println("Enter the Account number: ");
				pp[a].setAccNo(s.nextInt());
				
				System.out.println("Enter the Account Balance: ");
				pp[a].setBalance(s.nextInt());
				break;
		case 2:{
				System.out.println("Enter the Name: ");
				String name=s.next();
				if(name.equals("smith"))
					System.out.println(p1);
				if(name.equals("kathy"))
					System.out.println(p2);
				for(int i=0; i<=a;i++)
				{
					if(pp[i].getName().equals(name)){
						System.out.println("Your Balance is : "+pp[i].getBalance());}
				}
				break;}
		
		case 3:{
				System.out.println("Enter the Name: ");
				String name=s.next();
				for(int i=0; i<=a;i++)
				{
					if(pp[i].getName().equals(name)){
						System.out.println("Enter the amount to be deposited: ");
						int am=s.nextInt();
						pp[i].deposit(am);
						System.out.println("Amount of "+am+" deposited successfully\nYour Balance is : "+pp[i].getBalance());}
				}
				break;}
		
		case 4:{
			System.out.println("Enter the Name: ");
			String name=s.next();
			for(int i=0; i<=a;i++)
			{
				if(pp[i].getName().equals(name)){
					System.out.println("Enter the amount to be Withdrawn: ");
					int am=s.nextInt();
					pp[i].withdraw(am);
					System.out.println("Amount of "+am+" withdrawn successfully\nYour Balance is : "+pp[i].getBalance());}
			}
			break;}
		default: System.out.println("Invalid option! Try again");
		}
			System.out.println("Do you want to continue? y/n");
			c=s.next().charAt(0);
		}while(c=='y');
		//System.out.println(p1);
		//System.out.println(p2);
		
	}

}
