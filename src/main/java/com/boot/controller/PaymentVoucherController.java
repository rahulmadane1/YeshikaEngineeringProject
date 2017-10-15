/**
 * 
 */
package com.boot.controller;

import java.io.IOException;
import java.util.Calendar;
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
import com.boot.model.PaymentVoucher;
import com.boot.serviceImpl.PaymentVoucherImpl;
import com.boot.util.ApplicationUtils;
import com.itextpdf.text.DocumentException;

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

	@RequestMapping(value = "generatePaymentVoucher", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
	public void registerUser(@RequestBody InvoiceContext invoiceContext) throws DocumentException, IOException {
		Customer customer = invoiceContext.getCustomer();
		List<PaymentVoucher> paymentVoucherslist = invoiceContext.getPaymentVoucherlist();

		for (PaymentVoucher paymentVoucher : paymentVoucherslist) {
			paymentVoucher.setCustomer(customer);
			paymentVoucherImpl.save(paymentVoucher);
		}

	}

	@RequestMapping(value = "generatePaymentVoucherPDF", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public void generatePaymentVoucherPDF() throws DocumentException, IOException {

		ApplicationUtils.generatePDF(
				"C:\\Users\\Prashant\\git\\YeshikaEngineeringProject\\src\\main\\resources\\public\\views\\paymentVoucher.html",
				"paymentVouscher" + Calendar.getInstance().getTimeInMillis());
	}

}
