package com.qa.operators;

public class Results {
	
	public static void main(String[] args) {
		end(146, 25, 79);
		end(111, 138, 93);
		attempt(150, 150, 150); 
		attempt(54, 87, 23);
	}
				
	public static void end(int a, int b, int c) { 
		 int total = a + b + c;
		 System.out.println(("Total score: ") + total + "/450");
		 String percentage = ("Total percentage: ") + (int) (total / 4.5);
		 System.out.println(percentage + "%");
		}
	
	public static void attempt(int a, int b, int c) { 
		String physics = ("Physics: ") + a;
		String biology = ("Biology: ") + b; 
		String chemistry = ("Chemistry: ") + c; 
		int total = a + b + c;
		System.out.println(("Total score: ") + total);
		String percentage = ("Total percentage: ") + (int) (total / 4.5);
		System.out.println(percentage + "%");
	}
 
} 

