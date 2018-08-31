package day1;

import java.util.Scanner;

public class CUI {
	public static String userNameDatabase = "user";
	public static String passwordDatabase = "pass";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Username and password");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			String userName = input.nextLine();
			String password = input.nextLine();
			// validate
			if (validateUser(userName, password)) {
				input.close();
				return;
			}
			System.out.println("Attempt " + (i + 1));
		}
		System.out.println("Contact Admin");
		input.close();
	}

	public static Boolean validateUser(String userName, String password) {
		if (userName.equals(userNameDatabase) && password.equals(passwordDatabase)) {
			System.out.println("Welcome " + userName);
			return true;
		}
		return false;
	}
}
