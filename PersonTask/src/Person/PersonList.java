package Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
		List<Person> personList = new ArrayList<>();
		public void add(Person person) {
			personList.add(person);
			System.out.println(person);
		}
		public void searchByName(Person person) {
			personList.contains(person);
			System.out.println(person);
		}
		
}
