package com.infy.predefined;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateProductUtility {

	public static void main(String[] args) {
		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(2001, "Watch", 4.9, 600);
		Product shirt = new Product(3001, "Shirt", 4.5, 500);
		Product violin = new Product(4001, "Violin", 3.5, 800);
		List<Product> lst = Arrays.asList(frock, watch, shirt, violin);
		System.out.println("Product based on price");
		evaluate(lst, p -> (p.getPrice() > 500));
		System.out.println("Product based on rating");
		evaluate(lst, p -> (p.getRating() > 4));
	}

	public static void evaluate(List<Product> lst, Predicate<Product> predicate) {
		for (Product id : lst) {
			if (predicate.test(id))
				System.out.println(id.getName());
		}
	}
}