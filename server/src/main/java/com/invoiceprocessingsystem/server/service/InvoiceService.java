package com.invoiceprocessingsystem.server.service;

import java.util.List;

import com.invoiceprocessingsystem.server.model.Invoice;

public interface InvoiceService {
	
	public Invoice addInvoice(Invoice invoice);
	
	public List<Invoice> getInvoices();
	
	public Invoice deleteInvoice(Long id);
	
}
