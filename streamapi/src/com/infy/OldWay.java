package com.infy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OldWay {

	public static void main(String[] args) {
		
		List<Product> productList = Product.addValues();
		
		System.out.println("Product list before filtering and sorting:");
		for(Product p:productList) {
			System.out.println(p);
		}
		
		System.out.println("Product list after filtering and sorting:");
		
		List<Product> filteredList = new ArrayList<>();		
		for(Product p:productList) {
			if(p.getPrice()<1000) {
				filteredList.add(p);
			}
		}
		Collections.sort(filteredList , new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getProductName().compareTo(p2.getProductName());
			}
			});

		for(Product p:filteredList) {
			System.out.println(p);
		}

	}

}




