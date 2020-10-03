package com.bank.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.service.BankService;

@RestController
public class BankApiController {
	
	@Autowired
	BankService bankService;

	@RequestMapping(path="/health")
	@ResponseBody
	public String index() {
		System.out.println("Inside BankApiController.index()!!");
		return "Bank Api up and running!!";
	}
	
	@RequestMapping(path = "/api/banks", method = RequestMethod.GET, produces = { "application/json" })
	public Collection<String> getAllBanks() {
		System.out.println("Inside BankApiController.getAllBanks()!!");
		return bankService.getAllBanks();
	}
}
	
