package iot.dao.bank;

import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class BankDAO {
	
	public void save() {
		System.out.println("Inside BankDAO.save()...");
	}
	
	public double getBalance(String acctNumber ) {
		System.out.println("Inside BankDAO.getBalance()...");
		return new Random().nextDouble();
	}

}
