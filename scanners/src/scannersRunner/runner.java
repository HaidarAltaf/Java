package scannersRunner;

import java.util.Scanner;

import calculator.Calculator;

public class runner {

	public static void main(String[] args) {

		Calculator calc = new Calculator(System.in);
		Scanner scan = new Scanner(System.in);
		boolean maths = true;

//		while (maths) {
//			System.out.println(calc);
//        System.out.println(first - second);
//        System.out.println(first * second);
//        System.out.println(first / second);
//		}
		int arithmetic = 0;
		switch (arithmetic) {
		case 1:
			System.out.println("First Number: ");
			double first = scan.nextDouble();

			scan.nextLine();

			System.out.println("Second number: ");
			double second = scan.nextDouble();
			System.out.println(Calculator.addition(first, second));
			break;
		case 2:
			System.out.println("First Number: ");
			double number = scan.nextDouble();

			scan.nextLine();

			System.out.println("Second number: ");
			double number2 = scan.nextDouble();
			System.out.println(Calculator.subtraction(number, number2));
			break;

		case 3:
			System.out.println("First Number: ");
			double numerical = scan.nextDouble();

			scan.nextLine();

			System.out.println("Second number: ");
			double numerical2 = scan.nextDouble();
			System.out.println(Calculator.multiplication(numerical, numerical2));
			break;
			
		case 4:
			System.out.println("First Number: ");
			double digit = scan.nextDouble();

			scan.nextLine();

			System.out.println("Second number: ");
			double digit2 = scan.nextDouble();
			System.out.println(Calculator.division(digit, digit2));
			break;
		}
	}
}
