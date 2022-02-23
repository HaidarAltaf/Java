package com.qa.operators;

public class Flowchart {
	public static void main(String[] args) {
		flow(3, 9, true);
		flow(3, 9, false);
	}

	public static void flow(int a, int b, boolean c) {
		if(c == true) {
			System.out.println(a + b);
		}
		else {
			System.out.println(a * b);
		}				
	}
	
	
	
}
