package com.infy;


import java.util.Optional;

class ProductUtility3 {
    public static void main(String[] args) {
        Product p = new Product(4,"Pen",5.0,10,"ok");
		Product p1 = new Product(4,"Pen",5.0,10);
		 //flatmap
	    String r1 = Optional.ofNullable(p1).flatMap(prod -> prod.getReview()).orElse("default");
	    
	    System.out.println(r1);
	    //Map
	    System.out.println( Optional.ofNullable(p1).map(Product::getPrice));
	    //Filter
	    System.out.println( Optional.ofNullable(p)
		          .map(Product::getPrice)
		          .filter(prod -> prod >= 10)
		          .filter(prod -> prod <= 15)
		          .isPresent());
    } }
    class Product3 {
	private Integer id;
	private String name;
	private Double rating;
	private Integer price;
	private String review;

	public Product3() {

	}

	public Product3(Integer id, String name, Double rating, Integer price, String review) {
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
		this.review = review;
	}

	public Product3(int id, String name, double rating, int price) {
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Optional<String> getReview() {
		return Optional.ofNullable(review);
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return name;
	}
}
 
        