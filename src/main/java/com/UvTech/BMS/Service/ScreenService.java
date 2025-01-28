package com.UvTech.BMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.BMS.Model.ScreenEntity;
import com.UvTech.BMS.Repo.ScreenRepo;

@Service
public class ScreenService {
	
	@Autowired
	private ScreenRepo screenRepo;
	
	public String addScreen(ScreenEntity screen) {
		screenRepo.save(screen);
		return "Screen added to db...!";
	}
	
	public String deleteScreen(Integer Id) {
		Optional<ScreenEntity> screen = screenRepo.findById(Id);
		
		//validations 
		if(screen.isEmpty()) {
			return "Screen already deleted...!";
		}
		screenRepo.deleteById(Id);
		return "deleted screen...!";
	}
	
	public String getScreen(Integer id) {
		Optional<ScreenEntity> screen = screenRepo.findById(id);
		if(screen.isEmpty()) {
			return "screen with id is not in db.";
		}
		
		return screen.toString();
	}
	
}
