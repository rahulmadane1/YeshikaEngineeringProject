package com.boot.service;

import java.util.List;

import com.boot.model.InvoiceDetails;


public interface InvoiceDetailsService {
	
	InvoiceDetails findById(Long id);

	InvoiceDetails findByName(String name);

	InvoiceDetails saveinvoicedetail(InvoiceDetails invoiceDetails);

	void updateinvoice(InvoiceDetails invoiceDetails);

	void deleteinvoiceById(Integer id);

	void deleteAllinvoice();

	List<InvoiceDetails> findAllinvoice();

	boolean isinvoiceExist(InvoiceDetails invoiceDetails);

}
