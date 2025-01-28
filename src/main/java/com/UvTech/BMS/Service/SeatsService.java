package com.UvTech.BMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.BMS.Model.SeatsEntity;
import com.UvTech.BMS.Repo.SeatsRepo;

@Service
public class SeatsService {
	
	@Autowired
	private SeatsRepo seatsRepo;
	
	public String addSeats(SeatsEntity seats) {
		seatsRepo.save(seats);
		return "Added to db";
	}

	
	public String deleteSeats(Integer Id) {
		Optional<SeatsEntity> seats = seatsRepo.findById(Id);
		
		//validations 
		if(seats.isEmpty()) {
			return "Seats already deleted...!";
		}
		seatsRepo.deleteById(Id);
		return "deleted seats...!";
	}
	
	public String getSeats(Integer id) {
		Optional<SeatsEntity> seats = seatsRepo.findById(id);
		if(seats.isEmpty()) {
			return "seats with id is not in db.";
		}
		
		return seats.toString();
	}
	
	
	public String updateSeats(SeatsEntity seatsObj) {
		seatsRepo.save(seatsObj);
		return "seats updated successfully.";
	}
}
