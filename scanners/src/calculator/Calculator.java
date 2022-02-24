package calculator;

import java.util.Scanner;

public class Calculator {

	    static float addition(float num1, float num2) {
	        return num1 + num2;
	    }

	    static float subtraction(float num1, float num2) {
	        return num1 - num2;
	    }

	     static float multiplication(float num1, float num2) {
	        return num1 * num2;
	    }

	    static float division(float num1, float num2) {
	        return num1 / num2;
	    }
	

	    Scanner newScanner = new Scanner(System.in);

	    public void menu() {
	        boolean menuOptions = true;
	        String menuNumber = "";
	        float num1;
	        float num2;

	        while (menuOptions) {
	            System.out.println("=".repeat(60));
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("=".repeat(60));
	            System.out.println("0. Exit Program");
	            System.out.println("=".repeat(60));


	            System.out.println("\nPick a number to execute an operation: ");
	            menuNumber = newScanner.nextLine();

	            switch (menuNumber) {
	                case "1":
	                    System.out.println("Enter your first number: ");
	                    num1 = newScanner.nextFloat();
	                    System.out.println("Enter your second number: ");
	                    num2 = newScanner.nextFloat();
	                    newScanner.nextLine();
	                    System.out.print("Answer: ");
	                    System.out.println(Calculator.addition(num1, num2) + "\n");
	                    break;
	                case "2":
	                    System.out.println("Enter your first number: ");
	                    num1 = newScanner.nextFloat();
	                    System.out.println("Enter your second number: ");
	                    num2 = newScanner.nextFloat();
	                    newScanner.nextLine();
	                    System.out.print("Answer: ");
	                    System.out.println(Calculator.subtraction(num1, num2) + "\n");
	                    break;
	                case "3":
	                    System.out.println("Enter your first number: ");
	                    num1 = newScanner.nextFloat();
	                    System.out.println("Enter your second number: ");
	                    num2 = newScanner.nextFloat();
	                    newScanner.nextLine();
	                    System.out.print("Answer: ");
	                    System.out.println(Calculator.multiplication(num1, num2) + "\n");
	                    break;
	                case "4":
	                    System.out.println("Enter your first number: ");
	                    num1 = newScanner.nextFloat();
	                    System.out.println("Enter your second number: ");
	                    num2 = newScanner.nextFloat();
	                    newScanner.nextLine();
	                    System.out.print("Answer: ");
	                    System.out.println(Calculator.division(num1, num2) + "\n");
	                    break;
	                case "0":
	                    menuOptions = false;
	                    System.out.println("Program Ending");
	                    break;
	                default:
	                    System.out.println("\nWrong input, try again.");
	                    break;
	            }
    }
  }
}
