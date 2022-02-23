package calculator;

import java.io.InputStream;

public class Calculator {
	
	private Double addition; 
	private Double subtraction;
	private Double multiplication;
	private Double division;
	
	public Calculator(InputStream in) {
		getAddition();
		getSubtraction();
		getMultiplication();
		getDivision();
	}

	public static double addition(double first, double second) {
		double add = first + second;
		System.out.println(add);
		return add;
	}

	public static double subtraction(double a, double b) {
		double subtract = a - b;
		System.out.println(subtract);
		return subtract;
	}

	public static double multiplication(double a, double b) {
		double multiply = a * b;
		System.out.println(multiply);
		return multiply;
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

	public Double getDivision() {
		return division;
	}

	public void setDivision(Double divide) {
		this.division = divide;
	}

	public Double getAddition() {
		return addition;
	}

	public void setAddition(Double addition) {
		this.addition = addition;
	}

	public Double getSubtraction() {
		return subtraction;
	}

	public void setSubtraction(Double subtraction) {
		this.subtraction = subtraction;
	}

	public Double getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(Double multiplication) {
		this.multiplication = multiplication;
	}
}
