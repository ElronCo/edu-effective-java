package test;

public enum Animals {

	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	Animals(String s) {
		this.sound = s;
	}

	public String getSound() {
		return sound;
	}

}
