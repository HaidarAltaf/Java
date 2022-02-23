package com.qa.operators;

public class Arithmetic {

	public static void main(String[] args) {
		addition(13, 15);
		subtraction(54, 34);
		multiplication(4, 87);
		division(3578, 7642608);
		division(7642608, 3578);
	}

	public static void addition(int a, int b) {
		int add = a + b;
		System.out.println(add);
	}

	public static void subtraction(int a, int b) {
		int subtract = a - b;
		System.out.println(subtract);
	}

	public static void multiplication(int a, int b) {
		int multiply = a * b;
		System.out.println(multiply);
	}

	public static double division(double a, double b) {
		double divide = a / b;
			if(a < b || b == 0) {
				System.out.println("Error with calculation");
			}
			else {
				System.out.println("THE CALCULATION MUST BE CORRECT: " + divide);
			}
		return divide;
	}
}
// Task: Calculator revisited 
// Flowcharts (only part 1)
// Unique sums
// Blackjack
// FizzBuzz