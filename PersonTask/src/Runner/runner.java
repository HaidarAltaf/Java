package Runner;

import java.util.ArrayList;
import java.util.List;

import Person.Person;
import Person.PersonList;
import Person.Pet;

public class runner {

	public static void main(String[] args) {
		PersonList personList = new PersonList();
//		List<Pet> pets = new ArrayList<>();
//		PetList petList = new PetList();
		
		//PART ONE - NO PETS MY EXAMPLE
		Person person = new Person("John Wick", 57, "Mercenary");
		Person person2 = new Person("Dr. Samuel Hayden", 30, "Helping Doom");
		Person person3 = new Person("Geralt Of Rivia", 97, "Witcher");
		Person person4 = new Person("Yennifer Of Vengerberg", 110, "Sorceress");
		Person person5 = new Person("Wolfgang Amadeus Mozart", 266, "Composer");
		
		//PART TWO - WITH PETS MY EXAMPLE
//		Person person = new Person("John Wick", 57, "Mercenary", "Dog");
//		Person person2 = new Person("Dr Samuel Hayden", 30, "Helping Doom", "Demon");
//		Person person3 = new Person("Geralt Of Rivia", 97, "Witcher", "Lion");
//		Person person4 = new Person("Yennifer Of Vengerberg", 110, "Sorceress", "Crow");
//		Person person5 = new Person("Wolfgang Amadeus Mozart", 266, "Composer", "Cat");
		
//		personList.searchByName(person3);
//		personList.searchByNameLoop("geralt");
//		personList.searchByNameStream("Dr");
//		personList.remove(person2);
		
		//ADDING PETS 
		Pet Dog = new Pet("Dog", "no name", 2, "dog food");
		Pet Demon = new Pet("Ghoul", "Who names a ghoul?", 5346536, "Organic matter");
//		person.addPet(Dog);
//		pets.add(Demon);
//		Person person6 = new Person("one", 53453, "alive", pets);
//		personList.add(person6); 
		
		person.addPet(Dog);
		personList.add(person);
		
		person2.addPet(Demon);
		personList.add(person2); 
		
		personList.add(person3); 
		personList.add(person4); 
		personList.add(person5); 
	}

}
