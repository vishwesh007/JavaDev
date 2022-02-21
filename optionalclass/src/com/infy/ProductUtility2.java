package com.infy;



import java.util.Optional;

class ProductUtility2 {
    public static void main(String[] args) {
        
	//Product class optional method		
        Product p = new Product(4,"Pen",5.0,10,"ok");
        //    System.out.println(p.getReview().toUpperCase());
        Product p1 = new Product(4,"Pen",5.0,10);
          //    System.out.println(p1.getReview().toUpperCase());
//        if(p1.getReview()!=null){
//            System.out.print(p1.getReview().toUpperCase());
//        }
        if(p.getReview().isPresent())
            System.out.println(p.getReview().get().toUpperCase());
        else
            System.out.println("Product Review is not present");
    }
}
 class Product {
	private Integer id;
	private String name;
	private Double rating;
	private Integer price;
	private String review;

	public Product() {

	}

	public Product(Integer id, String name, Double rating, Integer price, String review) {
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
		this.review = review;
	}

	public Product(int id, String name, double rating, int price) {
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

//	public String getReview() {
//		return review;
//	}

	public Optional<String> getReview(){
		return Optional.ofNullable(review);
		//return Optional.empty();
		//return Optional.of(review);
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return name;
	}
}