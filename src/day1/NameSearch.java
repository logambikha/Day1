package day1;

import java.util.Scanner;

public class NameSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Names = new String[100];
		int count=0;
		String[] NameH = {"Davea", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		Scanner input = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			Names[i] = input.nextLine();
		}
		
		System.out.println("Enter String to Search");
		String search = input.nextLine();
		
		for(int i=0; i<NameH.length; i++) {
			if(Names[i].equals(search)) {
				count++;
			}
		}
		
		System.out.println(count);
		input.close();
	
	}

}
