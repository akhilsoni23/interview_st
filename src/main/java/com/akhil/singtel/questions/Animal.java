package com.akhil.singtel.questions;

class Animal implements Sounds {
	void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void sing() {
		throw new RuntimeException("Animals Cannot Sing");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub

	}
}
