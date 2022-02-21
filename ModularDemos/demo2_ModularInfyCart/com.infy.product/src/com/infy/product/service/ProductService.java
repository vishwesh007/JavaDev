package com.infy.product.service;

import java.util.List;

import com.infy.product.domain.Product;

public interface ProductService {
    public float addProduct(String prodName, int qty);
    public List<Product> viewProducts();
    public boolean validProduct(String prodName);
  
}
