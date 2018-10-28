package com.akhil.singtel.questions;

public class CountingAnimals {

	private static final Animal[] animals = new Animal[] { new Bird(), new Chicken(), new Duck(), new Parrot(),
			new Rooster(), new Fish(), new ClownFish(), new Sharks()

	};

	public static int countFly() {
		int count = 0;

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			try {
				animal.fly();
				count++;
			} catch (Throwable t) {

			}
		}
		return count;
	}

	public static int countSwim() {
		int count = 0;

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			try {
				animal.swim();
				count++;
			} catch (Throwable t) {

			}
		}
		return count;
	}

	public static int countWalk() {
		int count = 0;

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			try {
				animal.walk();
				count++;
			} catch (Throwable t) {

			}
		}
		return count;
	}

	public static int countSing() {
		int count = 0;

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			try {
				animal.sing();
				count++;
			} catch (Throwable t) {

			}
		}
		return count;
	}

	public static void main(String args[]) {
		System.out.println(countSwim());
	}
}
