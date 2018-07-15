package com.sadesh.singtel;

public class SolutionD2 {

	public static void main(String[] args) {
		Caterpillar caterpillar = new Caterpillar();
		System.out.println("Caterpillar can Fly:" + caterpillar.getIsFly());
		System.out.println("Caterpillar can walk:" + caterpillar.getIsWalk());
		System.out.println("Caterpillar Metamorphised to Cattepillar:" + caterpillar.MetamorphisedTo(new ButterFly()));
		System.out.println("Caterpillar Metamorphised to Dog:" + caterpillar.MetamorphisedTo(new Dog()));

	}

}
