package Runner;

import Person.Person;
import Person.PersonList;

public class runner {

	public static void main(String[] args) {
		PersonList personList = new PersonList();
		Person person = new Person("John Wick", 57, "Mercenary");
		Person person2 = new Person("Dr. Samuel Hayden", 30, "Helping Doom");
		Person person3 = new Person("Geralt Of Rivia", 97, "Witcher");
		Person person4 = new Person("Yennifer Of Vengerberg", 110, "Sorceress");
		Person person5 = new Person("Wolfgang Amadeus Mozart", 266, "Composer");
		personList.add(person); 
		personList.add(person2); 
		personList.add(person3); 
		personList.add(person4); 
		personList.add(person5); 
		personList.searchByName(person5);
		
	}

}
