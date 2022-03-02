package singleResponsibility;

public class Owner {
	private static String Food;
	private static Boolean GivesPets;
	private static Boolean HasInsurance;
	
	public Owner(String Food, Boolean GivesPets, Boolean HasInsurance) {
		this.setFood(Food);
		this.setGivesPets(GivesPets);
		this.setHasInsurance(HasInsurance);
	}

	public static String getFood() {
		return Food;
	}

	public void setFood(String food) {
		Food = food;
	}

	public static Boolean getGivesPets() {
		return GivesPets;
	}

	public void setGivesPets(Boolean givesPets) {
		GivesPets = givesPets;
	}

	public static Boolean getHasInsurance() {
		return HasInsurance;
	}

	public void setHasInsurance(Boolean hasInsurance) {
		HasInsurance = hasInsurance;
	}
	
	
	
}
