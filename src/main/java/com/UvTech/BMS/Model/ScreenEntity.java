package com.UvTech.BMS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ScreenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String screen;
	public ScreenEntity() {
		super();
	}
	public ScreenEntity(Integer id, String screen) {
		super();
		this.screen = screen;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "ScreenEntity [id=" + id + ", screen=" + screen + "]";
	}
	
	
}
