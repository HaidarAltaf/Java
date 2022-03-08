package Person;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String Name;
	private int age;
	private String jobTitle;
	private String pet;
	private List<Pet> petList = new ArrayList<>();

	public Person(String name, int age, String jobTitle, List<Pet> petList) {
		super();
		Name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.petList = petList;
	}

	public Person(String Name, int age, String jobTitle) {
		this.Name = Name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
//
//	public Person(String pet) {
//		this.pet = pet;
//	}

//	public Person(String Name, int age, String jobTitle, String pet) {
//		this.Name = Name;
//		this.age = age;
//		this.jobTitle = jobTitle;
//		this.pet = pet;
//	}

	public void addPet(Pet pet) {
		this.petList.add(pet);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

//	public String getPet() {
//		return pet;
//	}
//
//	public void setPet(String pet) {
//		this.pet = pet;
//	}

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

	@Override
	public String toString() {
		return "Name: " + Name 
				+ " Age: " + age 
				+ " Job: " + jobTitle 
				+ " Pet: " + petList 
				+ "\n";
	}
}
