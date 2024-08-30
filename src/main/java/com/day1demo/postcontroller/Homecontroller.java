package com.day1demo.postcontroller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day1demo.dto.Users;
@RestController
public class Homecontroller {
	@PostMapping("/save")
	public String saveUsersData(@RequestBody Users users) {
		if(users.getUsername().equals("siva")) {
			return"valid usersname";
		}
		if(users.getEmail().equals("siva@gmail.com")) {
			return"vaild email id";
		}
		return"invalid usersname";
	
		
	}
	
	

	

}
