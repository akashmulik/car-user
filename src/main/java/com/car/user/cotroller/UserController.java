package com.car.user.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.user.entity.User;
import com.car.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	Environment env;
	@Autowired
	UserService us;
	
	@GetMapping("/props")
	public String getProps() {
		return env.getProperty("user.specific");
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User u) {
		return us.save(u);
	}
}
