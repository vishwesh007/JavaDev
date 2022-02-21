package com.infy;

import java.util.ArrayList;
import java.util.List;

class SafevarargTester {

	@SafeVarargs
	private final void display(List<String>... products) {

		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		SafevarargTester obj = new SafevarargTester();
		List<String> list = new ArrayList<>();
		list.add("Laptop");
		list.add("iPad");
		obj.display(list);

	}

}
