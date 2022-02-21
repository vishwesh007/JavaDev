package com.infy;

import java.util.List;


public class StreamMethods {

	public static void main(String[] args) {

		List<Product> productList = Product.addValues();
		System.out.println("The original elements in list:");
		productList.forEach(System.out::println);
		//Reduce method to find the total product price
		
		double totalPrice = productList.stream().map(p -> {
			return p.getPrice();
		}).reduce(0.0, (p1,p2) -> p1+p2);
		
		System.out.println("The total price is: "+totalPrice);

	}

}







