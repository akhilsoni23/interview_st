package com.akhil.singtel.questions;

class Animal implements Sounds, Movement {

	private final String voice;

	public Animal(String voice) {
		this.voice = voice;
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void sing() {
		throw new RuntimeException("Animals Cannot Sing");
	}

	@Override
	public void say() {
		System.out.println(this.voice);

	}

	@Override
	public void swim() {
		throw new RuntimeException("Animals Cannot Swim");

	}

	@Override
	public void fly() {
		throw new RuntimeException("Animals Cannot Fly");

	}
}
