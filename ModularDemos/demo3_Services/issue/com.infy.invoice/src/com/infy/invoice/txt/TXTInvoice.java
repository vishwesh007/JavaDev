package com.infy.invoice.txt;

import java.time.LocalDate;

import com.infy.invoice.InvoiceService;

public class TXTInvoice implements InvoiceService {
	public String raiseInvoice(float amount) {

		return "From TXT-Invoice....Invoice raised on : "
				+ LocalDate.now() + " with the amount :" + amount;

	}
}
