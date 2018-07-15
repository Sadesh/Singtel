package com.sadesh.singtel;

public class Phone implements Thing {
	String specialSound;

	public String getSpecialSound() {
		return specialSound;
	}

	public void setSpecialSound(String specialSound) {
		this.specialSound = specialSound;
	}
	
	Phone()
	{
		specialSound="Tring Tring";
	}
	
}
