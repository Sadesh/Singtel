package com.sadesh.singtel;

public class SolutionB2 {

	public static void main(String[] args) {
		Shark shark = new Shark();
		ClownFish clownfish = new ClownFish();
		System.out.println("Shark Color:" + shark.getColor());
		System.out.println("Shark Size:" + shark.getSize());
		System.out.println("ClownFish Color:" + clownfish.getColor());
		System.out.println("ClownFish Size:" + clownfish.getSize());
		System.out.println("Clown Fish habbit:" + clownfish.getHabbit());
		System.out.println("Does Shark Eat Dog:" + shark.doesSharkEat(new Dog()));
		System.out.println("Does Shark Eat ClownFish:" + shark.doesSharkEat(new ClownFish()));
	}

}
