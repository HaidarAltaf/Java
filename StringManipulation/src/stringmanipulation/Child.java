package stringmanipulation;

public class Child extends Parent {
	private String HairColour;

	public String getHairColour() {
		return HairColour;
	}

	public void setHairColour(String hairColour) {
		HairColour = hairColour;
	}

	public Child(boolean mistake, String height, String HairColour) {
		super(mistake, height);
		this.HairColour = HairColour;
	}
	
}
