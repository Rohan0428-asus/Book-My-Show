package com.UvTech.BMS.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MovieEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length =500)
	private String movieName;
	private String duration;
	private String releaseDate;
	private List<String> movieCast;
	
	
//	Contructor - with and without arguments
//	getters, setters
//	toString
	
	
	public MovieEntity(String movieName, String duration, String releaseDate, List<String> movieCast) {
		super();
		this.movieName = movieName;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.movieCast = movieCast;
	}
	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<String> getMovieCast() {
		return movieCast;
	}
	public void setMovieCast(List<String> cast) {
		this.movieCast = cast;
	}
	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", movieName=" + movieName + ", duration=" + duration + ", releaseDate="
				+ releaseDate + ", movieCast=" + movieCast + "]";
	}
	
	
	
}
