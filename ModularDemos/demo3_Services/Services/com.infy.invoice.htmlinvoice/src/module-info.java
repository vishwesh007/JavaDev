module com.infy.invoice.htmlinvoice {
	requires com.infy.invoice;
	provides com.infy.invoice.InvoiceService 
		with com.infy.invoice.htmlinvoice.HTMLInvoice;
}