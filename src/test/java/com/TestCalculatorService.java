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
	public void testStatic() {
		System.out.println("This is static method testing");
		Assertions.assertEquals(calc.getStaticValue(), 55);
	}
	
	@Test
	public void testDivide() {
		System.out.println("This is devide method testing");
		Assertions.assertEquals(calc.getDivide("40", "20"), "Devide is:"+2);
	}
	
	@Test
	public void testMulti() {
		System.out.println("This is mulyiply method testing");
		Assertions.assertEquals(calc.getMulti("40", "30"), "Multiply is:"+1200);
	}
	
}
