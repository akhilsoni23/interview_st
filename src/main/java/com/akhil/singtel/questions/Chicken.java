package com.akhil.singtel.questions;

public class Chicken extends Bird {

	public Chicken() {
		super("Cluck, cluck");
	}

	protected Chicken(String voice) {
		super(voice);
	}

	@Override
	public void fly() {
		throw new RuntimeException("I cannot fly");

	}
}
