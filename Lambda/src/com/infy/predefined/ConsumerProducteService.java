package com.infy.predefined;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerProducteService {
	public static void main(String[] args) {
		List<Product> lst = Product.getProductList();

		System.out.println("***** Generating Manager Report *****");
		generateReport(lst, p -> System.out
				.println(p.getId() + " : " + p.getName() + " : " + p.getRating() + " : " + p.getPrice()));

		System.out.println("\n***** Generating Customer Report *****");
		generateReport(lst, p -> System.out.println(p.getName() + " : " + p.getRating() + " : " + p.getPrice()));
	}

	public static void generateReport(List<Product> lst, Consumer<Product> consumer) {
		for (Product p : lst) {
			consumer.accept(p);
		}
	}
}