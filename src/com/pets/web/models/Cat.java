package com.pets.web.models;

public class Cat extends Animal implements Pet {
	private String name;
	private String breed;
	private int weigth;
	
	public Cat(String name, String breed, int weigth) {
		super(name, breed, weigth);
		
	}
	
	public String showAffection() {
		return "Have them look at you";
		}
}
