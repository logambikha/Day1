package day1;

import java.util.Scanner;

public class Search {
	public static void main(String [] args ) {
		int a,flag=0,i=0;
		Scanner in=new Scanner(System.in);
		int x[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; 
		System.out.println("element to be searched:");
		a=in.nextInt();
		in.close();
		for(i=0;i<15;i++)
		{
			if(x[i]==a) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
				
		}
		if(flag==1) {
			System.out.println("Element fount at position:"+(i+1));
		}
		else
			System.out.println("Element not found");
	}

}
