package com.boot.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value = "invoicedetails", method = RequestMethod.POST)
	public InvoiceDetails invoicedetailsadd(@RequestBody InvoiceDetails invoiceDetails) {
		System.err.println("calling InvoiceDetailsControlle.......");
		System.out.println("User :" + invoiceDetails.toString());
		return invoiceDetailsServiceImpl.saveinvoicedetail(invoiceDetails);
	}

}
