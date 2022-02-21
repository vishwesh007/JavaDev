package com.infy.invoice.pdf;

import java.time.LocalDate;

import com.infy.invoice.InvoiceService;

public class PDFInvoice implements InvoiceService {
	public String raiseInvoice(float amount) {
		return "From PDF-Invoice....Invoice raised on: " + 
				LocalDate.now() + " with the amount :" + amount;

	}
}
