package ExtentionBuilder;

public class Studio extends Apartment {
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

	public Studio() {
		this.setNumberOfBedrooms(0);
		this.setSquareFootage(200);
	}
//	public Studio() {
//        this.setNumberOfBedrooms(0);
//    }
//
//    @Override
//    public void setSquareFootage(int sqft) {
//        this.setSquareFootage(sqft);
//    }
}
