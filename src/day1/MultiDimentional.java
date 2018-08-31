package day1;

import java.util.Scanner;

public class MultiDimentional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] array = new int[10][10];
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				array[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter Element to search");
		int k = input.nextInt();
		
		input.close();
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(array[i][j] == k) {
					System.out.println("Found at array[" + (i+1) + "]["+ (j+1) + "]" );
					return;
				}
			}
			
		}
		System.out.println("Not Found" );
		
		
		
		
		
	}

}
