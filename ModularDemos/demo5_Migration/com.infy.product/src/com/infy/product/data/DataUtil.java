package com.infy.product.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.infy.product.domain.Product;

public class DataUtil {
	static Map<Integer, Product> productMap = new HashMap<>();

	static {
		Product product1 = new Product();
		product1.setProductName("Reynolds Pen");
		product1.setProdId(101);
		product1.setPrice(20);
		product1.setQty(5);
		product1.setTotalPrice(product1.getQty() * product1.getPrice());
		product1.setDescription("Pens");

		Product product2 = new Product();
		product2.setProductName("White Board");
		product2.setProdId(102);
		product2.setPrice(200);
		product2.setQty(5);
		product2.setTotalPrice(product2.getQty() * product2.getPrice());
		product2.setDescription("White Board");

		Product product3 = new Product();
		product3.setProductName("Markers");
		product3.setProdId(103);
		product3.setPrice(100);
		product3.setQty(8);
		product3.setTotalPrice(product3.getQty() * product3.getPrice());
		product3.setDescription("Markers");

		Product product4 = new Product();
		product4.setProductName("Highlighters");
		product4.setProdId(104);
		product4.setPrice(100);

		product4.setQty(7);
		product4.setTotalPrice(product4.getQty() * product4.getPrice());
		product4.setDescription("Highlighters");

		Product product5 = new Product();
		product5.setProductName("Writing Pads");
		product5.setProdId(105);
		product5.setPrice(30);
		product5.setQty(8);
		product5.setTotalPrice(product5.getQty() * product5.getPrice());
		product5.setDescription("Writing Pads");

		productMap.put(product1.getProdId(), product1);
		productMap.put(product2.getProdId(), product2);
		productMap.put(product3.getProdId(), product3);
		productMap.put(product4.getProdId(), product4);
		productMap.put(product5.getProdId(), product5);

	}

	public  static List<Product> getAllProducts() {
		return productMap.values().stream().collect(Collectors.toList());
	}

	public static Product addProduct(Product prod) {
		productMap.put(prod.getProdId(), prod);
		return prod;
	}

	public static boolean validProduct(String prodName) {
		boolean valid=false;
		List<Product> prods=productMap.values().stream().collect(Collectors.toList());
		for(Product prod: prods) {
			if(prod.getProductName().equalsIgnoreCase(prodName)) {
				valid= true;
				break;
			}
		}
		return valid;
	}
	public static Product getProduct(String prodName) {
		Product product=null; 
		List<Product> prods=productMap.values().stream().collect(Collectors.toList());
		for(Product prod: prods) {
			if(prod.getProductName().equalsIgnoreCase(prodName)) {
				product=prod;
			}
		}
		return product;
	}
}
