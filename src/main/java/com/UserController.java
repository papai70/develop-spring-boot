package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
     
	@RequestMapping("/users")
    public String getAllUsers() {
		System.out.println("rest method called");
        return "hello";
    }
}
