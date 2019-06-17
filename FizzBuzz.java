package com.revature.fizzbuzz;

import java.util.ArrayList;

//import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int t = 1; t <= 100; t++) {
			if (t % 15 == 0) {
				System.out.println("fizzbuzz!");
			} else if (t % 3 == 0) {
				System.out.println("fizz!");
			} else if (t % 5 == 0) {
				System.out.println("Buzz!");
			} else {
				System.out.println(String.valueOf(t));
			}
		}

	}
public void fizzBuzzAdvanced() {
	int	First = 1;
	int	Second = 100;
		ArrayList<int[]> ar1= new ArrayList<int[]>();
		int a1[]= {100} ;
		ar1.add(1,a1);
		System.out.println("Arraylist contains:" + ar1.get(0));
		}
}

