package iot.services.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import iot.dao.bank.BankDAO;

public class BankService {
	
	private String protocol;
	
	@Autowired
	BankDAO bankDAO;

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public BankService() {
		System.out.println("Inside BankService()...");
	}
	
	public BankService(BankDAO bankDAO) {
		this.bankDAO = bankDAO;
		System.out.println("Inside BankService()...");
	}
	
	public void init() {
		System.out.println("inside BankService.init()..");
	}
	
	public double getBalance (String bankAccountNumber) {
		System.out.printf("message protocol is %s%n", protocol);
		//return 123456.50;
		return bankDAO.getBalance(bankAccountNumber);
	}
	
	public void cleanUp() {
		System.out.println("inside BankService.cleanUp()...");
	}

}
