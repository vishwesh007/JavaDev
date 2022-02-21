package com.infy.product.service;

import java.util.List;

import com.infy.product.DataUtil;
import com.infy.product.domain.Product;

public class ProductServiceImpl implements ProductService {

	public float addProduct(String prodName, int qty) {
		String message = "";
		int availableQty = 0;
		float amount = 0;

		Product product = DataUtil.getProduct(prodName);

		if (product != null) {
			int totalQty = product.getQty();
			availableQty = totalQty - qty;

			if (qty > totalQty) {
				message = "Ordered qty of " + qty + " "+ prodName + " is not available";
				System.out.println(message);

			}

			if (availableQty >= 0) {
				product.setTotalPrice(qty * product.getPrice());
				product.setQty(availableQty);
				Product productRet = DataUtil.addProduct(product);
				message = productRet.getProductName() + " added to the product cart. Now " + productRet.getProductName()
						+ " available is : " + availableQty + ". ";
				System.out.println(message);
				amount = product.getTotalPrice();
			}
		}

		return amount;
	}

	public List<Product> viewProducts() {
		return DataUtil.getAllProducts();
	}

	@Override
	public boolean validProduct(String prodName) {

		return DataUtil.validProduct(prodName);
	}

}
