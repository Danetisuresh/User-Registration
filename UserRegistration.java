package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Purpose  - As a User need to enter a valid Email ID
 */

public class UserRegistration {


	public static final Scanner scanner = new Scanner(System.in);
	/*
	    Created a method to validate first name
	 */
	public static void validFirstName(){
		System.out.print("Enter the First Name : ");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();
		if (r)
			System.out.println("First name is valid");
		else
			System.out.println("First name is !Invalid");
	}
	/*
	    Created a method to validate last name
	 */
	public static void validLastName(){
		System.out.println("Enter the Last Name");
		String lname = scanner.next();

		String regex1 = "^[A-Z]{1}[a-z]{2,}$";

		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(lname);
		boolean r1 = m1.matches();
		if (r1)
			System.out.println("Last name is Valid");
		else
			System.out.println("Last name is Invalid");
	}
	/*
    Created a method to validate Email Address
	 */
	public static void validEmailId(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Email Address : ");
		String email = scanner.next();
		String regex2 = "^[a-zA-Z]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(email);
		boolean r2 = m2.matches();
		if (r2)
			System.out.println("Email Address is Valid");
		else
			System.out.println("Email Address is Invalid");
	}

}