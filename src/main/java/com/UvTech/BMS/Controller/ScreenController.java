package com.UvTech.BMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.BMS.Model.ScreenEntity;
import com.UvTech.BMS.Service.ScreenService;

@RestController
public class ScreenController {
	
	
	@Autowired
	private ScreenService service;
	
	
	@GetMapping("/house")
	public String house() {
		return "Successfully running the process...!";
	}
	
	@PostMapping("/addScreen")
	public String createScreen(@RequestBody ScreenEntity screen) {
		
		return service.addScreen(screen);
	}
	
	@DeleteMapping("/deleteScreen/{id}")
	public String deleteScreen(@PathVariable Integer id) {
		return service.deleteScreen(id);
	}
	
	//standard
	@GetMapping("/getScreen/{id}")
	public String getScreen(@PathVariable Integer id) {
		return service.getScreen(id);
	}
}