package com.akhil.singtel.questions;

public class Dolphins implements Movement, Sounds {
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

	@Override
	public void sing() {
		fish.sing();

	}

	@Override
	public void say() {
		System.out.println("Euuuwwww Euuuuwww");

	}

}
