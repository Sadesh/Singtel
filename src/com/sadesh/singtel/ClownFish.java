package com.sadesh.singtel;

public class ClownFish extends Fish {

	String habbit;

	public String getHabbit() {
		return habbit;
	}

	public void setHabbit(String habbit) {
		this.habbit = habbit;
	}

	ClownFish() {
		setColor("Orange");
		setSize("Small");
		habbit = "Clownfish Makes Joke";
	}

}
