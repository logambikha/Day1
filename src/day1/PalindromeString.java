package day1;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = new String[100];
		Scanner input = new Scanner(System.in);
		System.out.println("Provide 10 Strings");
		for(int i=0; i<10; i++) {
			strings[i] = input.nextLine(); 	
		}
		input.close();
		
		System.out.println("Sorted Palindromes are ");
		for(int i=0; i<10; i++) {
			if(PalindromCheck(strings[i])) {
				SetAlphabetically(strings[i]);
			}
		}
	}
	
	public static String Reverse(String string) {
		String reverse = "";
		int i=string.length()-1;
		while(i >= 0) {
			reverse = reverse +string.charAt(i);
			i--;
		}
		return reverse;
	}
	
	public static Boolean PalindromCheck(String string) {
		if(string.equals(Reverse(string))) {
			return true;
		}
		return false;
	}
	
	public static char[] SetAlphabetically(String string) {
		char[] str= string.toCharArray();
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str.length-i-1; j++) {
				if(str[j] >str[j+1]) {
					char temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		System.out.println(str);
		return str;
	}

}
