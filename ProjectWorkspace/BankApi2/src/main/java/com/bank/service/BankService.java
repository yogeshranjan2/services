package com.bank.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	public Collection<String> getAllBanks() {
		Collection<String> banks = new ArrayList<String>();
		banks.add("SBI");
		banks.add("HDFC");
		return banks;
	}

}
