package com.boot.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.context.InvoiceContext;
import com.boot.model.Customer;
import com.boot.model.InvoiceDetails;
import com.boot.serviceImpl.InvoiceDetailsServiceImpl;

@RestController
public class InvoiceDetailsController {
	
	@Autowired
	InvoiceDetailsServiceImpl invoiceDetailsServiceImpl;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@RequestMapping(value = "invoicedetailsdata", method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE)
	public void invoicedetailsadd(@RequestBody InvoiceContext invoiceContext) {
		System.err.println("printing list invoice details: "+invoiceContext.invoiceDetailsList);
		System.err.println("printing list customer: "+invoiceContext.customer);
		
		List<InvoiceDetails> invoiceDetails=invoiceContext.getInvoiceDetailsList();
		System.err.println(invoiceDetails.size());	
		Customer customer=invoiceContext.getCustomer();
        for (InvoiceDetails invoiceDetails2 : invoiceDetails) {	
			
        	invoiceDetails2.setCustomer(customer);
			invoiceDetailsServiceImpl.saveinvoicedetail(invoiceDetails2);
		}
		
		
		
	
	}

}
