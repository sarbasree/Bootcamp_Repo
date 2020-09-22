package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

	@GetMapping("/sum")
	public int getSum() {
		return (10 + 20);
	}

	@GetMapping("/minus/{a}/{b}")
	public String getMinus(@PathVariable("a") String a, @PathVariable("b") String b) {
		
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		if(i>j){
			return "Minus is:" + (Integer.parseInt(a) - Integer.parseInt(b));
		}
		return "Please enter the bigger value first";
	}

	@RequestMapping(path = "/biodata/{name}/{title}")
	public String getMessage(@PathVariable("name") String name, @PathVariable("title") String title) {

		return String.format("My name is %s %s", name, title);
	}
}
