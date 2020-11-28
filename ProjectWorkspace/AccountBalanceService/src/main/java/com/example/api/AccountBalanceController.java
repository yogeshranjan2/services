package com.example.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountBalanceController {
	
	@RequestMapping(path="/health")
	@ResponseBody
	public String index() {
		System.out.println("Inside AccountBalanceController.index()!!");
		return "AccountBalance Api up and running!!";
	}
	
	@RequestMapping(path = "/api/accounts", method = RequestMethod.GET, produces = { "application/json" })
	public Collection<String> getAllAccounts() {
		System.out.println("Inside AccountBalanceController.getAllAccounts()!!");
		Collection<String> _accounts = new  ArrayList<String>();
		_accounts.add("2232");
		_accounts.add("434545");
		return _accounts;
	}

}
