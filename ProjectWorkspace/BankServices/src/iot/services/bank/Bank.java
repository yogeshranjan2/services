package iot.services.bank;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {
	@Value("#{sequenceGenerator.generate()+2000}")
	int id;
	
	@Value("SBI")
	String name;
	
	Map<String, Address> addresses;
	
	@Autowired
	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}
	
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ",  addresses=" + addresses+ "]";
	}

}
