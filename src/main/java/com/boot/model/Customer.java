package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer",schema="reportgneration")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Customer_Id")
	private int custmerId;
	
	@Column(name="Customer_Name")
	private String customerName;
	
	@Column(name="Contact")
	private String contact;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Email")
	private String email;

	/**
	 * @return the custmerId
	 */
	public int getCustmerId() {
		return custmerId;
	}

	/**
	 * @param custmerId the custmerId to set
	 */
	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custmerId=" + custmerId + ", customerName=" + customerName + ", contact=" + contact
				+ ", address=" + address + ", email=" + email + "]";
	}

	
}