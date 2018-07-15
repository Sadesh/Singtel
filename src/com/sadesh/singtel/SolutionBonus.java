package com.sadesh.singtel;

public class SolutionBonus {
public static void main(String args[])
{
	Rooster rooster=new Rooster();
	System.out.println("How Rooster sounds in French:"+rooster.getRoosterSoundMap().get("French"));
	System.out.println("How Rooster sounds in German:"+rooster.getRoosterSoundMap().get("German"));
	System.out.println("How Rooster sounds in Tamil:"+rooster.getRoosterSoundMap().get("Tamil"));
	
}
}
