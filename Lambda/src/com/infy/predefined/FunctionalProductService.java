package com.infy.predefined;

import java.util.List;
import java.util.function.Function;

public class FunctionalProductService {
	public static void main(String[] args) {
		List<Product> lst = Product.getProductList();
		for (Product p : lst) {
			int price = computeDiscount(p, p1 -> p1.getPrice() - 100); 
																		
																		
			System.out.println(p.getName() + ": old price: " + p.getPrice() + ", new price: " + price);
		}
	}

	public static int computeDiscount(Product p, Function<Product, Integer> fn) {
		return fn.apply(p);

	}
}