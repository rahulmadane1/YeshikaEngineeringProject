package com.boot.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="InvoiceDetails")
public class InvoiceDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoiceid")
	private int invoiceid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn (name="CUSTOMER_ID")
	private Customer customer;
	
	
	@Column(name="Rate")
	private Long Rate;
	

	@Column(name="particular")
	private String particular;
	
	@Column(name="Quantity")
	private Long  quantity;     
	
	@Column(name="challandnum")
	private Long  challandnum;
	
	@Column(name="Amount")
	private Long  Amount;

	/**
	 * @return the invoiceid
	 */
	public int getInvoiceid() {
		return invoiceid;
	}

	/**
	 * @param invoiceid the invoiceid to set
	 */
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
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

	/**
	 * @return the rate
	 */
	public Long getRate() {
		return Rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(Long rate) {
		Rate = rate;
	}

	/**
	 * @return the particular
	 */
	public String getParticular() {
		return particular;
	}

	/**
	 * @param particular the particular to set
	 */
	public void setParticular(String particular) {
		this.particular = particular;
	}

	/**
	 * @return the quantity
	 */
	public Long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the challandnum
	 */
	public Long getChallandnum() {
		return challandnum;
	}

	/**
	 * @param challandnum the challandnum to set
	 */
	public void setChallandnum(Long challandnum) {
		this.challandnum = challandnum;
	}

	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return Amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		Amount = amount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InvoiceDetails [invoiceid=" + invoiceid + ", customer=" + customer + ", Rate=" + Rate + ", particular="
				+ particular + ", quantity=" + quantity + ", challandnum=" + challandnum + ", Amount=" + Amount + "]";
	}


	
	
	

}