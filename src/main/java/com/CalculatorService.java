package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

	@GetMapping("/calculator/sum")
	public int getSum() {
		return (10 + 20);
	}

	@GetMapping("/calculator/minus/{a}/{b}")
	public String getMinus(@PathVariable("a") String a, @PathVariable("b") String b) {
		
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		if(i>j){
			return "Minus is:" + (Integer.parseInt(a) - Integer.parseInt(b));
		}
		return "Please enter the bigger value first";
	}
	
	@GetMapping("/calculator/static")
	public int getStaticValue() {
		return 55;
	}
	
	@GetMapping("/calculator/divide/{a}/{b}")
	public String getDivide(@PathVariable("a") String a, @PathVariable("b") String b) {
		
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		if(i>j){
			return "Devide is:" + (Integer.parseInt(a)/ Integer.parseInt(b));
		}
		return "Please enter the bigger value first";
	}
	
	@GetMapping("/calculator/multi/{a}/{b}")
	public String getMulti(@PathVariable("a") String a, @PathVariable("b") String b) {
			return "Multiply is:" + (Integer.parseInt(a) * Integer.parseInt(b));
		
	}

	
}
