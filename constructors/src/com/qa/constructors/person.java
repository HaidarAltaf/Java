package com.qa.constructors;

public class person {
	private String fName;
	private String lName;
	private String favFood;
	int age; 
	
	
	//getter - allows "get" information of an attribute from a different class
	public String getfName() {
		return this.fName;
	}
	//setter - allows change of attribute from the other class
	public void setfName(String fName) {
		this.fName = fName; 
	}
	
	//default
	public person() {
		
	}
	//All argument constructor
	public person(String fName, String lName, String favFood, int age) {
		this.fName = fName;
		this.lName = lName;
		this.favFood = favFood;
		this.age = age;
	}
	public person(String fName, String favFood) {
		this.fName = fName;
		this.favFood = favFood;
	}
}
