/**
 * 
 */
package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.PaymentVoucher;

/**
 * @author Sushant
 *
 */
public interface PaymentVoucherRepository extends JpaRepository<PaymentVoucher, Long>{

}