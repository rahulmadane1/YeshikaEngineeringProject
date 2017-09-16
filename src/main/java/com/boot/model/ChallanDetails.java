package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChallanDetails")
public class ChallanDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="challanid")
	private int challanid;
	
	@Column(name="CompanyName")
	private String CompanyName;
	
	@Column(name="CustId")
	private String CustId;
	
	@Column(name="PartyChallanNo")
	private Long PartyChallanNo;
	
	@Column(name="CustName")
	private String CustName;
	
	@Column(name="SrNo")
	private Long SrNo;
	
	@Column(name="ItemName")
	private String ItemName;
	
	@Column(name="Qty")
	private Long Qty;
	
	@Column(name="ItemCode")
	private Long ItemCode;
	
	@Column(name="ItemId")
	private Long ItemId;
	
	@Column(name="Balance")
	private Long Balance;
	
	@Column(name="OutQty")
	private Long OutQty;
	
	
	public int getChallanid() {
		return challanid;
	}
	public void setChallanid(int challanid) {
		this.challanid = challanid;
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
	public Long getPartyChallanNo() {
		return PartyChallanNo;
	}
	public void setPartyChallanNo(Long partyChallanNo) {
		PartyChallanNo = partyChallanNo;
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
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Long getQty() {
		return Qty;
	}
	public void setQty(Long qty) {
		Qty = qty;
	}
	public Long getItemCode() {
		return ItemCode;
	}
	public void setItemCode(Long itemCode) {
		ItemCode = itemCode;
	}
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}
	public Long getBalance() {
		return Balance;
	}
	public void setBalance(Long balance) {
		Balance = balance;
	}
	public Long getOutQty() {
		return OutQty;
	}
	public void setOutQty(Long outQty) {
		OutQty = outQty;
	}
	@Override
	public String toString() {
		return "ChallanDetails [challanid=" + challanid + ", CompanyName=" + CompanyName + ", CustId=" + CustId
				+ ", PartyChallanNo=" + PartyChallanNo + ", CustName=" + CustName + ", SrNo=" + SrNo + ", ItemName="
				+ ItemName + ", Qty=" + Qty + ", ItemCode=" + ItemCode + ", ItemId=" + ItemId + ", Balance=" + Balance
				+ ", OutQty=" + OutQty + "]";
	}
}