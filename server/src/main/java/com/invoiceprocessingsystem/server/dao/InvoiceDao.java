package com.invoiceprocessingsystem.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoiceprocessingsystem.server.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice,Long>{
	
}
