package com.sadesh.singtel;

public class Caterpillar extends Bird implements Metamorphism {
	Caterpillar() {
		super("Doesn't Make Sound");
		setIsFly(false);

	}

	@Override
	public boolean MetamorphisedFrom(Animal animal) {

		return false;
	}

	@Override
	public boolean MetamorphisedTo(Animal animal) {
		if (animal instanceof ButterFly)
			return true;
		else
			return false;
	}

}
