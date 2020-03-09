package com.skilldistillery.jpacrudmacbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Macbook {
	
	//FIELDS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="screen_size")
	private int screenSize;
	
	@Column(name="hd_capacity")
	private int hdCapacity;
	
	private String color;
	
	private int year;
	
	//GETTERS_AND_SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public int getHdCapacity() {
		return hdCapacity;
	}

	public void setHdCapacity(int hdCapacity) {
		this.hdCapacity = hdCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//CONSTRUCTORS

	public Macbook(int id, int screenSize, int hdCapacity, String color, int year) {
		super();
		this.id = id;
		this.screenSize = screenSize;
		this.hdCapacity = hdCapacity;
		this.color = color;
		this.year = year;
	}

	public Macbook() {
		super();
	}
	
	//TOSTRING

	@Override
	public String toString() {
		return "Macbook [id=" + id + ", screenSize=" + screenSize + ", hdCapacity=" + hdCapacity + ", color=" + color
				+ ", year=" + year + "]";
	}
	
	
}
