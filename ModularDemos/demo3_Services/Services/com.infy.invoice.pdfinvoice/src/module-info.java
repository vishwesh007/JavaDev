module com.infy.invoice.pdfinvoice {
		requires com.infy.invoice;
		provides com.infy.invoice.InvoiceService 
			with com.infy.invoice.pdfinvoice.PDFInvoice;
}