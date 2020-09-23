package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMyDetailService {

	MyDetailService det = new MyDetailService();
	@Test
	public void testDetails() {
		System.out.println("This is message method testing");
		Assertions.assertEquals(det.getDetails("Sarbasree", "Sarkar"), "My name is Sarbasree Sarkar");
	}
	
	@Test
	public void testRoll() {
		System.out.println("This is message method testing");
		Assertions.assertEquals(det.getRoll(), "My roll is 20");
	}
	
	@Test
	public void testAge() {
		System.out.println("This is to test Age method");
		Assertions.assertEquals(det.getAge("30"), "My age is 30");
	}
	
	@Test
	public void testClassDetails() {
		System.out.println("This is to test ClassDetails method");
		Assertions.assertEquals(det.getClassDetails("III", "A"), "My Class is III A");
	}
	
	@Test
	public void testMarks() {
		System.out.println("This is to test marks method");
		Assertions.assertEquals(det.getMarks(), "Marks : 90");
	}
}
