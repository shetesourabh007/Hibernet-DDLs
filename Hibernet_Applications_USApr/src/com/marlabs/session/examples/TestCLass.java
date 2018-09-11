package com.marlabs.session.examples;

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
			Customer1 customer2 = new Customer1();
			customer2.setCustomerId(102);
			customer2.setCustomerName("Aniket");
			customer2.setCustomerEmailId("Sourabh@gmail.com");
			customer2.setCustomerCity("Miraj");
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
			Customer1 customer3 = new Customer1();
			customer3.setCustomerId(customerId);
			// customer3.setCustomerId(customerId);
			iCustomer.removeCustomer(customer3);
			break;
		case "Update":
			Customer1 customer1 = new Customer1();
			customer1.setCustomerId(102);
			customer1.setCustomerName("Aniket");
			customer1.setCustomerEmailId("Aniket@gmail.com");
			customer1.setCustomerCity("Miraj");
			iCustomer.updateCustomer(customer1);
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
