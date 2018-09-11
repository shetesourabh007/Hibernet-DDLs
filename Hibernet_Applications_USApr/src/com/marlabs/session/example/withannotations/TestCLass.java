package com.marlabs.session.example.withannotations;

import java.util.Scanner;

public class TestCLass {
	private static void getUserMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println("1) Save Module");
		System.out.println("2) Load Module");
		System.out.println("3) Remove Module");
		System.out.println("4) Update Module");
		System.out.println("-----------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Choice");
		String userChoice = scanner.next();
		ICustomer iCustomer = new CustomerImpl();
		switch (userChoice) {
		case "Save":
			NewCustomer customer2 = new NewCustomer();
			customer2.setCustomerId(103);
			customer2.setCustomerName("Rahul");
			customer2.setCustomerEmailId("Rahul@gmail.com");
			customer2.setCustomerCity("KM");
			iCustomer.saveCustomer(customer2);
			break;
		case "Load":
			System.out.println("Enter Customer id");
			int customerId = scanner.nextInt();
			iCustomer.getCustomer(customerId);
			break;
		case "Remove":
			System.out.println("Enter Customer id to remove");
			customerId = scanner.nextInt();
			NewCustomer customer3 = new NewCustomer();
			customer3.setCustomerId(customerId);
			// customer3.setCustomerId(customerId);
			iCustomer.removeCustomer(customer3);
			break;
		case "Update":
			NewCustomer newCustomer = new NewCustomer();
			newCustomer.setCustomerId(102);
			newCustomer.setCustomerName("Aniket");
			newCustomer.setCustomerEmailId("Aniket@gmail.com");
			newCustomer.setCustomerCity("Sangli");
			iCustomer.updateCustomer(newCustomer);
			break;
		default:
			System.out.println("Enter Correct Choice");
			break;
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println("I am from main method");
		getUserMenu();
		System.out.println("End of main method");

	}

}
