package com.qa.runner;

import com.qa.constructors.person;

public class runner {
	public static void main(String[] args) {
		person One = new person();
		person Two = new person("shrek", "legend", "onion", 37);
		person Three = new person("donkey", "dragon"); 
		System.out.println(Two.getfName());
		Two.setfName("puss");
		System.out.println(Two.getfName());
	}
}
