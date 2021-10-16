package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Purpose  - We have to satisfy all the emails, we have to check enterd email is valid or not
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-09-29
 */

public class EmailValidation {
	public static void main(String[] args) {
		/*
	        this is code for question 2 which satisfies for all emails given to check.
		 */
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(System.in);
		System.out.print("Enter email ID :: ");
		String Email = scanner.next();
		Boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", Email);
		if (answer) {
			System.out.println("Valid Email! Thank you");
		} else {
			System.out.println("Enter valid Email");
		}
	}

}
