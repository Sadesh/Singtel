package com.sadesh.singtel;

public class SolutionE1 {

	public static void main(String[] args) {
		int flyCount = 0, swimCount = 0, walkCount = 0, speakCount = 0;

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new ButterFly(),
				new Cat(), new Caterpillar() };
		for (Animal animal : animals) {
			if (animal.getIsFly())
				flyCount++;
			if (animal.getIsSwim())
				swimCount++;
			if (animal.getIsWalk())
				walkCount++;
			if (animal.getSpecialSound() != null && !animal.getSpecialSound().equalsIgnoreCase("Doesn't Make Sound"))
				speakCount++;
		}
		System.out.println("FlyCount:" + flyCount);
		System.out.println("SwimCount:" + swimCount);
		System.out.println("WalkCount:" + walkCount);
		System.out.println("SpeakCount:" + speakCount);
	}
}
