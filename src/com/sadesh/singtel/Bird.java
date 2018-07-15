package com.sadesh.singtel;

class Bird extends Animal {

	public Bird(String specialSound) {
		super(specialSound);
		intializeBird();

	}

	private void intializeBird() {
		setIsFly(true);
		setIsSwim(false);
		setIsWalk(true);

	}

	public Bird() {
		super("Tweet Tweet");
		intializeBird();
	}

	void fly() {
		System.out.println("I am flying");
	}
}