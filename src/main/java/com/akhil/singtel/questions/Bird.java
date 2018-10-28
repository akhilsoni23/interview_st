package com.akhil.singtel.questions;

class Bird extends Animal {

	public Bird() {
		super("Queek Qeek");
	}

	protected Bird(String voice) {
		super(voice);
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("Queek Queek Queek");
	}

}