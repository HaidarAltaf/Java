package classes;

import interfaces.Power;
import interfaces.Speed;
import interfaces.Valves;

public class V8 implements Valves, Speed, Power{

	@Override
	public void power() {
		System.out.println("yes so much power");
		
	}

	@Override
	public void speed() {
		System.out.println("top speed of 250mph");
		
	}

	@Override
	public void numberOf() {
		System.out.println("twin turbo v8");
		
	}

	

}
