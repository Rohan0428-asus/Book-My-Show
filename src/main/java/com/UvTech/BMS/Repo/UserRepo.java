package com.UvTech.BMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UvTech.BMS.Model.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
