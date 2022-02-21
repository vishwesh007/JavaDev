package com.infy.invoice.htmlinvoice;

import java.time.LocalDate;
import com.infy.invoice.InvoiceService;

public class HTMLInvoice implements InvoiceService {

	@Override
	public String raiseInvoice(float amount) {
		return "From HTML-Invoice....Invoice raised on: " 
				+ LocalDate.now() + " with the amount :" + amount;
	}

}
