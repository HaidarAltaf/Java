package com.qa.operators;

public class UniqueSum {
	public static void main(String[] args) {
		uni(1, 2, 3);
		uni(2, 2, 2);
		uni(1, 1, 2);
	}
	public static int uni(int a, int b, int c) {
		if(a == b && a != c) {
			System.out.println(a + c);
		}
		else if(a == c && a != b) {
			System.out.println(a + b);
			}
		else if(b == c && b != a) {
			System.out.println(a + b);
		}
		else if(b == a && b != c) {
			System.out.println(c + b);
		}
		else if(a == b && a == c) {
			System.out.println(0);
		}
		else {
			System.out.println(a + b + c);
		}
		return 0;
	}
}
