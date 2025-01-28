package com.UvTech.BMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.BMS.Model.UserEntity;
import com.UvTech.BMS.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public String addUser(UserEntity user) {
		userRepo.save(user);
		
		return "Added to db...!";
	}
	
	public String deleteUser(Integer Id) {
		Optional<UserEntity> user = userRepo.findById(Id);
		
		//validations 
		if(user.isEmpty()) {
			return "user already deleted...!";
		}
		userRepo.deleteById(Id);
		return "deleted user...!";
	}
	
	public String getUser(Integer id) {
		Optional<UserEntity> user = userRepo.findById(id);
		if(user.isEmpty()) {
			return "user with id is not in db.";
		}
		
		return user.toString();
	}
	
	
	public String updateUser(UserEntity userObj) {
		userRepo.save(userObj);
		return "user updated successfully.";
	}

}
