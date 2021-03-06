package garage.runner;

import vehicles.Garage;
import vehicles.Sports;
import vehicles.Vehicles;
import vehicles.Classics;
import vehicles.Luxury;

public class RunnerVehicles {

	public static void main(String[] args) {
		Vehicles car1 = new Vehicles("Veilside Acura NSX", 40000, true, 1);
		Luxury car2 = new Luxury("Rolls-Royce Wraith", 300000, true, 2, true);
		Classics car3 = new Classics("Mercedes 300SL gullwing", 1500000, true, 3, 1954);
		Sports car4 = new Sports("Koenigsegg Regera", 5000000, true, 4, "5L twin-turbo V8");
		Garage garage = new Garage();
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(car4);
		garage.printVehicle();
		garage.removeVehicleById(2);
		garage.removeVehicleById(3);
		garage.printVehicle();
		garage.clearVehicle();
		garage.printVehicle();
	}	
}
