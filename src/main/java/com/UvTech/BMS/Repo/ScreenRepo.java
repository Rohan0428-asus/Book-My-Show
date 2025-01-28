package com.UvTech.BMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UvTech.BMS.Model.ScreenEntity;

@Repository
public interface ScreenRepo extends JpaRepository<ScreenEntity, Integer>{
}
