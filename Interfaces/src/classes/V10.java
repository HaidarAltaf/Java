package classes;

import interfaces.Speed;
import interfaces.Valves;

public class V10 implements Speed, Valves{

	@Override
	public void speed() {
		System.out.println("the speeeeeeeeeeeeeeeeeeeeeeed");
	}

	@Override
	public void numberOf() {
		System.out.println("10");
	}

}
