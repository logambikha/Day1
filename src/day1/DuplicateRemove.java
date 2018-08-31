package day1;

import java.util.Scanner;

public class DuplicateRemove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		input.close();
		String string2 = "";
		
		for(int i=0; i<string.length(); i++) {
			Boolean found = false;
			for(int j=0; j<string2.length(); j++) {
				if(string.charAt(i) == string2.charAt(j)) {
					found = true;
					break;
				}
			}
			if(found == false) {
				//string2 = string2.concat(String.valueOf(string.charAt(i)));
				string2 = string2 + String.valueOf(string.charAt(i));
			}
			
		}		
		System.out.print(string2);
	}

}
