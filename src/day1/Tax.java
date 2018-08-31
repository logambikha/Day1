package day1;

import java.util.Scanner;

public class Tax {
	public static void main (String [] args ) {
		int amount;
		double tax=0,temp;
		Scanner in=new Scanner(System.in);
		amount=in.nextInt();
		in.close();
		if(amount>0 && amount<=180000) {
			System.out.println("Tax is Nil");
		}
		else if(amount>180000 && amount<=300000) {
			temp=amount;
			tax=(temp-180000)*0.1;
		}
		else if(amount>300000 && amount<500000) {
			temp=amount;
			tax=(temp-300000)*0.2+(120000*0.1);
		}
		else if(amount>500000 && amount<1000000) {
			temp=amount;
			tax=(temp-500000)*0.3+(200000*0.2)+(120000*0.1);
		}
		System.out.println("Tax amount :" +tax);}


}
