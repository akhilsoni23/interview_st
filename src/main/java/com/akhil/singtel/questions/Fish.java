package com.akhil.singtel.questions;

public class Fish extends Animal {

	private final String color, size;

	public Fish() {
		super("");
		this.color = "White";
		this.size = "Medium";

	}

	protected Fish(String color, String size) {
		super("");
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

	@Override
	public void sing() {
		throw new RuntimeException("I cannot Sing");
	}

	@Override
	public void say() {
		throw new RuntimeException("I cannot Say");
	}

	public String getColor() {
		return this.color;
	}

	public String getSize() {
		return this.size;
	}

}
