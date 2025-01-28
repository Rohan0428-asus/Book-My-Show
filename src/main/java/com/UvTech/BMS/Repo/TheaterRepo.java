package com.UvTech.BMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UvTech.BMS.Model.TheaterEntity;

@Repository
public interface TheaterRepo extends JpaRepository<TheaterEntity, Integer>{

	
}
