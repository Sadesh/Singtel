package com.sadesh.singtel;

public class Fish extends Animal {
	String size;
	String color;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	Fish() {
		super("Glub Glub");
		setIsFly(false);
		setIsSwim(true);
		setIsWalk(false);
	}

}
