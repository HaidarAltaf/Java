package vehicles;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicles> 
	vehicles = new ArrayList<Vehicles>();
	
	public void addVehicle(Vehicles vehicles) {
		this.vehicles.add(vehicles);
	}
	
	public void deleteVehicle(Vehicles vehicle) {
		if(this.vehicles.remove(vehicle)) {
			System.out.println("vehicle removed"); 
			}
		else {
			System.out.println("vehicle not found");
		}
	}
	public void removeVehicleById(int id) {
		Vehicles found = null;
		for(Vehicles v : vehicles) {
			if(v.getId() == id) {
				found = v;
			}
		}
		deleteVehicle(found);
	}
	
	public void sizeVehicle(Vehicles vehicles) {
		this.vehicles.size();
	}
	
	public void clearVehicle() {
		this.vehicles.clear();
			System.out.println("Garage Cleared");
		}
	
	public void printVehicle() {
		for(Vehicles v: this.vehicles) {
			System.out.println(v);
		}
	}
}

