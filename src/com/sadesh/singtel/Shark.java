package com.sadesh.singtel;

public class Shark extends Fish {

	Shark() {
		setColor("Grey");
		setSize("Large");
	}

	Boolean doesSharkEat(Animal animal) {
		if (animal instanceof Fish)
			return true;
		else
			return false;
	}
}
