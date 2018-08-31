package day1;

import java.util.Scanner;

public class Month {
	public static void main(String [] args ) {
		String input,month=null;
		Scanner in=new Scanner(System.in);
		input=in.nextLine();
		in.close();
		String[] a = input.split(",");
		
		switch (a[1]) {
		case "01":month="January";break;
		case "02":month="Febrauary";break;
		case "03":month="March";break;
		case "04":month="April";break;
		case "05":month="May";break;
		case "06":month="June";break;
		case "07":month="July";break;
		case "08":month="August";break;
		case "09":month="September";break;
		case "10":month="October";break;
		case "11":month="November";break;
		case "12":month="December";break;
		}
		
		
		
		System.out.println(a[0]+"/"+month+"/"+a[2]);
		}

}
