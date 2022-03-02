package ExtentionBuilder;

public class Penthouse extends Apartment {
	private int squareFootage;
	private int numberOfBedrooms;

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getSquareFootage() {
		return squareFootage;
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}

	public Penthouse() {
		this.setNumberOfBedrooms(4);
		this.setSquareFootage(360);
	}
//	public Penthouse() {
//        this.setNumberOfBedrooms(4);
//    }
//
//    @Override
//    public void setSquareFootage(int sqft) {
//        this.setSquareFootage(this.getSquareFootage());
//    }
}
