package day1;

import java.util.Scanner;

public class BillDiscount {
	public static void main(String[] args ) {
		   Scanner sc = new Scanner(System.in);
		   float item = sc.nextFloat();
		   sc.close();
		   float disc =(float)(item * 0.35);
		   float newprice = item - disc;
		   System.out.println("disc ="+disc+"newprice"+newprice);
	   }

}
