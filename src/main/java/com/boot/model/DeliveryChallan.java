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
@Table(name="delivery_challen",schema="reportgneration")
public class DeliveryChallan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Delivery_Challan_Id")
	private int deliveryChallanid;;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn (name="CUSTOMER_ID")
	private Customer customer;

	@Column(name="Product")
	private String product;

	@Column(name="Challan_No")
	private int challan_No;
	
	@Column(name="Quantity")
	private int quantity;

	/**
	 * @return the deliveryChallanid
	 */
	public int getDeliveryChallanid() {
		return deliveryChallanid;
	}

	/**
	 * @param deliveryChallanid the deliveryChallanid to set
	 */
	public void setDeliveryChallanid(int deliveryChallanid) {
		this.deliveryChallanid = deliveryChallanid;
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
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the challan_No
	 */
	public int getChallan_No() {
		return challan_No;
	}

	/**
	 * @param challan_No the challan_No to set
	 */
	public void setChallan_No(int challan_No) {
		this.challan_No = challan_No;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	
}