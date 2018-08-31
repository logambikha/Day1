package day1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int input,r,sum=0,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Input:");
		input=in.nextInt();
		temp=input;
		while(input>0){
			r=input%10;
			sum=(sum*10)+r;
			input=input/10;
		}
		in.close();
		if(temp==sum)
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
