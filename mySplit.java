package com.rajkumar.mphasis;

public class mySplit {
	static int count = 0;
	static int first = 0;
	static int j = 0;
	
	public static void main(String [] args) {
		String str = "Raj Mahajan";
		int size = 0;
		
		for(int i = 0; i <= str.length(); i++) {
			if(str.charAt(i) == ' ') {
				size++;
			}
			
		}
		
		String[] last = new String[size + 1];
		
		for(int k = 0; k <= str.length(); k++) {
			int temp = str.length();
			
			if(k == str.length() - 1) {
				last[j] = str.substring(first, k+1);
			}
			
			if(str.charAt(k) == ' ') {
				last[j] = str.substring(first, k);
				j++;
				first = k + 1;
			}
		}
		for (String str1 : last) {
			System.out.println(str1);
		}
	}
}
