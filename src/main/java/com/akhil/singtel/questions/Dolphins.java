package com.akhil.singtel.questions;

public class Dolphins implements Movement {
	private final Fish fish;;

	public Dolphins() {
		this.fish = new Fish();
	}

	@Override
	public void walk() {
		fish.walk();
	}

	@Override
	public void swim() {
		fish.swim();

	}

	@Override
	public void fly() {
		fish.fly();

	}

}
