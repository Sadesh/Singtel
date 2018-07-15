package com.sadesh.singtel;

public class SolutionD1 {

	public static void main(String[] args) {
		ButterFly butterFly = new ButterFly();
		System.out.println("ButteFly can Fly:" + butterFly.getIsFly());
		System.out.println("ButteFly sound:" + butterFly.getSpecialSound());
		System.out.println("Butterfly Metamorphised from Cattepillar:"+butterFly.MetamorphisedFrom(new Caterpillar()));
		System.out.println("Butterfly Metamorphised from Dog:"+butterFly.MetamorphisedFrom(new Dog()));
	}

}
