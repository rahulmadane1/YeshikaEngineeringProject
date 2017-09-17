/**
 * 
 */
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

import com.boot.model.PaymentVoucher;
import com.boot.serviceImpl.PaymentVoucherImpl;

/**
 * @author Sushant
 *
 */

@RestController
public class PaymentVoucherController {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	PaymentVoucherImpl paymentVoucherImpl;
	
	
	@RequestMapping(value = "generatePaymentVoucher", method = RequestMethod.POST,produces = MediaType.TEXT_PLAIN_VALUE)
	public String registerUser(@RequestBody List<PaymentVoucher> paymentVoucherList) {
		
		if(null != paymentVoucherList && !paymentVoucherList.isEmpty()){
			for(PaymentVoucher paymentVoucher : paymentVoucherList){
				System.out.println(paymentVoucher);
				paymentVoucherImpl.save(paymentVoucher);
			}
			return "Success";
		}		
		return "Failure";
	}

}
