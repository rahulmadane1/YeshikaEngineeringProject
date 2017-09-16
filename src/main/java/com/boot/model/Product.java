package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")
	private int productid;
	
	@Column(name="CompanyName")
	private String CompanyName;
	
	@Column(name="CustId")
	private String CustId;
	
	@Column(name="CustName")
	private String CustName;
	
	@Column(name="ItemId")
	private Long ItemId;
	
	@Column(name="Rate")
	private Long Rate;
	
	@Column(name="ItemName")
	private String ItemName;
	
	@Column(name="ItemCode")
	private Long ItemCode;
	
	@Column(name="Unit")
	private Long Unit;
	
	@Column(name="OpeningBal")
	private Long OpeningBal;
	
	@Column(name="Specification")
	private String Specification;
	
	@Column(name="Details")
	private String Details;
	
	@Column(name="Status")
	private String Status;
	
	@Column(name="ManComp")
	private String ManComp;
	
	@Column(name="NatOfProc")
	private String NatOfProc;
	
	@Column(name="SuppName")
	private String SuppName;
	
	@Column(name="SuppID")
	private Long SuppID;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
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

	public Long getItemId() {
		return ItemId;
	}

	public void setItemId(Long itemId) {
		ItemId = itemId;
	}

	public Long getRate() {
		return Rate;
	}

	public void setRate(Long rate) {
		Rate = rate;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Long getItemCode() {
		return ItemCode;
	}

	public void setItemCode(Long itemCode) {
		ItemCode = itemCode;
	}

	public Long getUnit() {
		return Unit;
	}

	public void setUnit(Long unit) {
		Unit = unit;
	}

	public Long getOpeningBal() {
		return OpeningBal;
	}

	public void setOpeningBal(Long openingBal) {
		OpeningBal = openingBal;
	}

	public String getSpecification() {
		return Specification;
	}

	public void setSpecification(String specification) {
		Specification = specification;
	}

	public String getDetails() {
		return Details;
	}

	public void setDetails(String details) {
		Details = details;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getManComp() {
		return ManComp;
	}

	public void setManComp(String manComp) {
		ManComp = manComp;
	}

	public String getNatOfProc() {
		return NatOfProc;
	}

	public void setNatOfProc(String natOfProc) {
		NatOfProc = natOfProc;
	}

	public String getSuppName() {
		return SuppName;
	}

	public void setSuppName(String suppName) {
		SuppName = suppName;
	}

	public Long getSuppID() {
		return SuppID;
	}

	public void setSuppID(Long suppID) {
		SuppID = suppID;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", CompanyName=" + CompanyName + ", CustId=" + CustId + ", CustName="
				+ CustName + ", ItemId=" + ItemId + ", Rate=" + Rate + ", ItemName=" + ItemName + ", ItemCode="
				+ ItemCode + ", Unit=" + Unit + ", OpeningBal=" + OpeningBal + ", Specification=" + Specification
				+ ", Details=" + Details + ", Status=" + Status + ", ManComp=" + ManComp + ", NatOfProc=" + NatOfProc
				+ ", SuppName=" + SuppName + ", SuppID=" + SuppID + "]";
	}
	
}