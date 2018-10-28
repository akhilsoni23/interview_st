package com.akhil.singtel.questions;

class Bird extends Animal {

	protected final String voice;

	public Bird() {
		this.voice = "";
	}

	protected Bird(String voice) {
		this.voice = voice;
	}

	void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("Queek Queek Queek");
	}

	@Override
	public void say() {
		System.out.println(this.voice);
	}
}