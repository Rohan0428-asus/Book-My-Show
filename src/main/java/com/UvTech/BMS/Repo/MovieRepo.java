package com.UvTech.BMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UvTech.BMS.Model.MovieEntity;

@Repository
public interface MovieRepo extends JpaRepository<MovieEntity, Integer>{
	
}
