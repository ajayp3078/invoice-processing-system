package com.invoiceprocessingsystem.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceprocessingsystem.server.model.Invoice;
import com.invoiceprocessingsystem.server.service.InvoiceService;

@RestController
@CrossOrigin
public class InvoiceController {
	
	@Autowired
	public InvoiceService invoiceService;
	
	@PostMapping("/invoice")
	public Invoice addInvoice(@RequestBody Invoice invoice) {
		return invoiceService.addInvoice(invoice);
	}
	
	@GetMapping("/invoices")
	public List<Invoice> getInvoices() {
		return invoiceService.getInvoices();
	}
	
	@DeleteMapping("/invoices/{id}")
	public Invoice deleteById(@PathVariable String id) {
		return invoiceService.deleteInvoice(Long.parseLong(id));
	}
	
}
