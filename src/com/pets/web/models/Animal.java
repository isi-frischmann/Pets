package com.pets.web.models;

//The abstract class:

public abstract class Animal {
	private String name;
	private String breed;
	private int weigth;
	
//	constructor:
	public Animal(String name, String breed, int weigth) {
		this.name = name;
		this.breed = breed;
		this.weigth = weigth;
	}
	
// getter:
	public String getName() {
		return this.name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public int getWeigth() {
		return this.weigth;
	}
	
//	setter:
	public void setName(String name) {
		name = name;
	}
	
	public void setBreed(String breed) {
		breed = name;
	}
	
	public void setWeigth(String weigth) {
		weigth = weigth;
	}
	
}
