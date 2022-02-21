package com.infy.invoice;

import java.time.LocalDate;

public class HTMLInvoice implements InvoiceService {
	public String raiseInvoice(float amount) {
     
		return "From HTML-Invoice....Invoice raised on : "
				+ LocalDate.now() + " with the amount :" + amount;

	}
}
