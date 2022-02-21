module com.infy.order {
	exports com.infy.order.service;
	requires transitive com.infy.product;
	requires com.infy.invoice;
}