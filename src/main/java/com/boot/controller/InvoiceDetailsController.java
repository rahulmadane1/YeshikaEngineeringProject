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

import com.boot.model.InvoiceDetails;
import com.boot.serviceImpl.InvoiceDetailsServiceImpl;

@RestController
public class InvoiceDetailsController {
	
	@Autowired
	InvoiceDetailsServiceImpl invoiceDetailsServiceImpl;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@RequestMapping(value = "invoicedetailsdata", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public void invoicedetailsadd(@RequestBody List<InvoiceDetails> invoiceDetails) {

		System.err.println("printing list size: "+invoiceDetails.toString());
		for (InvoiceDetails invoiceDetails2 : invoiceDetails) {		
			System.err.println("customer Name:  "+invoiceDetails2.getCustomer().getAddress());
			System.err.println("printing list size:"+invoiceDetails2.getParticular());
			String custoNmae=invoiceDetails2.getCustomer().getCustmerName();
			String custAddr=invoiceDetails2.getCustomer().getAddress();
			
			invoiceDetailsServiceImpl.saveinvoicedetail(invoiceDetails2);
		}
	
	}

}
