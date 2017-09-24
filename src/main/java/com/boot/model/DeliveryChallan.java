package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delivery_challen",schema="reportgneration")
public class DeliveryChallan {
	
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
	
	@Column(name="InvoiceNo")
	private Long  InvoiceNo;
	
	@Column(name="ItemCode")
	private Long  ItemCode;
	
	@Column(name="PartyChallanNo")
	private Long PartyChallanNo;
	
	@Column(name="PartyChallanDate")
	private String PartyChallanDate;
	
	@Column(name="Qty")
	private Long Qty;
	
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
	public String getPartyChallanDate() {
		return PartyChallanDate;
	}
	public void setPartyChallanDate(String partyChallanDate) {
		PartyChallanDate = partyChallanDate;
	}
	public Long getQty() {
		return Qty;
	}
	public void setQty(Long qty) {
		Qty = qty;
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
		return "Invoice [invoiceid=" + invoiceid + ", CompanyName=" + CompanyName + ", CustId=" + CustId + ", CustName="
				+ CustName + ", SrNo=" + SrNo + ", product=" + product + ", ItemName=" + ItemName + ", InvoiceNo=" + InvoiceNo + ", ItemCode=" + ItemCode + ", PartyChallanNo=" + PartyChallanNo
				+ ", PartyChallanDate=" + PartyChallanDate + ", Qty=" + Qty + ", Paid=" + Paid
				+ ", Total=" + Total + ", InvType=" + InvType + "]";
	}
		
}
