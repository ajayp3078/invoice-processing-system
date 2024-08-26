package com.invoiceprocessingsystem.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceprocessingsystem.server.dao.InvoiceDao;
import com.invoiceprocessingsystem.server.model.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService{
	
	@Autowired
	InvoiceDao invoiceDao;
	
	@Override
	public Invoice addInvoice(Invoice invoice) {
		invoiceDao.save(invoice);
		return invoice;
	}

	@Override
	public List<Invoice> getInvoices() {
		return invoiceDao.findAll();
	}

	@Override
	public Invoice deleteInvoice(Long id) {
		Invoice invoice = invoiceDao.findById(id).get();
		invoiceDao.delete(invoice);
		return invoice;
	}



	
	

}
