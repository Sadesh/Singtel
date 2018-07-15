package com.sadesh.singtel;

public class SolutionA4 {
	public static void main(String args[])
	{
		Parrot parrot=new Parrot();
		System.out.println("Parrot living with Dogs say:"+parrot.ParrotCopySoundLivingWith(new Dog()));
		System.out.println("Parrot living with Cats say:"+parrot.ParrotCopySoundLivingWith(new Cat()));
		System.out.println("Parrot living with Rooster say:"+parrot.ParrotCopySoundLivingWith(new Rooster()));
		System.out.println("Parrot living with Duck say:"+parrot.ParrotCopySoundLivingWith(new Duck()));
		System.out.println("Parrot living with Phone say:"+parrot.ParrotCopySoundLivingWith(new Phone()));
	}

}
