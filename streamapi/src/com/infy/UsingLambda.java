package com.infy;

import java.util.ArrayList;
import java.util.List;

public class UsingLambda {

	public static void main(String[] args) {
		
		List<Product> productList = Product.addValues();
		
		System.out.println("Product list before filtering and sorting:");
		productList.forEach(System.out::println);
		
		System.out.println("Product list after filtering and sorting:");
		
		List<Product> filteredList = new ArrayList<>();
		
		for (Product p : productList) {
			if (p.getPrice() < 1000) {
				filteredList.add(p);
			}
		}
		
		filteredList.sort((p1,p2) -> p1.getProductName().compareTo(p2.getProductName()));
		filteredList.forEach(p -> System.out.println(p));
		
	}

}









