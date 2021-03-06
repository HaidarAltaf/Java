package vehicles;

public class Sports extends Vehicles {
	private String engine;	

	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Sports(String name, double price, boolean running, int id, String engine) {
		super(name, price, running, id);
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Name: " + getName() 
				+ ", Price: " + getPrice()
				+ ", Runner: " + isRunning() 
				+ ", Sports: engine: " + engine 
				+ ", Id: " + getId();
	}
	
	
}
