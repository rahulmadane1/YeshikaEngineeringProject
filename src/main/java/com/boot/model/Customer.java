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
	@Column(name="CompanyName")
	private String CompanyName;
	
	@Column(name="CustType")
	private String CustType;
	
	@Column(name="CustId")
	private int CustId;
	
	@Column(name="PartyCode")
	private Long PartyCode;
	
	@Column(name="CustName")
	private String CustName;
	
	@Column(name="Add1")
	private String Add1;
	
	@Column(name="PhoneOffice1")
	private String PhoneOffice1;
	
	@Column(name="User")
	private String User;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="VATApply")
	private String VATApply;
	
	@Column(name="VATPer")
	private String VATPer;
	
	@Column(name="PONo")
	private Long  PONo;
	
	@Column(name="VendorCode")
	private Long  VendorCode;
	
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCustType() {
		return CustType;
	}
	public void setCustType(String custType) {
		CustType = custType;
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public Long getPartyCode() {
		return PartyCode;
	}
	public void setPartyCode(Long partyCode) {
		PartyCode = partyCode;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getAdd1() {
		return Add1;
	}
	public void setAdd1(String add1) {
		Add1 = add1;
	}
	public String getPhoneOffice1() {
		return PhoneOffice1;
	}
	public void setPhoneOffice1(String phoneOffice1) {
		PhoneOffice1 = phoneOffice1;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getVATApply() {
		return VATApply;
	}
	public void setVATApply(String vATApply) {
		VATApply = vATApply;
	}
	public String getVATPer() {
		return VATPer;
	}
	public void setVATPer(String vATPer) {
		VATPer = vATPer;
	}
	public Long getPONo() {
		return PONo;
	}
	public void setPONo(Long pONo) {
		PONo = pONo;
	}
	public Long getVendorCode() {
		return VendorCode;
	}
	public void setVendorCode(Long vendorCode) {
		VendorCode = vendorCode;
	}
	@Override
	public String toString() {
		return "Customer [CompanyName=" + CompanyName + ", CustType=" + CustType + ", CustId=" + CustId + ", PartyCode="
				+ PartyCode + ", CustName=" + CustName + ", Add1=" + Add1 + ", PhoneOffice1=" + PhoneOffice1 + ", User="
				+ User + ", Status=" + Status + ", VATApply=" + VATApply + ", VATPer=" + VATPer + ", PONo=" + PONo
				+ ", VendorCode=" + VendorCode + "]";
	}
		
}
