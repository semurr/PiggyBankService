package com.bank.ws.service.impl;

import javax.jws.WebService;

import com.bank.backend.BankAccount;
import com.bank.model.Balance;
import com.bank.model.Deposit;
import com.bank.model.Withdrawl;
import com.bank.ws.service.PiggyBankService;
import com.bank.ws.util.Util;

@WebService(
		portName = "BankPort",
		serviceName = "PiggyBankService",
		targetNamespace = "http://com.bank.ws.service/wsdl",
		endpointInterface = "com.bank.ws.service.PiggyBankService")
public class PiggyBankServiceImpl implements PiggyBankService {
	
	private BankAccount BA = new BankAccount();

	public Balance getBalance() {
		Balance balance = new Balance();
		balance.setMoney(BA.getBalance());
		return balance;
	}

	public boolean submitDeposit(Deposit deposit) {
		
		return BA.Deposit(deposit.getDepositAmount()); 
	}

	public boolean submitWithdrawl(Withdrawl withdrawl) {		 
		return BA.Withdrawl(withdrawl.getWithdrawlAmount());
	}

}
