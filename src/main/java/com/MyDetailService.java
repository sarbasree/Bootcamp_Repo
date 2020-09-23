package com;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDetailService {
	
	@RequestMapping(path = "/biodata/{name}/{title}")
	public String getDetails(@PathVariable("name") String name, @PathVariable("title") String title) {

		return String.format("My name is %s %s", name, title);
	}
	
	@RequestMapping(path = "/biodata/roll")
	public String getRoll() {

		return "My roll is "+ 20;
	}
	
	@RequestMapping(path = "/biodata/{age}")
	public String getAge(@PathVariable("age") String age) {

		return String.format("My age is %s", age);
	}
	
	@RequestMapping(path = "/biodata/{clas}/{section}")
	public String getClassDetails(@PathVariable("class") String clas, @PathVariable("section") String section) {

		return String.format("My Class is %s %s", clas, section);
	}
	
	@RequestMapping(path = "/biodata/marks")
	public String getMarks() {

		return String.format("Marks : %s", 90);
	}

}
