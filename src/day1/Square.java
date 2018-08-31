package day1;

import java.util.Scanner;

public class Square {
	public static void main(String [] args ) {
		int number;
		Scanner in=new Scanner(System.in);
		number=in.nextInt();
		int ans;
		in.close();
		ans=number*number;
		System.out.println(number+"*1="+number+",Square:"+ans);
	}
	

}
