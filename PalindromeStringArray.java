package com.inapp.firstjava.learn;

public class PalindromeStringArray {

	public static void main(String args[]) {
		PalindromeStringArray p = new PalindromeStringArray();
		p.checkPalindrome();
	}

	public void checkPalindrome() {
		
		String reversed = "";
		String palindrome = new String("english");
		String arr[] = palindrome.split("");
		for (int i = 0; i < arr.length; i++) {
			reversed = arr[i] + reversed;
		}

		if (palindrome.equals(reversed)) {
			System.out.println( palindrome + " is a palindrome");
		} else {
			System.out.println( palindrome + " is not a palindrome");
		}

	}

}