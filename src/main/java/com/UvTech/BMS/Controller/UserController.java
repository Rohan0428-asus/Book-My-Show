package com.UvTech.BMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.BMS.Model.UserEntity;
import com.UvTech.BMS.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/addUser")
	public String createUser(@RequestBody UserEntity user) {
		
		return service.addUser(user);
		
	}
	
	//standard
	@GetMapping("/getUser/{id}")
	public String getUser(@PathVariable Integer id) {
		return service.getUser(id);
	}
	
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Integer id) {
		return service.deleteUser(id);
	}
	
	
	@PutMapping("/updateUser/{id}/{email}/{number}")
	public String updateUser(
			@PathVariable Integer id,
			@PathVariable String email,
			@PathVariable Integer number) {
		
		UserEntity userObj = new UserEntity();
		userObj.setId(id);
		userObj.setEmail(email);
		userObj.setNumber(number);
		
		return service.updateUser(userObj);
	}
}
