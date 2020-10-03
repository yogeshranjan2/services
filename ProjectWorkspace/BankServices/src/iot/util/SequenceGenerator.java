package iot.util;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SequenceGenerator {
	
	public int generate() {
		System.out.println("Inside SequenceGenerator.generate()...");
		return new Random().nextInt();
	}
}
