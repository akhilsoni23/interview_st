package com.akhil.singtel.questions;

public class RoasterNoInheritance {
	private final Chicken chicken = new Chicken("Cock-a-doodle-doo");

	public void sing() {
		chicken.sing();
	}

	public void say() {
		chicken.say();
	}
}
