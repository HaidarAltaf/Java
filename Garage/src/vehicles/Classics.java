package vehicles;

public class Classics extends Vehicles{
	private int year;
	private double fix;
	

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Classics(String name, double price, boolean running, int id, int year) {
		super(name, price, running, id);
		this.year = year;
	}
	@Override
	public String toString() {
		return "Name: " + getName()
				+ ", Price: " + getPrice() 
				+ ", Runner: " + isRunning() 
				+ ", Classics: year: " + year 
				+ ", Id: " + getId();
	}
	public double getFix() {
		return fix;
	}
	public void setFix(double fix) {
		this.fix = fix;
	}
	
	
	
}
