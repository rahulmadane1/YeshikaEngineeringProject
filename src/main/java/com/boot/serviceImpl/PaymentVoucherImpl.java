/**
 * 
 */
package com.boot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.PaymentVoucher;
import com.boot.repository.PaymentVoucherRepository;
import com.boot.service.PaymentVoucherService;

/**
 * @author Sushant
 *
 */
@Service
public class PaymentVoucherImpl implements PaymentVoucherService{
	
	@Autowired 
	PaymentVoucherRepository paymentVoucherRepository;
	
	@Override
	public PaymentVoucher save(PaymentVoucher paymentVoucher) {
		
		return paymentVoucherRepository.save(paymentVoucher);
	}

}
