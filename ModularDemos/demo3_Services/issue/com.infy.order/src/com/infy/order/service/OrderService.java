package com.infy.order.service;

import com.infy.product.domain.Product;

public interface OrderService {

	public void viewProducts();

	public void placeOrder(int qty, Product prod);

}