package com.UvTech.BMS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.BMS.Model.MovieEntity;
import com.UvTech.BMS.Repo.MovieRepo;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepo movieRepo;

	public String addMovie(MovieEntity movie) {
		movieRepo.save(movie);
		
		return "Movie added to db...!";
	}
	
	public String deleteMovie(Integer Id) {
		Optional<MovieEntity> movie = movieRepo.findById(Id);
		
		//validations 
		if(movie.isEmpty()) {
			return "movie already deleted...!";
		}
		movieRepo.deleteById(Id);
		return "deleted movie...!";
	}
	
	public String getMovie(Integer id) {
		Optional<MovieEntity> movie = movieRepo.findById(id);
		if(movie.isEmpty()) {
			return "movie with id is not in db.";
		}
		
		return movie.toString();
	}
}
