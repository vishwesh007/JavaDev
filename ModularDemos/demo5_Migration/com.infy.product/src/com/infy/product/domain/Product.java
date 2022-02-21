package com.infy.product.domain;

public class Product {
    private int prodId;
    private String productName;
    private float price;
    private int qty;
    private float totalPrice;
    private String description;

    public String getProductName() {
        return productName;
    }

    public Product(int prodId, String productName, float price, int qty, float totalPrice, String description) {
        this.prodId = prodId;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.description = description;
    }

    public Product() {
    }

 

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    
    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", totalPrice=" + totalPrice +
                ", description='" + description + '\'' +
                '}';
    }
}
