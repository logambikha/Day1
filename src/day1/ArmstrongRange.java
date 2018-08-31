package day1;

import java.util.Scanner;

public class ArmstrongRange {
	public static void main(String [] args ) {
		int num;
		Scanner in=new Scanner(System.in);
		int sum=0,rem,temp;
		num=in.nextInt();
		temp=num;
		in.close();
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(temp==num){
			System.out.println(num + "Amstrong number");
		}
		else {
			System.out.println(num + "Not an amstrong number");
		}
	}

}
