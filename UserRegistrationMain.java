package com.bridgelabz;
import java.util.Scanner;
/**
 * Purpose  - As a User need to enter a valid First Name
 */

public class UserRegistrationMain {


	public static void welcome(){
		System.out.println("Welcome to User Registration System Problem");
	}
	public static void main(String[] args) {
		welcome();
		UserRegistration user = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 : to validate First Name ");
		switch (scanner.nextInt()){
		case 1:
			UserRegistration.validFirstName();
			break;
		}
	}

}
