package com.inapp.firstjava.learn;

public class PalindromeBuilderClass {
	String str="MALAYALAM";
	public static void main(String[] args) {
		PalindromeBuilderClass palindrome =new PalindromeBuilderClass();
		palindrome.printResult();
	}
	public void printResult() {
		
		System.out.println(isPalindrome(str));
	}
	public boolean isPalindrome(String s) {
		boolean checkPalindrome;
		StringBuilder buildName = new StringBuilder(s);
		buildName.reverse();
		checkPalindrome=s.equals(buildName.toString()); //StringBuilder and String not compatible
		return checkPalindrome;
		
	}
}


