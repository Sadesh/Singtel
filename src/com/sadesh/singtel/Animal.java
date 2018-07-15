package com.sadesh.singtel;

class Animal implements Thing {
	String specialSound;
	Boolean isSwim, isFly, isWalk;

	public Boolean getIsWalk() {
		return isWalk;
	}

	public void setIsWalk(Boolean isWalk) {
		this.isWalk = isWalk;
	}

	public Boolean getIsSwim() {
		return isSwim;
	}

	public void setIsSwim(Boolean isSwim) {
		this.isSwim = isSwim;
	}

	public Boolean getIsFly() {
		return isFly;
	}

	public void setIsFly(Boolean isFly) {
		this.isFly = isFly;
	}

	Animal(String sound) {
		specialSound = sound;
		intializeAnimal();
	}

	private void intializeAnimal() {
		setIsFly(false);
		setIsSwim(false);
		setIsWalk(true);

	}

	Animal() {
		intializeAnimal();
	}

	public String getSpecialSound() {
		return specialSound;
	}

	public void setSpecialSound(String specialSound) {
		this.specialSound = specialSound;
	}

	void walk() {
		System.out.println("I am walking");
	}

	void sing() {
		System.out.println("I am singing");
	}

	void specialSound() {
		System.out.println(specialSound);
	}
}