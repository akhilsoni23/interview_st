package com.akhil.singtel.questions;

public class Caterpillar implements Movement, Sounds {

	@Override
	public void sing() {
		throw new RuntimeException("I cannot Sing");

	}

	@Override
	public void say() {
		throw new RuntimeException("I cannot Say");

	}

	@Override
	public void walk() {
		System.out.println("I can crawl");

	}

	@Override
	public void swim() {
		throw new RuntimeException("I cannot Swim");

	}

	@Override
	public void fly() {
		throw new RuntimeException("I cannot Fly");

	}

}
