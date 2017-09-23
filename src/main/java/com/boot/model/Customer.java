package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Custmerid")
	private Integer CustmerId;
	
	@Column(name="CustName")
	private String CustmerName;
	
	@Column(name="phoneNum")
	private String Phone;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="email")
	private String Email;

	public Integer getCustmerId() {
		return CustmerId;
	}

	public void setCustmerId(Integer custmerId) {
		CustmerId = custmerId;
	}

	public String getCustmerName() {
		return CustmerName;
	}

	public void setCustmerName(String custmerName) {
		CustmerName = custmerName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Customer [CustmerId=" + CustmerId + ", CustmerName=" + CustmerName + ", Phone=" + Phone + ", Address="
				+ Address + ", Email=" + Email + "]";
	}

	
	
}