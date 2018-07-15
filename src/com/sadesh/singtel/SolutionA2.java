package com.sadesh.singtel;

public class SolutionA2 {
public static void main(String args[])
{
	Bird duck=new Duck();
	duck.specialSound();
	System.out.println("Duck Can Swim:"+duck.getIsSwim());
	Bird chicken=new Chicken();
	chicken.specialSound();
	System.out.println("Chicken Can fly:"+chicken.getIsFly());
}
}
