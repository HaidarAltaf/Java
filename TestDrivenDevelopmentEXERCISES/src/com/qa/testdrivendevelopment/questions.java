package com.qa.testdrivendevelopment;

public class questions {
	public static void main(String[] args) {
		greetingExample("John");
		greetingExample("Matt");
		greetingExample("Angelica");
		sandwichFilling("Olive");
		sandwichFilling("Fridge");
		fizzBuzz(3);
		fizzBuzz(10);
		fizzBuzz(15);
	}
	
	public static String greetingExample(String a) {
		 System.out.println("Hi " +  a);
		 return a;
	}
	
	public static String multiChar(String a) {
			String str = "";

			for (int i = 0; i < a.length(); i++) {
				str = str + String.valueOf(a.charAt(i)) + String.valueOf(a.charAt(i))
						+ String.valueOf(a.charAt(i));
			}

			return str;
}


	
	public static void sandwichFilling(String a) {
	    String reversedString = " ";
	    
	    for(int i = a.length()-1; i>=0; i--){
	      reversedString = reversedString + a.charAt(i);
	    }
	    
	    System.out.print(a);
	    System.out.println(reversedString);
	}
	
	public void evenlySpaced(int a) {
		System.out.println(a);
	}
	
	public void nMid(String a, int b) {
		System.out.println(a + b);
	}
	
	public void endsJava(boolean a) {
		System.out.println(a);
	}
	
	public void superBlock(String a) {
		System.out.println(a);
	}
	
	public void amISearch(String a) {
		System.out.println(a);
	}
	
	public static void fizzBuzz(int a) {
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
	
	public void largest(int a) {
		System.out.println(a);
	}
	
	public void compares(String a, int b) {
		System.out.println(a);
	}
}
