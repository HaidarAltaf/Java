package vehicles;

public class Vehicles {
	
	private String name;
	private double price;
	private boolean running;
	private int id;

	public Vehicles() {}
		
	public Vehicles(String name, double price, boolean running, int id) {
		this.name = name;
		this.price = price;
		this.running = running;
		this.id = id;
	}

	public boolean isRunning() {
		return running;
	}
	public void setRunning(boolean running) {
		this.running = running;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return 	"Name: " + name 
				+ ", Price: " + price 
				+ ", Runner: " + running 
				+ ", Id: " + id;
	}
	
}
