package com.UvTech.BMS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private Integer number;
	public UserEntity() {
		super();
	}
	public UserEntity(String email, Integer number) {
		super();
		this.email = email;
		this.number = number;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", email=" + email + ", number=" + number + "]";
	}

	
}
