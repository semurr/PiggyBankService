package com.bank.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;

import com.bank.model.Balance;
import com.bank.model.Deposit;
import com.bank.model.Withdrawl;

@WebService(targetNamespace = "http://com.bank.ws.service/wsdl")
public interface PiggyBankService {

	@WebMethod
	public Balance getBalance();

	@WebMethod
	public boolean submitDeposit(
			@WebParam(name = "moneyAmount", targetNamespace = "http://com.bank.ws.service/wsdl") Deposit deposit);

	@WebMethod
	public boolean submitWithdrawl(
			@WebParam(name = "moneyAmount", targetNamespace = "http://com.bank.ws.service/wsdl") Withdrawl withdrawl);

}
