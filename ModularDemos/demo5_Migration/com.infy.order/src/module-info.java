module com.infy.order {
	exports com.infy.order.service;
	requires transitive com.infy.product;
	requires com.infy.invoice;
	requires gson;
	requires java.sql;
	requires slf4j.simple;
	requires slf4j.api;
}