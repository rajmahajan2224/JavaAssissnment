package com.rajkumar.mphasis;

public class Palindrome {
	public static void main(String [] args) {
	 String str = "abcba";
	 boolean flag = true;
	 
	 str = str.toLowerCase();
	 
	 for(int i = 0; i < str.length()/2; i++) {
		 if(str.charAt(i) != str.charAt(str.length()-i-1)) {
			 flag = false;
			 break;
		 }
	 }
	 if(flag) {
		 System.out.println("Palindrome");
	 }
	 else {
		 System.out.println("Not a Palindrome");
	 }
	 
	}
}
