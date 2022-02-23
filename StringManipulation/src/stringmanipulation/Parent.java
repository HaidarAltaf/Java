package stringmanipulation;

public class Parent {

	private boolean mistake = false;
	private String height;
	private String EyeColour = "green";

	public Parent(boolean mistake, String height) {
		this.mistake = mistake;
		this.height = height;
	}

	public boolean getMistake() {
		return mistake;
	}

	public void setMistake(boolean mistake) {
		this.mistake = mistake;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getEyeColour() {
		return EyeColour;
	}

	public void setEyeColour(String EyeColour) {
		this.EyeColour = EyeColour;
	}

		public String toString() {
			return "Parent mistake = " + mistake + ", height = " + height + ", eye = " + EyeColour;
		}
		
	
}