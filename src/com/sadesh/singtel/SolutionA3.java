package com.sadesh.singtel;

public class SolutionA3 {
	public static void main(String args[]) {
		Rooster rooster = new Rooster();
		rooster.specialSound();
		System.out.println("Rooster relation to the chicken:" + rooster.getRelationShip(new Chicken()));
	}

}
