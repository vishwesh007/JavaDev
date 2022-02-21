module com.infy.order {
	exports com.infy.order.service;
	requires transitive com.infy.product;
	requires transitive com.infy.invoice;
	uses com.infy.invoice.InvoiceService;

	
}