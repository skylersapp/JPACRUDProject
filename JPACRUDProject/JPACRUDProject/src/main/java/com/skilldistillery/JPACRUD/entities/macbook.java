package com.skilldistillery.JPACRUD.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class macbook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int screenSize;

	private int hdCapacity;

	private String color;

	private int year;

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

	@Override
	public String toString() {
		return "macbook [id=" + id + ", screenSize=" + screenSize + ", hdCapacity=" + hdCapacity + ", color=" + color
				+ ", year=" + year + "]";
	}

	public macbook() {
		super();
	}

	public macbook(int id, int screenSize, int hdCapacity, String color, int year) {
		super();
		this.id = id;
		this.screenSize = screenSize;
		this.hdCapacity = hdCapacity;
		this.color = color;
		this.year = year;
	}
	
	
	

}
