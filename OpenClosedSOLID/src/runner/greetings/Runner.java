package runner.greetings;

import GreetExercise.CasualGreeting;
import GreetExercise.FormalGreeting;
import GreetExercise.Greeter;

public class Runner {
	public static void main(String[] args) {
		
		FormalGreeting Formal = new FormalGreeting();
		CasualGreeting Casual = new CasualGreeting();
		
		Greeter fgreeter = new Greeter(Formal);
		Greeter cgreeter = new Greeter(Casual);
		
		System.out.println(fgreeter.greet());
		System.out.println(cgreeter.greet());
	}
}
