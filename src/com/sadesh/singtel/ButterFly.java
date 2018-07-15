package com.sadesh.singtel;

public class ButterFly extends Bird implements Metamorphism {
	ButterFly() {
		super("Doesn't Make Sound");
	}

	@Override
	public boolean MetamorphisedFrom(Animal animal) {
		if (animal instanceof Caterpillar)
			return true;
		else
			return false;
	}

	@Override
	public boolean MetamorphisedTo(Animal animal) {

		return false;
	}

}
