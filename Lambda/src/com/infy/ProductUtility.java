package com.infy;

import java.util.Arrays;
import java.util.List;
public class ProductUtility {
	public static void main(String[] args) {
		List<String> productlst = Arrays.asList("Frock", "Watch", "Shirt", "Violin");
		productlst.sort((String p1, String p2) -> p1.compareTo(p2));
		for (String productName : productlst) {
			System.out.println(productName);
		}
	}
}