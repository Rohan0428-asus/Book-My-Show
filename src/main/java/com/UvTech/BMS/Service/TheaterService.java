package com.UvTech.BMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.BMS.Model.TheaterEntity;
import com.UvTech.BMS.Repo.TheaterRepo;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepo theaterRepo;
	public String addTheater(TheaterEntity theater) {
		theaterRepo.save(theater);
		return "Added to db..";
	}
	
	public String deleteTheater(Integer id) {
       Optional<TheaterEntity> theater = theaterRepo.findById(id);
		
		//validations 
		if(theater.isEmpty()) {
			return "Theater already deleted...!";
		}
		theaterRepo.deleteById(id);
		return "deleted theater...!";
		
	}
	
	
	public String getTheater(Integer id) {
		Optional<TheaterEntity> theater = theaterRepo.findById(id);
		if(theater.isEmpty()) {
			return "Theater with id is not in db.";
		}
		
		return theater.toString();
	}
}
