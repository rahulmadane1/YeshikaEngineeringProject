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

import com.boot.model.DeliveryChallan;
import com.boot.serviceImpl.DeliveryChallenServiceImpl;

@RestController
public class DeliveryChallenController {
	
	@Autowired
	DeliveryChallenServiceImpl deliveryChallenServiceImpl;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@RequestMapping(value = "deliveryChallan", method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE)
	public String addDeliveryChallan(@RequestBody List<DeliveryChallan> deliveryChallenList) {
		System.err.println("calling DeliveryChallen Controller.......");
		//System.out.println("User :" + delivery_challen.toString());
		//return deliveryChallenServiceImpl.savedeliverychallen(delivery_challen);
		if (null != deliveryChallenList && !deliveryChallenList.isEmpty()) {
			for (DeliveryChallan deliveryChallan : deliveryChallenList) {
				deliveryChallenServiceImpl.savedeliverychallen(deliveryChallan);
			}
			return "Success";
		}
		return "Failure";
	}

}
