package com.UvTech.BMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UvTech.BMS.Model.SeatsEntity;
import com.UvTech.BMS.Service.SeatsService;

@RestController
public class SeatsController {

	@Autowired
	private SeatsService service;
	
	@PostMapping("/addSeats")
	public String createSeats(@RequestBody SeatsEntity seats) {
		
		return service.addSeats(seats);
	}
	
	@DeleteMapping("/deleteSeats/{id}")
	public String deleteSeats(@PathVariable Integer id) {
		return service.deleteSeats(id);
	}
	
	//standard
	@GetMapping("/getSeats/{id}")
	public String getSeats(@PathVariable Integer id) {
		return service.getSeats(id);
	}
	
	@PutMapping("/updateSeats/{id}/{seats}")
	public String updateSeats(
			@PathVariable Integer id,
			@PathVariable Integer seats) {
		
		SeatsEntity seatsObj = new SeatsEntity();
		seatsObj.setId(id);
		seatsObj.setSeats(seats);
		
		return service.updateSeats(seatsObj);
	}
}
