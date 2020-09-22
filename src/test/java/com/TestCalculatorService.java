package com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Assertions;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	CalculatorService calc = new CalculatorService();
	
	@Test
	public void testSum() {
		System.out.println("This is Sum method testing");
		Assertions.assertEquals(calc.getSum(), 30);
	}
	
	@Test
	public void testMinus() {
		System.out.println("This is minus method testing");
		Assertions.assertEquals(calc.getMinus("40", "30"), "Minus is:"+10);
	}
	
	@Test
	public void testMessage() {
		System.out.println("This is message method testing");
		Assertions.assertEquals(calc.getMessage("Sarbasree", "Sarkar"), "My name is Sarbasree Sarkar");
	}
}
