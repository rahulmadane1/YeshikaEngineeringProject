/**
 * 
 */
package com.boot.context;

import java.util.List;

import com.boot.model.Customer;
import com.boot.model.DeliveryChallan;
import com.boot.model.InvoiceDetails;
import com.boot.model.PaymentVoucher;

/**
 * @author Sushant
 *
 */
public class InvoiceContext {
	
	public Customer customer;
	
	public List<InvoiceDetails> invoiceDetailsList;
	
	public List<DeliveryChallan> deliveryChallanList;
	
	public List<PaymentVoucher> paymentVoucherlist;
	
	

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the invoiceDetailsList
	 */
	public List<InvoiceDetails> getInvoiceDetailsList() {
		return invoiceDetailsList;
	}

	/**
	 * @param invoiceDetailsList the invoiceDetailsList to set
	 */
	public void setInvoiceDetailsList(List<InvoiceDetails> invoiceDetailsList) {
		this.invoiceDetailsList = invoiceDetailsList;
	}

	
	public List<DeliveryChallan> getDeliveryChallan() {
		return deliveryChallanList;
	}

	public void setDeliveryChallan(List<DeliveryChallan> deliveryChallan) {
		this.deliveryChallanList = deliveryChallan;
	}

	
	/**
	 * @return the deliveryChallanList
	 */
	public List<DeliveryChallan> getDeliveryChallanList() {
		return deliveryChallanList;
	}

	/**
	 * @param deliveryChallanList the deliveryChallanList to set
	 */
	public void setDeliveryChallanList(List<DeliveryChallan> deliveryChallanList) {
		this.deliveryChallanList = deliveryChallanList;
	}

	/**
	 * @return the paymentVoucherlist
	 */
	public List<PaymentVoucher> getPaymentVoucherlist() {
		return paymentVoucherlist;
	}

	/**
	 * @param paymentVoucherlist the paymentVoucherlist to set
	 */
	public void setPaymentVoucherlist(List<PaymentVoucher> paymentVoucherlist) {
		this.paymentVoucherlist = paymentVoucherlist;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InvoiceContext [customer=" + customer + ", invoiceDetailsList=" + invoiceDetailsList
				+ ", deliveryChallanList=" + deliveryChallanList + ", paymentVoucherlist=" + paymentVoucherlist + "]";
	}

	
	
	

}
