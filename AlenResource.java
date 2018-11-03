package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlenResource {
	
	@RequestMapping("aliens")
	public Alien getMsg() {
		Alien a =  new Alien();
		a.setName("vinod");
		a.setId(101);
		return a;
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/aliens")
	public Alien addMsg(@RequestBody Alien a) {
		System.out.println(a);
		return a;
	}
	

}
