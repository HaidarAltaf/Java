package Creatures;

import interfaceSegregation.EggLayingCreature;
import interfaceSegregation.ExtinctCreature;

public class Dodo implements ExtinctCreature, EggLayingCreature{

	@Override
	public boolean LaysEggs() {
		return true;
	}

	@Override
	public String gone() {
		return "haha";
	}
	
	private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }


    public void layEggs() {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }
}
