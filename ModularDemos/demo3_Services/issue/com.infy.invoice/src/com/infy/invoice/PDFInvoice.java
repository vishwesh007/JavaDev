package com.infy.invoice;

import java.time.LocalDate;

public class PDFInvoice implements InvoiceService {
	public String raiseInvoice(float amount) {
		return "From PDF-Invoice....Invoice raised on: " + 
				LocalDate.now() + " with the amount :" + amount;

	}
}
