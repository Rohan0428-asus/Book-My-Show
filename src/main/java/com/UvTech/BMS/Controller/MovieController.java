package com.UvTech.BMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.BMS.Model.MovieEntity;
import com.UvTech.BMS.Service.MovieService;

@RestController
public class MovieController {
	
	
	@Autowired
	private MovieService service;
	

	@GetMapping("/home")
	public String home() {
		return "running...!";
	}
	
//	 create project
//	 run project
//	create home method
//	run app 
//	create entity
//	
//	create controlller method
//	create service layer & method
//	create interface repo
//	write code for application.properties
//	
	
	// pathvariable
	//requestparam
	//requestBody
	@PostMapping("/addMovie")
	public String createMovie( @RequestBody MovieEntity movie) {
		
		return service.addMovie(movie);
	}
	
	@DeleteMapping("/deleteMovie/{id}")
	public String deleteMovie(@PathVariable Integer id) {
		return service.deleteMovie(id);
	}
	
	//standard
	@GetMapping("/getMovie/{id}")
	public String getMovie(@PathVariable Integer id) {
		return service.getMovie(id);
	}
}
