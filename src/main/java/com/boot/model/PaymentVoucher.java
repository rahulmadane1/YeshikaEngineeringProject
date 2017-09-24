/**
 * 
 */
package com.boot.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Sushant
 *
 */

@Entity
@Table(name="PaymentVoucher",schema="reportgneration")
public class PaymentVoucher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PaymentVoucherId")	
    private	Integer paymentVoucherId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn (name="CUSTOMER_ID")
	private Customer customer;
	
	
	@Column(name="PRODUCT_DESC")
	private String product_desc;
	
	@Column(name="HCS_ACS")
	private String hcs_Acs;
	
	@Column(name="TAXABLE_VALUE")
	private BigDecimal taxable_value;
	
	@Column(name="GST")
	private int gst;
	
	@Column(name="TOTAL_AMOUNT")
	private BigDecimal total_amount;
	
	
	
	/**
	 * @return the product_desc
	 */
	public String getProduct_desc() {
		return product_desc;
	}
	/**
	 * @param product_desc the product_desc to set
	 */
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	/**
	 * @return the hcs_Acs
	 */
	public String getHcs_Acs() {
		return hcs_Acs;
	}
	/**
	 * @param hcs_Acs the hcs_Acs to set
	 */
	public void setHcs_Acs(String hcs_Acs) {
		this.hcs_Acs = hcs_Acs;
	}
	/**
	 * @return the taxable_value
	 */
	public BigDecimal getTaxable_value() {
		return taxable_value;
	}
	/**
	 * @param taxable_value the taxable_value to set
	 */
	public void setTaxable_value(BigDecimal taxable_value) {
		this.taxable_value = taxable_value;
	}
	/**
	 * @return the gst
	 */
	public int getGst() {
		return gst;
	}
	/**
	 * @param gst the gst to set
	 */
	public void setGst(int gst) {
		this.gst = gst;
	}
	/**
	 * @return the total_amount
	 */
	public BigDecimal getTotal_amount() {
		return total_amount;
	}
	/**
	 * @param total_amount the total_amount to set
	 */
	public void setTotal_amount(BigDecimal total_amount) {
		this.total_amount = total_amount;
	}
	
	/**
	 * @return the paymentVoucherId
	 */
	public Integer getPaymentVoucherId() {
		return paymentVoucherId;
	}
	/**
	 * @param paymentVoucherId the paymentVoucherId to set
	 */
	public void setPaymentVoucherId(Integer paymentVoucherId) {
		this.paymentVoucherId = paymentVoucherId;
	}
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentVoucher [paymentVoucherId=" + paymentVoucherId + ", customer=" + customer + ", product_desc="
				+ product_desc + ", hcs_Acs=" + hcs_Acs + ", taxable_value=" + taxable_value + ", gst=" + gst
				+ ", total_amount=" + total_amount + "]";
	}
	
	
	
}
