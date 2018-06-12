package com.pets.web.models;

public class Dog extends Animal implements Pet {
	private String name;
	private String breed;
	private int weigth;
	
	public Dog(String name, String breed, int weigth) {
		super(name, breed, weigth);
	}
	
	public String showAffection() {
		if(getWeigth() < 30) {
			return "Hop into your lap";
		}
		else {
			return "Have them curl up next to you";
		}
	}
}
