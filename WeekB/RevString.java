package com.revature.palindrome;

public class RevString {
	public static void main(String[] args) {

		System.out.println("Is it a palindrome ?!" + isPalindrome("senilefelines"));
		System.out.println("what is this reversed "+reverse("lean"));
		System.out.println("Hey look it's recursion...I think.."+funkyFunction(10));
	}
	public static boolean isPalindrome(String str) {
		boolean pal = false;
		char[] geez = str.toCharArray();

		int x = 0;
		int y = geez.length - 1;

		while (x <= y) {
			if (geez[x] == geez[y]) {
				pal = true;
			} else {
				pal = false;
			}
			x++;
			y--;
		}
		return pal;
	}

	public static String reverse(String str) {
		String retweet = "";
		for (int x = str.length() - 1; x >= 0; x--) {
			retweet += str.charAt(x);
		}
		return retweet;
			}
	}
	public static int funkyFunction(int y) { // recursion method
		if (y == 1 || y == 0) {
			return 1;
		}
		return y * funkyFunction(y - 1); // changed from addition to multiplication or whatever operation 
	
 // recursion will run and will call itself depending on the input given within the method ( 10 ...9...8 etc )
	public static String reverseFunkyFunction(String str, int y) {
		String funky = "";
		funky += str.charAt(y);
	{
			reverseFunkyFunction(funky, y);
		}
		return funky;

	}
}	

