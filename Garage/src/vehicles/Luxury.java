package vehicles;

public class Luxury extends Vehicles{
	private boolean elite;

	public Luxury(String name, double price, boolean running, int id, boolean elite) {
		super(name, price, running, id);
		this.elite = elite;
	}

	public boolean getElite() {
		return this.elite;
	}

	public void setElite(boolean elite) {
		this.elite = elite;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() 
				+ ", Price: " + getPrice() 
				+ ", Runner: " + isRunning() 
				+ ", luxury: " + elite
				+ ", Is Elite: " + getElite()
				+ ", id: " + getId();
	}

	
	}
	

