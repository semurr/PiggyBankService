package com.bank.backend;

/**
 * @author stephen
 * Backend database stub
 */
public class BankAccount {
	private double money = 0;
	
	public boolean Deposit(double value){
		if(value >= 0){
			money += value;
			return true;
		}			
		return false;		
	}
	
	public boolean Withdrawl(double value){
		if(value >= 0 && money >= value){
			money -= value;
			return true;
		}			
		return false;	
	}
	
	public double getBalance(){
		return money;
	}
	

}
