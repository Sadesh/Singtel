package com.sadesh.singtel;

import java.util.HashMap;

public class Rooster extends Bird {
	HashMap<String, String> roosterSoundMap;

	public HashMap<String, String> getRoosterSoundMap() {
		return roosterSoundMap;
	}

	public void setRoosterSoundMap(HashMap<String, String> roosterSoundMap) {
		this.roosterSoundMap = roosterSoundMap;
	}

	Rooster() {
		super("Cock-a-doodle-doo");
		setIsFly(false);
		buildRoosterSoundMap();
	}

	private void buildRoosterSoundMap() {
		roosterSoundMap = new HashMap<String, String>();
		roosterSoundMap.put("Danish", "kykyliky");
		roosterSoundMap.put("Dutch", "kukeleku");
		roosterSoundMap.put("Finnish", "kukko kiekuu");
		roosterSoundMap.put("French", "cocorico");
		roosterSoundMap.put("German", "kikeriki");
		roosterSoundMap.put("Greek", "kikiriki");
		roosterSoundMap.put("Hebrew", "coo-koo-ri-koo");
		roosterSoundMap.put("Hungarian", "kukuriku");
		roosterSoundMap.put("Italian", "chicchirichi");
		roosterSoundMap.put("Japanese", "ko-ke-kok-ko-o");
		roosterSoundMap.put("Portuguese", "cucurucu");
		roosterSoundMap.put("Russian", "kukareku");
		roosterSoundMap.put("Swedish", "kuckeliku");
		roosterSoundMap.put("Turkish", "kuk-kurri-kuuu");
		roosterSoundMap.put("Urdu", "kuklooku");
		roosterSoundMap.put("Tamil", "KoKaraKo");

	}

	String getRelationShip(Animal animal) {

		String relationShip = "No Relationship";
		if (animal instanceof Chicken)
			relationShip = "Husband";
		return relationShip;
	}
}
