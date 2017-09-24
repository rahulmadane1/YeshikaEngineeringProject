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
import com.boot.model.DeliveryChallan;
import com.boot.serviceImpl.DeliveryChallenServiceImpl;

@RestController
public class DeliveryChallenController {
	
	@Autowired
	DeliveryChallenServiceImpl deliveryChallenServiceImpl;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@RequestMapping(value = "deliveryChallan", method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE)
	public void addDeliveryChallan(@RequestBody InvoiceContext invoiceContext) {
		System.err.println("calling DeliveryChallen Controller.......");
		System.err.println("check list: "+invoiceContext.toString());
		Customer customer=invoiceContext.getCustomer();
		List<DeliveryChallan> deliveryChallanslist=invoiceContext.getDeliveryChallan();
		System.err.println("delivery challan:"+deliveryChallanslist.toString());
		for (DeliveryChallan deliveryChallan : deliveryChallanslist) {
			
			deliveryChallan.setCustomer(customer);
			deliveryChallenServiceImpl.savedeliverychallen(deliveryChallan);
		}
		
	
	
	}

}
