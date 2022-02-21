package com.infy.client;

import java.util.Scanner;


import com.infy.order.service.OrderService;
import com.infy.order.service.OrderServiceImpl;
import com.infy.product.domain.Product;

public class Client {
	public static void main(String[] args) {
		int choice = 0;
		OrderService orderService = new OrderServiceImpl();

		System.out.println("************************************");
		System.out.println("::Welcome to InfyCart Application::");
		System.out.println("************************************");
		Scanner scanner = new Scanner(System.in);
		try {
			do {
				System.out.println("1. View Products");
				System.out.println("2. Place Order");
				System.out.println("3. Exit");
				System.out.println("Enter your choice::");

				String input = scanner.nextLine();
				choice = convertToInteger(input.trim());

				switch (choice) {
				case 1:
					orderService.viewProducts();
					break;
				case 2:
					System.out.println("Enter the Product Name to buy:");
					String prodName = scanner.nextLine();

					System.out.println("Enter the qty:");
					String strQty = scanner.nextLine();
					
					int qty = convertToInteger(strQty.trim());
					Product product=new Product();
					product.setProductName(prodName);
					orderService.placeOrder(qty, product);
					break;
					
				case 3:
					System.out.println("Exiting the application");
					System.exit(0);
					return;
				default:
					System.out.println("Invalid input!!! Please re-enter choice from our menu");
				}
			} while (choice != 3);
			scanner.close();
		} catch (Exception e) {
			scanner.close();
			e.printStackTrace();
		}
	}

	private static int convertToInteger(String input) {
		try {
			return Integer.valueOf(input);
		} catch (NumberFormatException e) {
			return Integer.MIN_VALUE;
		}
	}
}