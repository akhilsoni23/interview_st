package com.akhil.singtel.questions;

public class Fish implements Movement {

	private final String color, size;

	public Fish() {
		this.color = "White";
		this.size = "Medium";
	}

	protected Fish(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	@Override
	public void swim() {
		System.out.println("I am swimming");
	}

	@Override
	public void walk() {
		throw new RuntimeException("I cannot Walk");

	}

	@Override
	public void fly() {
		throw new RuntimeException("I cannot fly");

	}

	public String getColor() {
		return this.color;
	}

	public String getSize() {
		return this.size;
	}

}
