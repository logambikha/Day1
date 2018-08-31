package day1;

import java.util.Scanner;

public class Interest {
	public static void main(String [] args )
	{
		double p,r,t,simple,compound;
		Scanner am=new Scanner(System.in);
		System.out.println("Enter the amount:");
		p=am.nextDouble();
		System.out.println("Enter the rate:");
		r=am.nextDouble();
		System.out.println("Enter the time:");
		t=am.nextDouble();
		simple=p*r*t;
		am.close();
	
		compound=p*Math.pow(1.0+r/100.0, t)-p;
		System.out.println("Simple Interest="+simple);
		System.out.println("compound Interest="+compound);
		
	}


}
