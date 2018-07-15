package com.sadesh.singtel;

public class Parrot extends Bird {
	Parrot() {
		super("Screech Screech");
	
	}

	String ParrotCopySoundLivingWith(Thing obj) {
		return obj.getSpecialSound();
	}
}
