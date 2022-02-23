package com.qa.operators;

public class Blackjack {
	public static void main(String[] args) {
		BlackJack(16, 4); 
		BlackJack(16, 5); 
		BlackJack(16, 6); 
	}
	public static void BlackJack(int a, int b) {
		if(a + b < 21) {
			System.out.println(a + b + " close");
		}
		else if(a + b == 21) {
			System.out.println(a + b + " BLACKJACK");
		}
		else {
			System.out.println(a + b + " Bust");
		}		
	}
	
}
