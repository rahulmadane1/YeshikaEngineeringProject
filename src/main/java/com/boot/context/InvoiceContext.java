/**
 * 
 */
package com.boot.context;

import java.util.List;

import com.boot.model.Customer;
import com.boot.model.DeliveryChallan;
import com.boot.model.InvoiceDetails;

/**
 * @author Sushant
 *
 */
public class InvoiceContext {
	
	public Customer customer;
	
	public List<InvoiceDetails> invoiceDetailsList;
	
	public List<DeliveryChallan> deliveryChallanList;

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

	@Override
	public String toString() {
		return "InvoiceContext [customer=" + customer + ", invoiceDetailsList=" + invoiceDetailsList
				+ ", deliveryChallan=" + deliveryChallanList + "]";
	}

	
	
	

}
