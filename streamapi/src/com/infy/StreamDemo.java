package com.infy;

import java.util.List;


public class StreamDemo {
	public static void main(String[] args) {
		List<Product> productList = Product.addValues();
		System.out.println("The original list elements:");
		productList.forEach(System.out::println);

		System.out.println("The list after filtering and sorting:");

		// Filter, sort, and print

		productList.stream()
		.filter(p -> p.getPrice() < 1000)
		.sorted((p1,p2) -> p1.getProductName().compareTo(p2.getProductName())) 
		.forEach(System.out::println);
		

	}

}









