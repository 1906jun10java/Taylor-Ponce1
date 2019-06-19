package com.revature.palindrome;

public class RevString {
	public static void main(String[] args) {

		System.out.println("Is it a palindrome ?!" + isPalindrome("senilefelines"));
		System.out.println("what is this reversed "+reverse("lean"));
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

