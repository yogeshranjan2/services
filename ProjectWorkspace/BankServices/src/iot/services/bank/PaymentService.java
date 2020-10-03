package iot.services.bank;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService implements InitializingBean, DisposableBean{
	
	public PaymentService() {
		System.out.println("Inside PaymentService()...");
	}
	
	public void init() {
		System.out.println("inside PaymentService.init()..");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside PaymentService.afterPropertiesSet()..");
		
	}
	
	public boolean makePayment (double amount) {
		return true;
	}
	
	public void cleanUp() {
		System.out.println("inside PaymentService.cleanUp()...");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("inside PaymentService.destroy()...");
		
	}


}
