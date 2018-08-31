package day1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Provide M N");
		int m = input.nextInt();
		int n = input.nextInt();
		int[][] array = new int [m][n];
		System.out.println("Enter Numbers");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				array[i][j] = input.nextInt();
			}
		}
		StudentAvg(array);
		SubjectAverage(array);
		input.close();
	}
	
	public static void StudentAvg(int[][] array) {
		int total = 0;
		for(int i=0;  i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				total = total + array[i][j];
			}
			System.out.println("Total of student" + (i+1) +" " + total +" "+ "Average " + (float)total/3);
		}
	}
	
	public static void SubjectAverage(int[][] array) {
		for(int i=0;  i<array[0].length; i++) {
			int total = 0;
			for(int j=0; j<array.length; j++) {
				total = total + array[j][i];
			}
			System.out.println("Subject " + (i+1) +" total " + total +" "+ "Average " + (float)total/3);
		}
	}

}
