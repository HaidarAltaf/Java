package stringmanipulation;

public class Doggo {
	private String name;
	private String fluffiness;
	private String breed; 
	private boolean isGoodDog;
	private int age;
	
	public Doggo() {}
	
	public Doggo(String name, String fluffiness, String breed, boolean isGoodDog, int age) {
		this.name = name;
		this.fluffiness = fluffiness;
		this.breed = breed;
		this.isGoodDog = isGoodDog;
		this.age = age;
	}
	
	public Doggo(String name, String fluffiness, String breed) {
		this.name = name;
		this.fluffiness = fluffiness;
		this.breed = breed;
	}	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFluffiness() {
		return fluffiness;
	}	
	public void setFluffiness(String fluffiness) {
		this.fluffiness = fluffiness;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isGoodDog() {
		return isGoodDog;
	}
	public void setGoodDog(boolean isGoodDog) {
		this.isGoodDog = isGoodDog;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Doggo name=" + name 
				+ ", fluffiness=" + fluffiness 
				+ ", breed=" + breed 
				+ ", isGoodDog=" + isGoodDog
				+ ", age=" + age;
	}

	
}
