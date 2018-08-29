package com.inapp.firstjava.learn;

class PalindromeRev {
	public static void checkPalindrome(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		if (s.equals(reverse))
			System.out.println("Palindrome");

		else
			System.out.println("Not a palindrome");
	}

	public static void main(String[] args) {
		checkPalindrome("malayalam");
		checkPalindrome("radar");
		checkPalindrome("english");
	}
}
