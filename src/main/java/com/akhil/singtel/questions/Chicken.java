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
		System.out.println("I cannot fly");
	}
}
