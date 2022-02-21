package com.infy;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceProductUtility {
	public static void main(String[] args) {
		List<String> productlst = Arrays.asList("Frock", "Watch", "Shirt", "Violin");
		productlst.sort(String:: compareTo);
		for (String productName : productlst) {
			System.out.println(productName);
		}
	}
}