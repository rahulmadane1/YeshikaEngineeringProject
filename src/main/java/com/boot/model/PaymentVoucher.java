/**
 * 
 */
package com.boot.model;

import java.math.BigDecimal;

/**
 * @author Prashant
 *
 */
public class PaymentVoucher {
	
	private String product_desc;
	private String hcs_Acs;
	private BigDecimal taxable_value;
	private int gst;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentVoucher [product_desc=" + product_desc + ", hcs_Acs=" + hcs_Acs + ", taxable_value="
				+ taxable_value + ", gst=" + gst + ", total_amount=" + total_amount + "]";
	}
}
