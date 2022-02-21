package com.infy.order;

import java.util.List;

import com.infy.invoice.PDFInvoice;
import com.infy.product.domain.Product;
import com.infy.product.service.ProductService;
import com.infy.product.service.ProductServiceImpl;

public class OrderServiceImpl implements OrderService {

	@Override
	public void viewProducts() {
		ProductService productService = new ProductServiceImpl();
		System.out.println("Products available are::::");
		List<Product> productList = productService.viewProducts();

		System.out.println("********************************************************"
				+ "*****************************************************************************************");
		productList.forEach(product -> System.out.println("prod = "+product));

		System.out.println("*****************************************************"
				+ "*****************************************************************************************");
		System.out.println("\n");
	}

	@Override
	public void placeOrder(int qty, String prodName) {
		ProductService productService = new ProductServiceImpl();
		String message = "";
		int orderId = 1;

		float amount = 0;
		boolean found = false;

		found = productService.validProduct(prodName);

		if(!(found)) {
			message = "Sorry item doesn't exist in our product catalogue!!";
			System.out.println(message);
		}
		else {
			if (qty > 0) {
				amount = productService.addProduct(prodName, qty);
				if (amount > 0) {
					message = "Your OrderId is: " + orderId + ".";
					System.out.println(message);

					String msg = new PDFInvoice().raiseInvoice(amount);
					System.out.println(msg);
				}
			}
			else {
				message = "Qty ordered is not valid!";
				System.out.println(message);
			}
		}

	}
}
