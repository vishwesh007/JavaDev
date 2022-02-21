package com.infy;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int prodId;
	private String productName;
	private double price;
	private int qty;
	private String sellerName;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Product(int prodId, String productName, double price, int qty, String sellerName) {
		super();
		this.prodId = prodId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
		this.sellerName = sellerName;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", productName=" + productName + ", price=" + price + ", qty=" + qty
				+ ", sellerName=" + sellerName + "]";
	}

	public static List<Product> addValues() {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(124, "charger", 900, 3, "Dell"));
		productList.add(new Product(102, "keyboard", 1500, 1, "HP"));
		productList.add(new Product(163, "mouse", 400, 4, "Dell"));
		productList.add(new Product(114, "headphones", 1200, 2, "HP"));
		return productList;
	}

}
