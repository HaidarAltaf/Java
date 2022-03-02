package Creatures;

import interfaceSegregation.EggLayingCreature;
import interfaceSegregation.FlyingCreature;

public class Falcon implements FlyingCreature, EggLayingCreature{

	@Override
	public boolean LaysEggs() {
		return true;
	}

	@Override
	public boolean InTheSky() {
		return true;
	}
    
	private String currentLocation;

    private int numberOfEggs;

    public Falcon(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
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
