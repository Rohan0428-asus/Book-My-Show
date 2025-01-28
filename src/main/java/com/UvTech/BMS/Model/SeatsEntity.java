package com.UvTech.BMS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SeatsEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer seats;
	public SeatsEntity() {
		super();
	}
	public SeatsEntity(Integer id, Integer seats) {
		super();
		this.id = id;
		this.seats = seats;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "SeatsEntity [id=" + id + ", seats=" + seats + "]";
	}
	
}
