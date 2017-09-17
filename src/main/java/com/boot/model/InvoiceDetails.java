package com.boot.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InvoiceDetails")
public class InvoiceDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="invoiceid")
	private int invoiceid;
	
	@Column(name="CompanyName")
	private String CompanyName;
	
	@Column(name="CustId")
	private String CustId;
	
	@Column(name="CustName")
	private String CustName;
	
	@Column(name="SrNo")
	private Long  SrNo;
	
	@Column(name="product")
	private String product;
	
	@Column(name="ItemName")
	private String ItemName;
	
	@Column(name="Rate")
	private Long Rate;
	
	@Column(name="InvoiceNo")
	private Long  InvoiceNo;
	
	@Column(name="ItemCode")
	private Long  ItemCode;
	
	@Column(name="PartyChallanNo")
	private Long  PartyChallanNo;
	
	@Column(name="particular")
	private String particular;
	
	@Column(name="PartyChallanDate")
	private Long  PartyChallanDate;  
	
	@Column(name="invoicedate")
	private Date  invoicedate;   
	
	@Column(name="Quantity")
	private Long  quantity;     
	
	@Column(name="challandnum")
	private Long  challandnum;
	
	@Column(name="Amount")
	private Long  Amount;
	
	@Column(name="Paid")
	private Long  Paid;
	
	@Column(name="Total")
	private Long  Total;
	
	@Column(name="InvType")
	private Long  InvType;

	public int getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getCustId() {
		return CustId;
	}

	public void setCustId(String custId) {
		CustId = custId;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public Long getSrNo() {
		return SrNo;
	}

	public void setSrNo(Long srNo) {
		SrNo = srNo;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Long getRate() {
		return Rate;
	}

	public void setRate(Long rate) {
		Rate = rate;
	}

	public Long getInvoiceNo() {
		return InvoiceNo;
	}

	public void setInvoiceNo(Long invoiceNo) {
		InvoiceNo = invoiceNo;
	}

	public Long getItemCode() {
		return ItemCode;
	}

	public void setItemCode(Long itemCode) {
		ItemCode = itemCode;
	}

	public Long getPartyChallanNo() {
		return PartyChallanNo;
	}

	public void setPartyChallanNo(Long partyChallanNo) {
		PartyChallanNo = partyChallanNo;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public Long getPartyChallanDate() {
		return PartyChallanDate;
	}

	public void setPartyChallanDate(Long partyChallanDate) {
		PartyChallanDate = partyChallanDate;
	}

	public Date getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getChallandnum() {
		return challandnum;
	}

	public void setChallandnum(Long challandnum) {
		this.challandnum = challandnum;
	}

	public Long getAmount() {
		return Amount;
	}

	public void setAmount(Long amount) {
		Amount = amount;
	}

	public Long getPaid() {
		return Paid;
	}

	public void setPaid(Long paid) {
		Paid = paid;
	}

	public Long getTotal() {
		return Total;
	}

	public void setTotal(Long total) {
		Total = total;
	}

	public Long getInvType() {
		return InvType;
	}

	public void setInvType(Long invType) {
		InvType = invType;
	}

	@Override
	public String toString() {
		return "InvoiceDetails [invoiceid=" + invoiceid + ", CompanyName=" + CompanyName + ", CustId=" + CustId
				+ ", CustName=" + CustName + ", SrNo=" + SrNo + ", product=" + product + ", ItemName=" + ItemName
				+ ", Rate=" + Rate + ", InvoiceNo=" + InvoiceNo + ", ItemCode=" + ItemCode + ", PartyChallanNo="
				+ PartyChallanNo + ", particular=" + particular + ", PartyChallanDate=" + PartyChallanDate
				+ ", invoicedate=" + invoicedate + ", quantity=" + quantity + ", challandnum=" + challandnum
				+ ", Amount=" + Amount + ", Paid=" + Paid + ", Total=" + Total + ", InvType=" + InvType + "]";
	}
	
	
	

}