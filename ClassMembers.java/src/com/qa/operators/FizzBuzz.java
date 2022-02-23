package com.qa.operators;

public class FizzBuzz {

	public static void main(String[] args) {
		fb(234375);
		fb(200);
		fb(9);
		fb(4252346);
	}

	public static void fb(int a) {
		if(a % 15 == 0) {
			System.out.println("FizzBuzz");
		}
		else if (a % 5 == 0) {
			System.out.println("Buzz");
		}
		else if (a % 3 == 0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println(a);
		}
	}
}
