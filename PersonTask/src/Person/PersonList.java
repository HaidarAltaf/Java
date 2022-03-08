package Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
		List<Person> personList = new ArrayList<>();
		public void add(Person person) {
			personList.add(person);
			System.out.println(person);
		}
		
		public void remove(Person person) {
			personList.remove(person);
			System.out.println("Person removed");
		}
		
		//my attempt
		public void searchByName(Person person) {
			personList.contains(person);
			System.out.println(person);
		}
		
		//loop example
		public Person searchByNameLoop(String name) {
			for(Person p : personList) {
				if(p.getName().equalsIgnoreCase(name)) {
					return p;
				}
			}
			return null;
		}
		
		//stream example
		public void searchByNameStream(String Name) {
			this.personList.stream().forEach(p -> {if(p.getName().equalsIgnoreCase(Name)) System.out.println(p);});
		}
		
		//printing using a stream
		public void printStream() {
			this.personList.stream().forEach(p -> System.out.println(p));
		}
		
		
		
		
		
}
