package com.akhil.singtel.questions;

public class Duck extends Bird {

	public Duck() {
		super("Quack, quack");

	}

	@Override
	public void swim() {
		System.out.println("I am swimming");
	}

}
