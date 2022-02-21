package com.infy.predefined;

import java.util.Arrays;
import java.util.List;

public class ProductUtilityTraversal {

	public static void main(String[] args) {

		Product frock = new Product(1001, "Frock", 5.0, 100);
		Product watch = new Product(2001, "Watch", 4.9, 600);
		Product shirt = new Product(3001, "Shirt", 4.0, 500);
		Product violin = new Product(4001, "Violin", 3.5, 800);
		List<Product> lst = Arrays.asList(frock, watch, shirt, violin);

		/*for (Product prod : lst) { // Traditional for-each loop
			System.out.println(prod.getName());
		}*/

		lst.forEach(prod -> System.out.println(prod.getName()));
	}
}