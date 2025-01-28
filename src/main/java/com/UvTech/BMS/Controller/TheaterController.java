package com.UvTech.BMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.BMS.Model.TheaterEntity;
import com.UvTech.BMS.Service.TheaterService;

@RestController
public class TheaterController {

	
	@Autowired
	private TheaterService service;
	
	@PostMapping("/addTheater")
	public String addTheater(@RequestBody TheaterEntity theater) {
		return service.addTheater(theater);
	}
	
	@DeleteMapping("/deleteTheater/{id}")
	public String deleteTheater(@PathVariable Integer id) {
		return service.deleteTheater(id);
	}
	
	@GetMapping("/getTheater/{id}")
	public String getTheater(@PathVariable Integer id){
		return service.getTheater(id);
	}
	
}
