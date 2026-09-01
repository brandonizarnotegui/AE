package com.algoexpert.strings.green;



//concepts used: iteration with two pointers
public class PalindromeCheck {

	public static void main(String[] args) {
		
		String string = "abba";
		boolean bool = isPalindrome(string);
		System.out.println(bool);
		
	}
	
	
	public static boolean isPalindrome(String str) {
		
		
		int i = 0 ; 
		int rightPointer = str.length()-1;
		
		while ( i <= rightPointer) {
			
			if ( str.charAt(i) == str.charAt(rightPointer)) {
				//do nothing
			}else {
				return false;
			}
			
			rightPointer--;
			i++;
		}
		
		return true;
		
	}
	

}
