package day1;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String sentence = "Let's take LeetCode contest";
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String[] sent = sentence.split(" ");
		for(int i=0; i<sent.length; i++) {
			String reverse = "";
			for(int j = sent[i].length()-1; j >= 0; j--) {
				reverse = reverse+sent[i].charAt(j);
				 }
			System.out.print(reverse);
			System.out.print(" ");
			
		}
		input.close();	
	}


}
