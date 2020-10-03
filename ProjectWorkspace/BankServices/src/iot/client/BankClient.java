package iot.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import iot.services.bank.Bank;
import iot.services.bank.BankService;
import iot.services.bank.PaymentService;

public class BankClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("iot/services/bank/appCtx.xml");
		AnnotationConfigApplicationContext container2 = new AnnotationConfigApplicationContext(AppConfig.class);
		container2.getBean("dfdf");
		System.out.println("Container has started...");
		
		BankService bankService = (BankService) container.getBean("bankService");
		double bal = bankService.getBalance("64563456");
		System.out.printf("balance retrieved from service - %s%n", String.format("%s", bal));
		
		PaymentService paymentService = container.getBean("paymentService", PaymentService.class);
		System.out.printf("Payment call - %b%n", paymentService.makePayment(43434343.34));
		
		Bank bank = container.getBean("bank", Bank.class);
		System.out.println("Bank - "+ bank);
		
		container.close();
		System.out.println("Contaianer has stopped...");

	}

}