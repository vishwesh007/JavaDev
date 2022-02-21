package com.infy.invoice.html;

import java.time.LocalDate;

import com.infy.invoice.InvoiceService;

public class HTMLInvoice implements InvoiceService {
	public String raiseInvoice(float amount) {

		return "From HTML-Invoice....Invoice raised on : "
				+ LocalDate.now() + " with the amount :" + amount;

	}
}
